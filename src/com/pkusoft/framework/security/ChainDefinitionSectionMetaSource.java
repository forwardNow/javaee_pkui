package com.pkusoft.framework.security;

import java.text.MessageFormat;
import java.util.Iterator;
import java.util.List;

import org.apache.shiro.config.Ini;
import org.apache.shiro.config.Ini.Section;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.pkusoft.admin.model.SysResource;
import com.pkusoft.admin.model.SysResourceCriteria;
import com.pkusoft.admin.service.SysResourceService;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.util.StringUtils;

/**
 * 权限资源配置
 * @author tanggj
 *
 */
public class ChainDefinitionSectionMetaSource implements
		FactoryBean<Ini.Section> {
	/**
	 * 默认premission字符串
	 */
	public static final String PREMISSION_STRING = "perms[\"{0}\"]";


	private String beforeFilterChainDefinitions;
	private String afterFilterChainDefinitions;
	
	@Autowired
	protected SysResourceService sysResourceService;

	@Override
	public Section getObject() throws Exception {

		StringBuffer buffer = new StringBuffer();
		buffer.append(beforeFilterChainDefinitions); // 加载默认的url
		
		List<SysResource> list = sysResourceService.getListByCriteria(new Criteria<SysResourceCriteria>());
		for (Iterator<SysResource> it = list.iterator(); it.hasNext();) {
			SysResource permit = it.next();
			if (StringUtils.hasText(permit.getResourceName())
					&& StringUtils.hasText(permit.getResourceUrl())) {
				buffer.append("\n");
				buffer.append(permit.getResourceUrl().trim());
				buffer.append("=");
				buffer.append(MessageFormat.format(PREMISSION_STRING, permit.getResourceName().trim()));
			}

		}
		
		buffer.append(afterFilterChainDefinitions);
		
		Ini ini = new Ini();
		ini.load(buffer.toString());
		Ini.Section section = ini.getSection(Ini.DEFAULT_SECTION_NAME);
		return section;
	}

    /**
     * 前置url过滤定义
     * 
     * @param beforeFilterChainDefinitions
     */
    public void setBeforeFilterChainDefinitions(String beforeFilterChainDefinitions) {
        this.beforeFilterChainDefinitions = beforeFilterChainDefinitions;
    }
    
    /**
     * 后置url过滤定义
     * @param afterFilterChainDefinitions
     */
    public void setAfterFilterChainDefinitions(String afterFilterChainDefinitions) {
    	this.afterFilterChainDefinitions = afterFilterChainDefinitions;
    }

    
	@Override
	public Class<?> getObjectType() {
		return this.getClass();
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

}
