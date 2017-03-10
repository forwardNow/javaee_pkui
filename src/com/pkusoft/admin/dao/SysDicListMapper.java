package com.pkusoft.admin.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pkusoft.admin.model.SysDicList;
import com.pkusoft.framework.dao.BaseMapper;

/**
 * 系统字典列表数据访问
 * @author 
 */
@Repository
public interface SysDicListMapper extends BaseMapper<SysDicList>{
	List<String> sysDicListXml();
}