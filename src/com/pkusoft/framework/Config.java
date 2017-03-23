package com.pkusoft.framework;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

import org.springframework.util.StringUtils;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.pkusoft.framework.license.AbstractLicenseInfo;
import com.pkusoft.framework.util.AppClassLoader;

/**
 * 配置信息
 * @author tanggj
 *
 */
public class Config {
	private static Config instance; 
	private static Map<String,String> configMap = new HashMap<String,String>();
	private static Object mutex = new Object();
	private static long lastUpdateTime = 0L;
	private static long refershPeriod = 60000L;
	private static String licenseName = "license.dat";
	
	private Config() {
		init();
	}
	
	/**
	 * 获取实例，并初始化配置
	 * @return 实例
	 */
	public static Config getInstance() {
		if(instance == null){
			instance = new Config();
		}
		return instance;
	}
	
	/**
	 * 初始化
	 */
	private void init() {
		// 大于一分钟
		if (System.currentTimeMillis() - lastUpdateTime > refershPeriod){
			synchronized (mutex){
				configMap.put("App.ClassesPath", getClassesPath());
				configMap.put("App.ContextRealPath", getContextRealPath());
				configMap.put("App.ContextPath", getContextPath());
				
				configMap.put("System.JavaVersion", System.getProperty("java.version"));
				configMap.put("System.JavaVendor", System.getProperty("java.vendor"));
				configMap.put("System.JavaHome", System.getProperty("java.home"));
				configMap.put("System.OSPatchLevel", System.getProperty("sun.os.patch.level"));
				configMap.put("System.OSArch", System.getProperty("os.arch"));
				configMap.put("System.OSVersion", System.getProperty("os.version"));
				configMap.put("System.OSName", System.getProperty("os.name"));
				configMap.put("System.OSUserLanguage", System.getProperty("user.language"));
				configMap.put("System.OSUserName", System.getProperty("user.name"));
				configMap.put("System.LineSeparator", System.getProperty("line.separator"));
				configMap.put("System.FileSeparator", System.getProperty("file.separator"));
				configMap.put("System.FileEncoding", System.getProperty("file.encoding"));
				
				// 加载数据库配置
				loadDbConfig();
				
				// 加载license
				loadLicense();
				
				lastUpdateTime = System.currentTimeMillis();
			}
		}
	}

	/**
	 * 加载数据库配置
	 */
	private void loadDbConfig() {
		WebApplicationContext context = ContextLoader.getCurrentWebApplicationContext();
		/*SysConfigMapper mapper = (SysConfigMapper)context.getBean(SysConfigMapper.class);
		Criteria<SysConfigCriteria> criteria = new Criteria<SysConfigCriteria>();
		List<SysConfig> list = mapper.selectByCriteria(criteria);
		SysConfig config = null;
		for (int i = 0; i < list.size(); i++) {
			config = list.get(i);
			configMap.put(config.getConfigName(), config.getConfigValue());
		}*/
	}
	
	/**
	 * 加载license
	 */
	private void loadLicense(){
		try {
			Class clazz = new AppClassLoader().loadClass("com.pkusoft.framework.license.LicenseInfo");
			Method method = clazz.getMethod("getInstance");
			AbstractLicenseInfo licInfo = (AbstractLicenseInfo)method.invoke(null);
			configMap.put("App.LicenseInstance", "true");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Load lincense error.");
		}
	}
	
	/**
	 * 更新配置
	 */
	public void update() {
		init();
	}
	
	/**
	 * 获取配置map值
	 * @param configName
	 * @return 配置值
	 */
	public String getMapValue(String configName) {
		return configMap.get(configName);
	}
	
	/**
	 * 设置配置
	 * @param configName
	 * @param configValue
	 */
	public void setMapValue(String configName,String configValue){
		configMap.put(configName, configValue);
	}
	
	/**
	 * 获取配置map值，等同于instance.getMapValue()
	 * @param configName
	 * @return 配置值
	 */
	public static String getValue(String configName) {
		return getInstance().getMapValue(configName);
	}
	
	/**
	 * 获取配置map值，等同于instance.setMapValue()
	 * @param configName
	 * @return
	 */
	public static void setValue(String configName,String configValue) {
		getInstance().setMapValue(configName,configValue);
	}
	
	/**
	 * 获取环境路径
	 * @return 环境路径
	 */
	public static String getClassesPath() {
		String str = configMap.get("App.ClassesPath");
		if (StringUtils.hasText(str)) {
			return str;
		}

		URL url = Thread.currentThread().getContextClassLoader().getResource(licenseName);
		if (url == null) {
			throw new RuntimeException("未找到" + licenseName);
		}
		try {
			String path = URLDecoder.decode(url.getPath(), "UTF-8");
			if (System.getProperty("os.name").toLowerCase().indexOf("windows") >= 0) {
				if (path.startsWith("/")) {
					path = path.substring(1);
				} else if (path.startsWith("file:/")) {

					path = path.substring(6);
				}
			} else if (path.startsWith("file:/")) {
				path = path.substring(5);
			}
			return path.substring(0, path.lastIndexOf("/"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 获取上下文物理路径
	 * @return 上下文物理路径
	 */
	public static String getContextRealPath() {
		String str = configMap.get("App.ContextRealPath");
		if (StringUtils.hasText(str)) {
			return str;
		}

		String path = getClassesPath();
		int index = path.indexOf("/WEB-INF");
		if (index > 0) {
			path = path.substring(0, index);
		}
		return path;
	}
	
	/**
	 * 获取上下文路径
	 * @return 上下文路径
	 */
	public static String getContextPath() {
		String str = configMap.get("App.ContextPath");
		if (StringUtils.hasText(str)) {
			return str;
		}
		
		WebApplicationContext context = ContextLoader.getCurrentWebApplicationContext();
		return context.getServletContext().getContextPath();
	}
	
}
