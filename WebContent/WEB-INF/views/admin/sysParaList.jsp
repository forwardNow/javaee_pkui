<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
	<title>系统参数</title>
	<script type="text/javascript">
	//资源
	var UUR = UserUrlResource = {
		// 新增
		'sysParaAdd' : '${ctx}/admin/sysParaForm?' + Math.random(),
		// 修改
		'sysParaUpdate' : '${ctx}/admin/sysParaUpdateForm?' + Math.random(),
		// 删除
		'sysParaDelete' : '${ctx}/admin/sysParaDelete?' + Math.random()		
	};
	
	//新增系统参数
	function doAddSysPara(){
		var diag = openMinDialog({
			Title : "新增系统参数",
			URL : UUR.sysParaAdd,
			OKEvent : function(){
				diag.innerWin["doSaveSysPara"]();
			}
		});
	}
	
	//修改系统参数 
	function doUpdateSysPara(){
		var sel = Pku.getExt("sysParaGrid").getSelectionModel().getSelections();
		if(sel.length == 1){
			// 不可编辑
			if (sel[0].get("visiable") == '0'){
				Dialog.alert("此项不可编辑");
				return ;
			}
			var paraCode = sel[0].get("paraCode");
			var diag = openMinDialog({
				Title : "修改系统参数",
				URL : UUR.sysParaUpdate + "&paraCode=" + paraCode,
				OKEvent : function(){
					diag.innerWin["doSaveSysPara"]();
				}
			});
		}else{
			Dialog.alert("请选中一条记录");
		}
	}
	
	//删除系统参数
	function doDeleteSysPara(btn){
		var sel = Pku.getExt("sysParaGrid").getSelectionModel().getSelections();
		if(sel.length > 0){
			Dialog.confirm("确认删除？", function(){
				var urlParams = "";
				var flg = false;
				for(var i=0;i<sel.length;i++){
					urlParams += "&paraCode=" + sel[i].get("paraCode");
					// 不可编辑
					if (sel[i].get("visiable") == '0'){
						flg = true ;
					}
				}
				if (flg){
					Dialog.alert("此项不可编辑");
					return ;
				}
				btn.disable();
				Pku.Common.ajax(UUR.sysParaDelete + urlParams,{},function(bln,response,o){
					btn.enable();
					var objRet = toJson(response.responseText);
					if(objRet.success){
						Dialog.alert("删除成功");
						doQuerySysPara();
					}else{
						Dialog.alert(objRet.message);
					}
				});
			});
		}else{
			Dialog.alert("请选中记录");
		}
	}
	
	//查询系统参数
	function doQuerySysPara(){
		Pku.getExt("sysParaGrid").store.baseParams.paraName = document.frmQuery.paraName.value;
		Pku.getExt("sysParaGrid").store.load();
	}
	
	// 双击运行
	function onRowdblclick(data){
        var paraCode = data["paraCode"];
        var visiable = data["visiable"];
        if(visiable == '0'){
        	Dialog.alert("此项不可编辑");
        	return;
        }
		var diag = openMinDialog({
			Title : "修改系统参数",
			URL : UUR.sysParaUpdate + "&paraCode=" + paraCode,
			OKEvent : function(){
				diag.innerWin["doSaveSysPara"]();
			}
		});
	}
	</script>
</head>
<body>
	<div id="sysParaGrid" title="系统参数" xtype="grid" region="center" onExtRowdblclick="onRowdblclick()" pagingBar="true" forceFit="true" border="false">
		<div xtype="tbar">
			<div text="新增" iconCls="icon-add" onExtClick="doAddSysPara()" ></div>
			<div text="-"></div>
			<div text="修改" iconCls="icon-update" onExtClick="doUpdateSysPara()"></div>
			<div text="-"></div>
			<div text="删除" iconCls="icon-delete" onExtClick="doDeleteSysPara()"></div>
			<div text="->"></div>
			<form id="frmQuery" name="frmQuery" method="post">
				<table>
					<tr>
						<td>参数名称：</td>
						<td><input type="text" name="paraName" /></td> 
					</tr>
				</table>
			</form>
			<div text="查询" iconCls="icon-query" onExtClick="doQuerySysPara()"></div>
		</div>
		
			<div id="sysParaStore" xtype="store" url="${ctx}/admin/sysParaListData" autoLoad="true">
			<div xtype="jsonreader">
				<div name="paraCode"></div>
				<div name="paraName"></div>
				<div name="paraValue"></div>
				<div name="paraDesc"></div>
				<div name="visiable"></div>
				</div>
			</div>
			<div xtype="colmodel">
				<div type="checkbox"></div>
		 		<div header="参数编码" width="150" sortable="true" dataIndex="paraCode"></div>
		 		<div header="参数名称" width="180" sortable="true" dataIndex="paraName"></div>
			 	<div header="参数值" width="180" sortable="true" dataIndex="paraValue"></div>
			  	<div header="是否可编辑" width="100" sortable="true" dataIndex="visiable" kind="dic" src="DIC_YESORNO"></div>
			  	<div header="备注" width="200" sortable="true" dataIndex="paraDesc"></div>
			</div>
     </div>
</body>
</html>
