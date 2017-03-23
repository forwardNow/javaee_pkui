<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
	<title>高级查询</title>
	<style>
	
	.psa{position:absolute;}.psr{position:relative;}
	.ft{float: left; padding-right: 3px;}
	.dinl{display:inline-block;}
	
	.log-form{
		padding:15px;
		font-size:12px;
	}
	.log-form{
	   padding:15px;
	   font-size:12px;
	}
	.log-form div{
	   height:30px;
	}
	.log-form label{
	   display:inline-block;
	   width:100px;
	   text-align:right;
	}
	.log-form label span{
	   color:red;
	}
	</style> 
	<script type="text/javascript">
	</script>
</head>
<body>
	<form id="sysLogAdvQryFrm" name="sysLogAdvQryFrm" >
        <div class="log-form">
			 	<div class="">
	                <label>登录帐号：</label>
	                <input id="loginName" type="text" maxlength="30"  />
	           	</div>
	            <div>
			        <div class="ft">
			            <label>单位名称：</label>
			       	</div>
			        <div>
			             <input id="deptName" type="text"  maxlength="64" kind="dic" src="DIC_DEPT" />
		            </div>
	          	</div>	
	           <div>
	           		<div class="ft">
	         			<label>日志类型：</label>
	         		</div>
	         		<div>
	             		<input id="logType" type="text" maxlength="6"  kind="dic" src="DIC_LOG_TYPE"/>
	             	</div>
	          	</div>
	           	<div>
	           		<div class="ft">
	           			<label>业务类型：</label>
	         		</div>
	         		<div>
	             		<input id="functionId" type="text"  maxlength="6"  kind="dic" src="DIC_LOG_FUNCTION"/>
	             	</div>
	          	</div>
	          	<div>
	          		<div class="ft">
	           			<label>操作类型：</label>
	           		</div>
	          		<div>
	             		<input id="operType" type="text" name="visiable" maxlength="6" kind="dic" src="DIC_OPERATE_TYPE"/>
	           		</div>
	            </div>
	            <div>
	          		<div class="ft">
	              		<label>开始时间：</label>
	           		</div>
	          		<div>
	             		<input id="beginTime" type="text" name="beginTime" maxlength="30" kind="date"/>
	           		</div>
	            </div>
	            <div>
	          		<div class="ft">
	             	 	<label>结束时间：</label>
	           		</div>
	          		<div>
	             		<input id="endTime" type="text" name="endTime"  maxlength="30" kind="date"/>
	           		</div>
	            </div>
		</div>
	</form>
</body>
</html>
