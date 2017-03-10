Oracle 转 MySQL 步骤：
-------------------

1. 使用指定数据库

	USE PKUI;

2. 界定符
	 
	查找		"
	替换		`

3. 如果存在该表，则删除

	DROP TABLE IF EXISTS 	`xxxx`;
	
4. 添加字段注释

	1）调整表字段，每行一字段
	2）多行编辑
	
5. 字段类型转换

	1）整形
		
		NUMBER(16,0) ==> INT(16)
		
	2）字符串
	
		VARCHAR2(64CHAR) ==> VARCHAR(64)
			
	3）日期
	
		DATE ==> DATETIME
			
6. 主键和表注释

	CREATE TABLE `SYS_DEPT` (
		... 	 
		
	    ,PRIMARY KEY (`xxx`)
	)  DEFAULT CHARSET=UTF8 COMMENT='表的注释';	
	
		
7. insert语句修改

	TO_DATE('2016-05-05 12:02:05','YYYY-MM-DD HH24:MI:SS')
	
	==>
	
	STR_TO_DATE('2016-05-05 12:01:45','%Y-%m-%d %H:%i:%s')



8. 是否为空值

	Oracle：NVL(待检测值, 如果是空值则使用的替代值)
	MySQL ：IFNULL(待检测值, 如果是空值则使用的替代值)


		