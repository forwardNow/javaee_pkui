package com.pkusoft.admin.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.admin.model.SysError;

/**
 * 
 * @author 
 */
@Repository
public interface SysErrorMapper extends BaseMapper<SysError>{
	
	List<SysError> getSysErrorList();
	
}