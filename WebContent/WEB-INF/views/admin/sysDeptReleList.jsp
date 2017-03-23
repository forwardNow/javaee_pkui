<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
	<title>单位管理</title>
	<script type="text/javascript">
	//资源
	var UUR = {
		// 新增
		'sysDeptReleAdd' : '${ctx}/admin/sysDeptReleForm?' + Math.random(),
		// 删除
		'sysDeptReleDelete' : '${ctx}/admin/sysDeptReleDelete?' + Math.random()
	};
	
	//新增单位
	function doSysDeptAdd(){
		var diag = openMidDialog({
			Title : "选择数据归属单位",
			URL : UUR.sysDeptReleAdd + "&deptId=${deptId}",
			OKEvent : function(){
				diag.innerWin["doSelSysDeptRele"]();
			}
		});
	}
	
	//删除单位 
	function doSysDeptDelete(btn){
		var sel = Pku.getExt("sysDeptReleGrid").getSelectionModel().getSelections();
		if(sel.length > 0){
			Dialog.confirm("确认删除选中记录？", function(){
				var postData = [];
	            for(var i=0;i<sel.length;i++){
	            	postData.push({"deptId":sel[i].get("deptId"),"releDeptId":sel[i].get("releDeptId")});
	            }
	            btn.disable();
	            Pku.Common.ajax(UUR.sysDeptReleDelete,{"txtPost" :  Ext.encode(postData)},function(bln,response,o){
	                btn.enable();
	                var objRet = toJson(response.responseText);
	                if(objRet.success){
	                    Dialog.alert("删除成功");
	                    doSysDeptReleQuery();
	                }else{
	                    Dialog.alert(objRet.message);
	                }
	            });
			});
		}else{
			Dialog.alert("请选择单位");
		}
	}
	
	//查询单位 
	function doSysDeptReleQuery(){
		var txtQuery = Pku.Common.getQueryJson("frmQuery","RELE_DEPT_ID");
		Pku.getExt("sysDeptReleGrid").store.baseParams.txtQuery = txtQuery;
		Pku.getExt("sysDeptReleGrid").store.load();
	}
	
    Pku.onReady(function(){
    	doSysDeptReleQuery();
    });
	</script>
</head>
<body>
	<div id="sysDeptReleGrid" xtype="grid" region="center" pagingBar="true" forceFit="true" border="false">
		<div xtype="tbar">
			<div text="设置数据归属单位" iconCls="icon-add" onExtClick="doSysDeptAdd()" ></div>
			<div text="-"></div>
			<div text="删除数据归属单位" iconCls="icon-delete" onExtClick="doSysDeptDelete()"></div>
			<div text="->"></div>
			<form id="frmQuery" name="frmQuery" method="post">
				<table>
					<tr>
						<td>数据归属单位名称：</td>
						<td><input type="text" fieldname="releDeptName" operation="like" /></td>
					</tr>
				</table>
				<input type="hidden" fieldname="deptId" value="${deptId}"/>
			</form>
			<div text="查询" iconCls="icon-query" onExtClick="doSysDeptReleQuery()"></div>
		</div>
		<div id="sysDeptReleStore" xtype="store" url="${ctx}/admin/sysDeptReleListData" autoLoad="false">
			<div xtype="jsonreader">
				<div name="deptId"></div>
				<div name="releDeptId"></div>
				<div name="releDeptName"></div>
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
