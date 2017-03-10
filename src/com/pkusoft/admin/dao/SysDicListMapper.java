package com.pkusoft.admin.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.admin.model.SysDicList;

/**
 * 
 * @author 
 */
@Repository
public interface SysDicListMapper extends BaseMapper<SysDicList>{
	
	List<String> sysDicListXml();
}