<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
	<title>资源管理</title>
	<script type="text/javascript">
	//链接资源
	var UUR =  {
		//新增页面
		'sysResourceAdd' : '${ctx}/admin/sysResourceForm?random=' + Math.random(),
		//修改页面
		'sysResourceUpdate' : '${ctx}/admin/sysResourceForm?random=' + Math.random(),
		//删除页面
		'sysResourceDelete' : '${ctx}/admin/sysResourceDelete?random=' + Math.random()
	};
	
	//新增资源
	function doSysResourceAdd(){
		var diag = openMidDialog({
			Title : "新增资源",
			URL : UUR.sysResourceAdd,  
			OKEvent : function(){
				diag.innerWin["doSaveSysResource"]();
			}
		});
	}
	
	//修改资源
	function doSysResourceUpdate(){
		var sel = Pku.getExt("sysResourceGrid").getSelectionModel().getSelections();
		if(sel.length == 1){ 
			var resourceId = sel[0].get("resourceId");
			var diag = openMidDialog({
				Title : "修改资源",
				URL : UUR.sysResourceUpdate + "&resourceId=" + resourceId,
				OKEvent : function(){
					diag.innerWin["doSaveSysResource"]();
					Dialog.alert("修改成功！");
				}
			});
		}else{
			Dialog.alert("请选中一条记录！");
		}
	}
	
	
	//删除资源
	function doDeleteSysResource(btn){
		var sel = Pku.getExt("sysResourceGrid").getSelectionModel().getSelections();
		if(sel.length > 0){
			Dialog.confirm("确认删除选中记录？", function(){
				var urlParams = "";
				for(var i=0;i<sel.length;i++){
					urlParams += "&resourceId=" + sel[i].get("resourceId");
				}
				btn.disable();
				Pku.Common.ajax(UUR.sysResourceDelete + urlParams,{},function(bln,response,o){
					btn.enable();
					var objRet = toJson(response.responseText);
					if(objRet.success){
						Dialog.alert("删除成功");
						reloadResource();
					}else{
						Dialog.alert(objRet.message);
					}
				});
			});
		}else{
			Dialog.alert("请选中记录！");
		}
	}
	
	//资源查询
	function doSysResourceQuery(){
        Pku.getExt("sysResourceGrid").store.baseParams.resourceName = document.frmQuery.resourceName.value;
        reloadResource();
	}
	
	
	//重新加载数据
	function reloadResource(){
		Pku.getExt("sysResourceGrid").store.load();
	}
	
	//双击行
    function onRowdblclick(data){
        var resourceId = data["resourceId"];
		var diag = openMidDialog({
			Title : "修改管理单位",
			URL : UUR.sysResourceUpdate + "&resourceId=" + resourceId,
			OKEvent : function(){
				diag.innerWin["doSaveSysResource"]();
			}
		});
    }
	</script>
</head>
<body>
	<div id="sysResourceGrid" title="资源管理列表" iconCls="icon-window" onExtRowdblclick="onRowdblclick()" xtype="grid" region="center" pagingBar="true" forceFit="true" border="false" >
		<div xtype="tbar">
			<div text="新增" iconCls="icon-add" onExtClick="doSysResourceAdd()" ></div>
			<div text="-"></div>
			<div text="修改" iconCls="icon-update" onExtClick="doSysResourceUpdate()"></div>
			<div text="-"></div>
			<div text="删除" iconCls="icon-delete" onExtClick="doDeleteSysResource()"></div>
			<div text="->"></div>
			<form id="frmQuery" name="frmQuery" method="post">
				<table>
					<tr>
						<td>资源名称：</td>
						<td><input type="text" name="resourceName" /></td>
					</tr>
				</table>
			</form>
			<div text="查询" iconCls="icon-query" onExtClick="doSysResourceQuery()"></div>
		</div>
		<div id="sysResourceStore" xtype="store" url="${ctx}/admin/sysResourceListData"  autoLoad="true">
			<div xtype="jsonreader">
				<div name="resourceId"></div>
				<div name="resourceName"></div>
				<div name="resourceLevel"></div>
				<div name="resourceUrl"></div>
				<div name="menuId"></div>
				<div name="resourceDesc"></div>
			</div>
		</div>
		<div xtype="colmodel">
			<div type="checkbox"></div>
		 	<div header="资源名称" width="100" sortable="true" dataIndex="resourceName"></div>
		  	<div header="资源菜单" width="100" sortable="true" dataIndex="menuId" kind="dic" src="DIC_MENU"></div>
		  	<div header="资源描述" width="150" sortable="true" dataIndex="resourceDesc"></div>
		  	<div header="资源路径" width="150" sortable="true" dataIndex="resourceUrl"></div>
		</div>
     </div>
</body>
</html>
