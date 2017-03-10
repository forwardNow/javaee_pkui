
USE PKUI;
DROP PROCEDURE IF EXISTS PMAXID_A;

delimiter $$  
CREATE PROCEDURE `PMAXID_A`(
	in strIdType VARCHAR(6),
    out intMaxId INT,
    out strMaxId VARCHAR(16),
    out strMaxFullId VARCHAR(16)
    )  
BEGIN
     
	declare intExist int; -- 判断编号是否已经存在
    declare intMinValue int; -- 范围.最小编号
    declare intCurrId int; -- 当前id
    declare intSize int; -- 该最大编号类型的长度
    
    
	-- 获取编号的最小值
	SELECT ID_BEGIN,
			ID_SIZE
	INTO intMinValue,
		 intSize
	FROM SYS_MAX_ID_TYPE
	WHERE ID_TYPE = strIdType;
    
    -- 确定该 最大编号类型 是否已经存在
	SELECT COUNT(ID_TYPE)
	INTO intExist
	FROM SYS_MAX_ID
	WHERE  
		ID_TYPE = strIdType
		AND ID_PARA1    = '0'
		AND ID_PARA2    = '0';
    

    

	if intExist = 0 then -- 如果 最大编号类型 不存在，则最大编号为初始值ID_BEGIN
		set intCurrId = intMinValue;
        INSERT INTO SYS_MAX_ID
			(ID_TYPE, ID_PARA1, ID_PARA2, ID_CURR_VALUE)
		VALUES
			(strIdType, '0', '0', intCurrId);
            
    else -- 如果 最大编号类型 存在，则获取当前最大编号值，然后加1，最后更新
		SELECT ID_CURR_VALUE
		INTO   intCurrId
		FROM   SYS_MAX_ID
		WHERE  ID_TYPE = strIdType;
        
        set intCurrId = intCurrId + 1;
        
         -- 更新最大编号表
		UPDATE SYS_MAX_ID
		SET    ID_CURR_VALUE  = intCurrId
		WHERE  ID_TYPE = strIdType
				AND    ID_PARA1    = '0'
				AND    ID_PARA2    = '0';
        
    end if;

    
  -- 提交改变
  COMMIT;

  -- 输出最大编号
  set intMaxId = intCurrId;
  set strMaxId = LPAD(CONCAT(intCurrId, ''), intSize, '0');
  set strMaxFullId = strMaxId;
    
  -- select intMaxId, strMaxId, strMaxFullId;
    
END$$PMAXID_A



-- 调用存储过程  
call PMAXID_A('100001', @intMaxId, @strMaxId, @strMaxFullId);  

