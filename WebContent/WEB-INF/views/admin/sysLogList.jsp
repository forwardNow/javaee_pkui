<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
	<title>日志管理</title>
	<script type="text/javascript">
	//链接资源
	var UUR =  {
		//高级查询
		'sysLogAdvQuery' : '${ctx}/admin/sysLogAdvQuery?random=' + Math.random(),
		//删除日志
		'sysLogDelete' : '${ctx}/admin/sysLogDelete?random=' + Math.random(),
		//删除日志(根据日志编号)
		'deleteSysLogByIds' : '${ctx}/admin/sysLogDeleteByIds?random=' + Math.random(),
		//删除全部
		'sysLogDeleteAll' : '${ctx}/admin/sysLogDeleteAll?random=' + Math.random()
	};
	  
	//删除日志
	function doSysLogDelete(data){
		if(data=="0"){
			var sel = Pku.getExt("sysLogGrid").getSelectionModel().getSelections();
			if(sel.length > 0){
				Dialog.confirm("确认删除选中记录？", function(){
		            var urlParams = "";
		            for(var i=0;i<sel.length;i++){
		                urlParams += "&logId=" + sel[i].get("logId");
		            }
		            Pku.Common.ajax(UUR.deleteSysLogByIds + urlParams,{},function(bln,response,o){
		                var objRet = toJson(response.responseText);
		                if(objRet.success){
		                    Dialog.alert("删除成功",function(){
		                    reloadLog();		                    	
		                    });
		                }else{
		                    Dialog.alert(objRet.message);
		                }
		            });
				});
			}else{
				Dialog.alert("请选中记录");
			}
		}else{
			var month = data;
			Dialog.confirm("将会删除"+month+"个月内的日志，确定删除吗？", function(){
				Pku.Common.ajax(UUR.sysLogDelete+"&month="+month,{},function(bln,response,o){
					var objRet = toJson(response.responseText);
					if(objRet.success){
						Dialog.alert("删除成功",function(){
							reloadLog();		                    	
	                    });

					}else{
						Dialog.alert(objRet.message);
					}
				});			
			});
		}
	}
	
	//删除全部日志
	function doSysLogDeleteAll(){
		Dialog.confirm("将会删除掉全部的日志，确定删除吗？", function(){
			Pku.Common.ajax(UUR.sysLogDeleteAll,{},function(bln,response,o){
				var objRet = toJson(response.responseText);
				if(objRet.success){
					Dialog.alert("删除成功",function(){
					reloadLog();		                    	
                    });
				}else{
					Dialog.alert(objRet.message);
				}
			});
		});
	}

	
	//查询
	function doSysLogQuery(){
        Pku.getExt("sysLogGrid").store.baseParams.loginName = "";
        Pku.getExt("sysLogGrid").store.baseParams.deptName = "";
        Pku.getExt("sysLogGrid").store.baseParams.logType = "";
        Pku.getExt("sysLogGrid").store.baseParams.functionId = "";
        Pku.getExt("sysLogGrid").store.baseParams.operType = "";
        
        Pku.getExt("sysLogGrid").store.baseParams.loginName = document.frmQuery.loginName.value;
        reloadLog();
	}
	
	//高级查询
	function doSysLogAdvQuery(){	
		 var diag = openMidDialog({
	            Title : "高级查询",
	            URL : UUR.sysLogAdvQuery,
	            OKEvent : function(){
	                var qryFrm = diag.innerFrame.contentWindow.document.sysLogAdvQryFrm;
	                Pku.getExt("sysLogGrid").store.baseParams.loginName = qryFrm.loginName.value;
	                Pku.getExt("sysLogGrid").store.baseParams.deptName = qryFrm.deptName.value;
	                Pku.getExt("sysLogGrid").store.baseParams.logType = qryFrm.logType.code;
	                Pku.getExt("sysLogGrid").store.baseParams.functionId = qryFrm.functionId.code;
	                Pku.getExt("sysLogGrid").store.baseParams.operType = qryFrm.operType.code;
	                
	                var beginTime = qryFrm.beginTime.value;
	                var endTime = qryFrm.endTime.value;
	                Pku.getExt("sysLogGrid").store.baseParams.logInfo = beginTime;
	                Pku.getExt("sysLogGrid").store.baseParams.logTime = endTime;
	            	Pku.getExt("sysLogGrid").store.load();
	    	    	Dialog.close();
	            }
	        });
		
	}
	
	//重新加载日志
	function reloadLog(){
		Pku.getExt("sysLogGrid").store.load();
	}
	</script>
</head>
<body>
	<div id="sysLogGrid" title="日志管理列表" iconCls="icon-window" xtype="grid" region="center" pagingBar="true" forceFit="true" border="false">
		<div xtype="tbar">			
			<div text="删除" iconCls="icon-delete">
				 <div text="选中记录" onExtClick="doSysLogDelete(0)"></div>
		         <div text="一个月" onExtClick="doSysLogDelete(1)"></div>
		         <div text="三个月" onExtClick="doSysLogDelete(3)"></div>
		         <div text="六个月" onExtClick="doSysLogDelete(6)"></div>
		         <div text="今年" onExtClick="doSysLogDelete(12)"></div>
		    </div> 
			<div text="-"></div>
			<div text="删除全部" iconCls="icon-delete" onExtClick="doSysLogDeleteAll()"></div>
			<div text="-"></div>
			<div text="高级查询" iconCls="icon-adv-query" onExtClick="doSysLogAdvQuery()"></div>
			<div text="->"></div>
			<form id="frmQuery" name="frmQuery" method="post">
				<table>
					<tr>
						<td>登陆账号：</td>
						<td><input type="text" name="loginName" /></td>
					</tr>
				</table>
			</form>
			<div text="查询" iconCls="icon-query" onExtClick="doSysLogQuery()"></div>
		</div>
		<div id="sysLogStore" xtype="store" url="${ctx}/admin/sysLogListData" autoLoad="true">
			<div xtype="jsonreader">
				<div name="logId"></div>
				<div name="logInfo"></div>
				<div name="loginName"></div>
				<div name="deptName"></div>
				<div name="logInfo"></div>
				<div name="logType"></div>
				<div name="functionId"></div>
				<div name="operType"></div>
				<div name="logTime"></div>
				<div name="ip"></div>
			</div>
		</div>
		<div xtype="colmodel">
			<div type="checkbox"></div>
		 	<div header="登陆账号" width="80" sortable="true" dataIndex="loginName"></div>
		 	<div header="单位名称" width="150" sortable="true" dataIndex="deptName"></div>
		  	<div header="日志数据说明" width="200" sortable="true" dataIndex="logInfo"></div>
		  	<div header="日志类型" width="100" sortable="true" dataIndex="logType" kind="dic" src="DIC_LOG_TYPE"></div>
		  	<div header="业务类型" width="100" sortable="true" dataIndex="functionId" kind="dic" src="DIC_LOG_FUNCTION"></div>
		  	<div header="操作类型" width="100" sortable="true" dataIndex="operType" kind="dic" src="DIC_OPERATE_TYPE"></div>
		  	<div header="记录时间" width="80" sortable="true"  dataIndex="logTime" renderer="dateRender"></div>
		  	<div header="访问地址" width="150" sortable="true" dataIndex="ip"></div>
		</div>
   </div>
</body>
</html>
