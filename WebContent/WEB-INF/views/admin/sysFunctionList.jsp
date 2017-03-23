<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
	<title>用户管理</title>
	<script type="text/javascript">
	//资源
	var UUR = UserUrlResource = {
        // 新增
        'sysFunctionAdd' : '${ctx}/admin/sysFunctionForm?' + Math.random(),
        // 修改
        'sysFunctionUpdate' : '${ctx}/admin/sysFunctionForm?' + Math.random(),
        // 删除
        'sysFunctionDelete' : '${ctx}/admin/sysFunctionDelete?' + Math.random(),
        //高级查询
        'sysFunctionQuery'  : '${ctx}/admin/sysFunctionAdvQuery?' + Math.random(),
     // 生成字典文件
		'sysFunctionListXml' : '${ctx}/admin/sysFunctionCreateXmlForm?' + Math.random()
	};
	
	//新增功能号
	function doAddSysFunction(){
		var diag = new Dialog();
	    diag.Width =440;
        diag.Height = 440;
        diag.Title = "新增功能号";
        diag.URL = UUR.sysFunctionAdd;
        diag.OKEvent = function(){
            diag.innerWin["doSaveSysFunction"]();
        }
        diag.show();
	}
	
	//修改功能号 
	function doUpdateSysFunction(){
        var sel = Pku.getExt("sysFunctionGrid").getSelectionModel().getSelections();
        if(sel.length == 1){
            var functionId = sel[0].get("functionId");
            var diag = new Dialog();
    	    diag.Width =440;
            diag.Height = 440;
            diag.Title = "修改功能号";
            diag.URL = UUR.sysFunctionUpdate + "&functionId=" + functionId;
            diag.OKEvent = function(){
                diag.innerWin["doSaveSysFunction"]();
            }
            diag.show();
        }else{
            Dialog.alert("请选中一条记录");
        }
	}
	
	//删除功能号
	function doDeleteSysFunction(btn){
        var sel = Pku.getExt("sysFunctionGrid").getSelectionModel().getSelections();
        if(sel.length > 0){
            Dialog.confirm("确认删除选中记录？", function(){
                var urlParams = "";
                for ( var i = 0;i < sel.length;i++ ){
                    urlParams += "&functionId=" + sel[i].get("functionId");
                }
                btn.disable();
                Pku.Common.ajax(UUR.sysFunctionDelete + urlParams,{},function(bln,response,o){
                    btn.enable();
                    var objRet = toJson(response.responseText);
                    if(objRet.success){
                        Dialog.alert("删除成功");
                        doSysFunctionQuery();
                    }else{
                        Dialog.alert(objRet.message);
                    }
                });
            });
        }else{
            Dialog.alert("请选中记录");
        }
	}
	
	//查询功能号
	function doSysFunctionQuery(){
        Pku.getExt("sysFunctionGrid").store.baseParams.functionCode = document.frmQuery.functionCode.value;
        Pku.getExt("sysFunctionGrid").store.load();
	}
	
	//状态渲染
	function userStatusRender(v) {
		/*
		if ( v == "1" ) {
			return '<img height="16" src="${ctx}/static/images/icons/icon021a2.gif" title="正常" />';
		} else {
			return '<img height="16" src="${ctx}/static/images/icons/icon021a3.gif" title="停用" />';
		}
		*/
		return (v === "1") ?  "正常" : "<font color='red'>停用</font>";
	}
	
    //双击行
    function onRowdblclick(data){
        var functionId = data["functionId"];
        var diag = new Dialog();
	    diag.Width =440;
        diag.Height = 440;
        diag.Title = "修改功能号";
        diag.URL = UUR.sysFunctionUpdate + "&functionId=" + functionId;
        diag.OKEvent = function(){
            diag.innerWin["doSaveSysFunction"]();
        }
        diag.show();
    }
    
    //生成字典文件
    function doSysFunctionDic(){
    	Dialog.confirm("确认生成字典", function(){
	        Ext.MessageBox.show({
	     		msg: '正在生成字典文件, 请稍候...',
	     	    progressText: '生成...',
	     	    width:300,
	     	    wait:true,
	     	    waitConfig: {interval:70},
	     	    icon:'ext-mb-download', //custom class in msg-box.html
	     	    animEl: 'pkucmp_autoBtn'
	     	});
			Pku.Common.ajax(UUR.sysFunctionListXml,{},function(bln,response,o){
				var objRet = toJson(response.responseText);
				if(objRet.success){
					Ext.MessageBox.hide() ;
					Dialog.alert("生成成功");
					
				}else{
					Ext.MessageBox.hide() ;
					Dialog.alert("生成失败！") ;
				}
			});
        });
    }
	</script>
</head>
<body>
	<div id="sysFunctionGrid" title="功能号管理" iconCls="icon-window" xtype="grid" region="center" pagingBar="true" forceFit="true" border="false" onExtRowdblclick="onRowdblclick()">
		<div xtype="tbar">
			<div text="新增" iconCls="icon-add" onExtClick="doAddSysFunction()" ></div>
			<div text="-"></div>
			<div text="修改" iconCls="icon-update" onExtClick="doUpdateSysFunction()"></div>
			<div text="-"></div>
			<div text="删除" iconCls="icon-delete" onExtClick="doDeleteSysFunction()"></div>
			<div text="-"></div>
			<div text="生成字典文件" iconCls="icon-dic" onExtClick="doSysFunctionDic()"></div>
			<div text="->"></div>
			<form id="frmQuery" name="frmQuery" method="post">
				<table>
					<tr>
						<td>功能号：</td>
						<td><input type="text" name="functionCode" /></td> 
					</tr>
				</table>
			</form>
			<div text="查询" iconCls="icon-query" onExtClick="doSysFunctionQuery()"></div>
		</div>
		<div id="sysFunctionStore" xtype="store" url="${ctx}/admin/sysFunctionListData" autoLoad="true">
			<div xtype="jsonreader">
				<div name="functionId"></div>
				<div name="functionCode"></div>
				<div name="functionName"></div>
				<div name="operationType"></div>
				<div name="logType"></div>
				<div name="module"></div>
				<div name="submodule"></div>
			</div>
		</div>
		<div xtype="colmodel">
            <div type="checkbox"></div>
		 	<div header="功能号" width="100" sortable="true" dataIndex="functionCode"></div>
		 	<div header="功能名" width="120" sortable="true" dataIndex="functionName"></div>
		 	<div header="操作类型" width="80" sortable="true" dataIndex="operationType" kind="dic" src="DIC_OPERATE_TYPE"></div>
		  	<div header="日志类型" width="120" sortable="true" dataIndex="logType" kind="dic" src="DIC_LOG_TYPE"></div>
		  	<div header="模块" width="150" sortable="true" dataIndex="module" kind="dic" src="DIC_MODULE"></div>
		  	<div header="子模块" width="150" sortable="true" dataIndex="submodule" kind="dic" src="DIC_SUB_MODULE"></div>
		</div>
     </div>
</body>
</html>
