package com.pkusoft.framework.license;

import java.util.Date;
import java.util.Properties;

/**
 * 抽象的License信息
 * @author tanggj
 *
 */
public abstract class AbstractLicenseInfo {
	public abstract Properties getProperties();
	
	public abstract String getCode();

	public abstract String getName();

	public abstract String getProduct() ;

	public abstract int getUserLimit() ;

	public abstract Date getEndDate(); 

	public abstract String getMacAddress() ;
	
	public abstract boolean isIPValidity();
	
	public abstract boolean isLicenseValidity() ;
	
	public abstract boolean isUserCountValidity() ;
	
}
