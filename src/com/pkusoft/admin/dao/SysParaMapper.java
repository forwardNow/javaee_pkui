package com.pkusoft.admin.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.admin.model.SysPara;

/**
 * 
 * @author 
 */
@Repository
public interface SysParaMapper extends BaseMapper<SysPara>{
	String getMaxParaCode ();
}