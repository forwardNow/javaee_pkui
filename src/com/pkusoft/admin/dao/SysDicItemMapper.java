package com.pkusoft.admin.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pkusoft.admin.model.SysDicItem;
import com.pkusoft.framework.dao.BaseMapper;

/**
 * 系统字典条目数据访问
 * @author 
 */
@Repository
public interface SysDicItemMapper extends BaseMapper<SysDicItem>{

	List<SysDicItem> getSysDicItemXmlByDicname( String dicName );
	
}