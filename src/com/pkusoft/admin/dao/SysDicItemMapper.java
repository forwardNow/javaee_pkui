package com.pkusoft.admin.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.admin.model.SysDicItem;

/**
 * 
 * @author 
 */
@Repository
public interface SysDicItemMapper extends BaseMapper<SysDicItem>{
	List<SysDicItem> getListByParentDic(Map<String,Object> params);
	
	// 获取最大字典条目标识号
	Long getMaxItemId();
	
	List<SysDicItem> getListByDicNameAndItemValue(SysDicItem sysDicItem);
	
	// 生成字典文件
	List<SysDicItem> getSysDicItemXmlByDicname(String dicName);
}