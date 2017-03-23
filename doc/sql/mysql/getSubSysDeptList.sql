CREATE FUNCTION `getSubSysDeptList` (rootId VARCHAR(12))
	RETURNS VARCHAR(20000)
BEGIN
	DECLARE pTemp VARCHAR(20000); 
	DECLARE cTemp VARCHAR(20000);
	
	SET pTemp = '$';  
    SET cTemp =rootId;  
	  
	WHILE cTemp is not null DO  

		 SET pTemp = concat(pTemp,',',cTemp);  -- 把所有节点连接成字符串。
		 
		 SELECT group_concat( DEPT_ID ) INTO cTemp 
		 FROM SYS_DEPT   
		 WHERE FIND_IN_SET( PARENT_DEPT_ID ,cTemp)>0; 
			
				
	END WHILE;  
	RETURN pTemp; 
END
