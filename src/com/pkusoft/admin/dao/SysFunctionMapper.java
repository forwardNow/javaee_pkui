package com.pkusoft.admin.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.admin.model.SysFunction;

/**
 * 
 * @author 
 */
@Repository
public interface SysFunctionMapper extends BaseMapper<SysFunction>{
	
	List<SysFunction> getSysFunctionList();
}