package com.pkusoft.admin.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.admin.model.SysMaxId;

/**
 * 
 * @author 
 */
@Repository
public interface SysMaxIdMapper extends BaseMapper<SysMaxId>{
	List<SysMaxId> getByPara1(Object Object);
	
	SysMaxId getSysMaxIdDetail(SysMaxId sysMaxId);
}