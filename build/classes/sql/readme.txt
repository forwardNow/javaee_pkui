Oracle 转 MySQL
-------------------

1. 表名界定符

	区别：
	
		Oracle："SYS_DIC_ITEM"
		
		MySQL：`SYS_DIC_ITEM`
		
	转换：
		
		查找“ "SYS_DIC_ITEM" ”， 替换为“ `SYS_DIC_ITEM` ”

2. 整数类型

	区别：
	
		Oracle：NUMBER(16,0)
		
		MySQL：INT(16)
		
	转换：
		
		查找“ NUMBER(16,0) ”， 替换为“ INT(16) ”
	
	
3. 字符串类型

	区别：
	
		Oracle：VARCHAR2(64CHAR)
		
		MySQL：VARCHAR(64)
		
	转换：
		
		查找“ VARCHAR2( ”， 替换为“ VARCHAR( ”；
		查找“ CHAR) ”， 替换为“ ) ”

4. 日期类型


	区别：
	
		Oracle：DATE
		
		MySQL：DATETIME
		
	转换：
		
		查找“ DATE ”， 替换为“ DATETIME ”
	
	

5. 字符串转日期

	区别：
	
		Oracle：TO_DATE('2016-05-05 12:02:05','YYYY-MM-DD HH24:MI:SS')
		
		MySQL：STR_TO_DATE('2016-05-05 12:01:45','%Y-%m-%d %H:%i:%s')
		
	转换：
		
		查找“ TO_DATE( ”， 替换为“ STR_TO_DATE( ”；
		查找“ 'YYYY-MM-DD HH24:MI:SS') ”， 替换为“ '%Y-%m-%d %H:%i:%s') ”


		