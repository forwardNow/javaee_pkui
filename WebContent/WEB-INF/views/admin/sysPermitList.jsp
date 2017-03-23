<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
	<title>消息列表</title>
	<script type="text/javascript">
	//资源
	var UUR = ErrorUrlResource = {
        // 新增
        'sysPermitAdd' : '${ctx}/admin/sysPermitForm?' + Math.random(),
        // 删除
        'sysPermitDelete' : '${ctx}/admin/sysPermitDelete?' + Math.random(),
        // 修改
        'sysPermitUpdate' : '${ctx}/admin/sysPermitForm?' + Math.random()
	};
	
	// 新增
	function doAddSysPermit(){
		var diag = new Dialog();
	    diag.Width =600;
        diag.Height = 300;
        diag.Title = "新增权限配置";
        diag.URL = UUR.sysPermitAdd;
        diag.OKEvent = function(){
        	 diag.innerWin["doSaveSysPermit"]();
        }
        diag.show();
	}
	
    // 修改
    function doUpdateSysPermit(){
    	var sel = Pku.getExt("sysPermitGrid").getSelectionModel().getSelections();
        if(sel.length == 1){
        	doUpdateById(sel[0].get("permitId"));
        }else{
        	Diag.alert("请选中一条记录");
        }
    }
	
	//删除消息
	function doDeleteSysPermit(frmName,gridId,btn){
        var sel = Pku.getExt(gridId).getSelectionModel().getSelections();
        if(sel.length > 0){
            Dialog.confirm("确认删除选中记录？", function(){
                var urlParams = "";
                for ( var i = 0;i < sel.length;i++ ){
                    urlParams += "&permitId=" + sel[i].get("permitId");
                }
                btn.disable();
                Pku.Common.ajax(UUR.sysPermitDelete + urlParams,{},function(bln,response,o){
                    btn.enable();
                    var objRet = toJson(response.responseText);
                    if(objRet.success){
                        Dialog.alert("删除成功");
                        doSysPermitQuery();
                    }else{
                        Dialog.alert(objRet.message);
                    }
                });
            });
        }else{
            Dialog.alert("请选中记录");
        }
	}
	
	//查询信息
	function doSysPermitQuery(){
        Pku.getExt("sysPermitGrid").store.baseParams.permitName = Ext.getDom("frmQuery").permitName.value;
        Pku.getExt("sysPermitGrid").store.load();
	}
	
    //双击行
    function onRowdblclick(data){
        var	permitId = data["permitId"];
        doUpdateById(permitId);
    }
    
    // 修改数据权限
    function doUpdateById(permitId){
    	var diag = new Dialog();
	    diag.Width =600;
        diag.Height = 300;
        diag.Title = "修改权限配置";
        diag.URL = UUR.sysPermitUpdate + "&permitId=" + permitId
        diag.OKEvent = function(){
        	 diag.innerWin["doSaveSysPermit"]();
        }
        diag.show();
    }
    var myViewConfig = {
        groupTextTpl: '{text} ({[values.rs.length]} {[values.rs.length > 1 ? "Items" : "Item"]})'
    };
 
	</script>
</head>
<body>
	<div id="sysPermitGrid" title="数据权限开发配置" xtype="grid" region="center" iconCls="icon-window" pagingBar="true" forceFit="true" border="false" onExtRowdblclick="onRowdblclick()">
		<div xtype="tbar">
			<div text="新增" iconCls="icon-add" onExtClick="doAddSysPermit()" ></div>
			<div text="-"></div>
			<div text="修改" iconCls="icon-update" onExtClick="doUpdateSysPermit()" ></div>
			<div text="-"></div>
			<div text="删除" iconCls="icon-delete" onExtClick="doDeleteSysPermit('frmQuery','sysPermitGrid')"></div>
			<div text="->"></div>
			<form id="frmQuery" name="frmQuery" method="post">
				<table>
					<tr>
						<td>数据权限名称：</td>
						<td><input type="text" name="permitName" /></td> 
					</tr>
				</table>
			</form>
			<div text="查询" iconCls="icon-query" onExtClick="doSysPermitQuery()"></div>
		</div>
		<div id="sysPermitStore" xtype="groupstore" url="${ctx}/admin/sysPermitListData" groupField="permitCode" sortInfo="{field: 'permitId', direction: 'ASC'}" viewConfig="myViewConfig" autoLoad="true">
			<div xtype="jsonreader">
				<div name="permitId"></div>
				<div name="permitName"></div>
				<div name="permitCode"></div>
				<div name="permitValue"></div>
				<div name="permitDesc"></div>
			</div>
		</div>
		<div xtype="colmodel">
            <div type="checkbox"></div>
		 	<div header="数据权限名称" width="150" sortable="true" dataIndex="permitName"></div>
		  	<div header="数据权限类型" width="150" sortable="true" dataIndex="permitCode" kind="dic" src="DIC_PERMIT_TYPE"></div>
		  	<div header="数据权限值" width="180" sortable="true" dataIndex="permitValue"></div>
		  	<div header="备注" width="100" sortable="true" dataIndex="permitDesc"></div>
		</div>
     </div>
</body>
</html>
