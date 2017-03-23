<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
	<title>单位管理</title>
	<script type="text/javascript">
	//资源
	var UUR = {
		// 新增
		'sysDeptReleAdd' : '${ctx}/admin/sysDeptReleSave?' + Math.random()
	};
	
	/**
	 * 异步调用ajax，成功后返回值，作为回调函数的参数 调用失败会提示
	 * 
	 * @param {}
	 *            urlStr
	 * @param {}
	 *            paramsObj
	 * @param {}
	 *            callbackFunc
	 */
	function ajaxCall(urlStr, paramsObj, callbackFunc) {
		Ext.Ajax.request({
					url : urlStr,
					params : paramsObj,
					method : 'POST',
					success : function(response) {
						if (callbackFunc) {
							var result = Ext.util.JSON
									.decode(response.responseText);
							var cbfn = callbackFunc.createCallback(result);
							cbfn();
						}
					},
					failure : function() {
						Dialog.alert("方法调用失败，请重试");
					}
				});
	}

	
	//选择数据归属单位
	function doSelSysDeptRele(){
		var sel = Pku.getExt("sysDeptGrid").getSelectionModel().getSelections();
		if(sel.length > 0){
            var postData = [];
            for(var i=0;i<sel.length;i++){
            	postData.push({"deptId":"${deptId}","releDeptId":sel[i].get("releDeptId"), "releDeptName":sel[i].get("releDeptName")});
            }
            ajaxCall(UUR.sysDeptReleAdd,{"txtPost" : Ext.encode(postData)},function(objRet){
                if(objRet.success){
                    ownerDialog.openerWindow["doSysDeptReleQuery"]();
                    Dialog.close();
                }else{
                    Dialog.alert(objRet.message);
                }
            });
		}else{
			Dialog.alert("请选择单位");
		}
	}
	//查询单位 
	function doSysDeptReleQuery(){
		var txtQuery = Pku.Common.getQueryJson("frmQuery","DEPT_ID");
		Pku.getExt("sysDeptGrid").store.baseParams.txtQuery = txtQuery;
		Pku.getExt("sysDeptGrid").store.load();
	}
	
    Pku.onReady(function(){
    	doSysDeptReleQuery();
    });
	</script>
</head>
<body>
	<div id="sysDeptGrid" xtype="grid" region="center" pagingBar="true" forceFit="true" border="false">
		<div xtype="tbar">
			<div text="->"></div>
			<form id="frmQuery" name="frmQuery" method="post">
				<table>
					<tr>
						<td>数据归属单位名称：</td>
						<td><input type="text" fieldname="deptName" operation="like" /></td>
					</tr>
				</table>
				<input type="hidden" fieldname="deptLevel" value="4"/>
			</form>
			<div text="查询" iconCls="icon-query" onExtClick="doSysDeptReleQuery()"></div>
		</div>
		<div id="sysDeptStore" xtype="store" url="${ctx}/admin/sysReleListData" autoLoad="false">
			<div xtype="jsonreader">
				<div name="releDeptId" mapping="deptId"></div>
				<div name="releDeptName" mapping="deptName"></div>
			</div>
		</div>
		<div xtype="colmodel">
			<div type="checkbox"></div>
		 	<div header="数据归属单位编码" width="120" sortable="true" dataIndex="releDeptId"></div>
		 	<div header="数据归属单位名称" width="180" sortable="true" dataIndex="releDeptName"></div>
		</div>
     </div>
</body>
</html>
