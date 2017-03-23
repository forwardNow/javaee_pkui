<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
	<title>编号管理</title>
	<script type="text/javascript">
	//资源
	var UUR = {
		// 新增
		'sysMaxIdTypeAdd' : '${ctx}/admin/sysMaxIdTypeForm?' + Math.random(),
		// 修改
		'sysMaxIdTypeUpdate' : '${ctx}/admin/sysMaxIdTypeUpdateForm?' + Math.random(),
		// 删除
		'sysMaxIdTypeDelete' : '${ctx}/admin/sysMaxIdTypeDelete?' + Math.random(),
		// 维护编码内容
		'sysMaxIdList' : '${ctx}/admin/sysMaxIdList?' + Math.random()
	};
	
	//新增编号
	function doSysMaxIdTypeAdd(){
		var diag = openMidDialog({
			Title : "新增编号",
			URL : UUR.sysMaxIdTypeAdd,
			OKEvent : function(){
				diag.innerWin["doSavesysMaxIdType"]();
			}
		});
	}
	
	//修改编号 
	function doSysMaxIdTypeUpdate(){
		
		var sel = Pku.getExt("sysMaxIdTypeListGrid").getSelectionModel().getSelections();
		if(sel.length == 1){
			var IdType = sel[0].get("idType");
			var diag = openMidDialog({
				Title : "修改编号",
				URL : UUR.sysMaxIdTypeUpdate + "&idType=" + IdType,
				OKEvent : function(){
					diag.innerWin["doSaveSysMaxIdType"]();
				}
			});
		}else{
			Dialog.alert("请选中一条记录");
		}
	}
	
	//删除编号
	function doSysMaxIdTypeDelete(btn){
		var sel = Pku.getExt("sysMaxIdTypeListGrid").getSelectionModel().getSelections();
		if(sel.length > 0){
			Dialog.confirm("确认删除？", function(){
				var urlParams = "";
				for(var i=0;i<sel.length;i++){
					urlParams += "&idType=" + sel[i].get("idType");
				}
				btn.disable();
				Pku.Common.ajax(UUR.sysMaxIdTypeDelete + urlParams,{},function(bln,response,o){
					btn.enable();
					var objRet = toJson(response.responseText);
					if(objRet.success){
						Dialog.alert("删除成功");
						doSysMaxIdTypeListQuery();
					}else{
						Dialog.alert(objRet.message);
					}
				});
			});
		}else{
			Dialog.alert("请选中记录");
		}
	}
	
	// 生成字典文件
	function doSysMaxIdTypeDic(){

	}
	
	// 维护编码内容
	function doSysMaxIdTypeDetail(){
		var sel = Pku.getExt("sysMaxIdTypeListGrid").getSelectionModel().getSelections();
		if(sel.length == 1){
			var IdType = sel[0].get("idType");
			var diag = openMidDialog({
				Title : "维护编码内容",
				URL : UUR.sysMaxIdList + "&idType=" + IdType

			});
		}else{
			Dialog.alert("请选中一条记录");
		}
		
		
	}
	
	//查询单位 
	function doSysMaxIdTypeListQuery(){
		Pku.getExt("sysMaxIdTypeListGrid").store.baseParams.idName = document.frmQuery.idName.value;
		Pku.getExt("sysMaxIdTypeListGrid").store.load();
	}
	
    //双击行
    function onRowdblclick(data){
        var idType = data["idType"];
		var diag = openMidDialog({
			Title : "修改系统参数",
			URL : UUR.sysMaxIdTypeUpdate + "&idType=" + idType,
			OKEvent : function(){
				diag.innerWin["doSaveSysMaxIdType"]();
			}
		});
    }
    
	</script>
</head>
<body>
	<div id="sysMaxIdTypeListGrid" title="编号管理列表" iconCls="icon-window" xtype="grid" region="center" pagingBar="true" forceFit="true" border="false" onExtRowdblclick="onRowdblclick()">
		<div xtype="tbar">
			<div text="新增" iconCls="icon-add" onExtClick="doSysMaxIdTypeAdd()" ></div>
			<div text="-"></div>
			<div text="修改" iconCls="icon-update" onExtClick="doSysMaxIdTypeUpdate()"></div>
			<div text="-"></div>
			<div text="删除" iconCls="icon-delete" onExtClick="doSysMaxIdTypeDelete()"></div>
			<div text="-"></div>
			<div text="维护编号内容" iconCls="icon-adv-query" onExtClick="doSysMaxIdTypeDetail()"></div>
			<div text="->"></div>
			<form id="frmQuery" name="frmQuery" method="post">
				<table>
					<tr>
						<td>编号名称：</td>
						<td><input type="text" name="idName" /></td>
					</tr>
				</table>
			</form>
			<div text="查询" iconCls="icon-query" onExtClick="doSysMaxIdTypeListQuery()"></div>
		</div>
		<div id="sysMaxIdTypeStore" xtype="store" url="${ctx}/admin/sysMaxIdTypeListData" autoLoad="true">
			<div xtype="jsonreader">
				<div name="idType"></div>
				<div name="idName"></div>
				<div name="idSize"></div>
				<div name="idLoop"></div>
				<div name="idBegin"></div>
				<div name="idEnd"></div>
				<div name="idDes"></div>
			</div>
		</div>
		<div xtype="colmodel">
			<div type="checkbox"></div>
			<div header="编号类型" width="180" sortable="true" dataIndex="idType"></div>
		 	<div header="编号名称" width="180" sortable="true" dataIndex="idName"></div>
		  	<div header="编号长度" width="100" sortable="true" dataIndex="idSize" ></div>
		  	<div header="是否可循环" width="100" sortable="true" dataIndex="idLoop" kind="dic" src="DIC_YESORNO"></div>
		  	<div header="最小值" width="100" sortable="true" dataIndex="idBegin"></div>
		  	<div header="最大值" width="100" sortable="true" dataIndex="idEnd"></div>
		  	<div header="描述" width="180" sortable="true" dataIndex="idDes"></div>
		</div>
     </div>
</body>
</html>
