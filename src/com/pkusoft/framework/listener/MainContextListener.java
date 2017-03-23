package com.pkusoft.framework.listener;

import javax.servlet.ServletContextEvent;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.pkusoft.framework.Config;
import com.pkusoft.framework.util.WebUtils;

/**
 * 上下文监听器，初始化配置
 * @author tanggj
 *
 */
public class MainContextListener extends org.springframework.web.context.ContextLoaderListener{
	/**
	 * Initialize the root web application context.
	 */
	public void contextInitialized(ServletContextEvent event) {
		super.contextInitialized(event);
		
		// 注入WebApplicationContext
		WebApplicationContext wac = WebApplicationContextUtils.getWebApplicationContext(event.getServletContext());
		WebUtils.setWebApplicationContext(wac);
		
		Config.getInstance().setMapValue("System.ContainerInfo", event.getServletContext().getServerInfo());
		Config.getInstance().setMapValue("System.ContainerStartTime", String.valueOf(System.currentTimeMillis()));
	}
	
	/**
	 * Close the root web application context.
	 */
	public void contextDestroyed(ServletContextEvent event) {
		super.contextDestroyed(event);
	}
	
}
