<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
    <title>角色信息列表</title>
    <script type="text/javascript">
    //资源
    var UUR = UserUrlResource = {
        // 添加用户到角色
        'sysRoleUserAdd' : '${ctx}/admin/sysRoleUserSave?' + Math.random()
    };
    
    //关闭本窗口
    function doClose(){
        ownerDialog.close();
    }
    
    //添加用户到角色
    function doSaveSysRoleUser() {
        var sel = Pku.getExt("sysUserGrid").getSelectionModel().getSelections();
        if(sel.length > 0){
            Dialog.confirm("确认将所选用户添加到当前角色？", function(){
                var urlParams = "";
                for ( var i = 0;i < sel.length;i++ ){
                    urlParams += "&userId=" + sel[i].get("userId");
                }
                urlParams += "&roleId=${roleId }";
                Pku.Common.ajax(UUR.sysRoleUserAdd + urlParams,{},function(bln,response,o){
                    var objRet = toJson(response.responseText);
                    if(objRet.success){
                        ownerDialog.openerWindow["doSysUserQuery"]();
                        doClose();
                    }else{
                        Dialog.alert(objRet.message);
                    }
                });
            });
        }else{
            Dialog.alert("请选中用户");
        }
    }
    
    //用户状态渲染
    function userStatusRender(v) {
        return (v === "1") ?  "正常" : "<font color='red'>停用</font>";
    }
    //查询用户 
    function doSysUserQuery(){
        Pku.getExt("sysUserGrid").store.baseParams.userName = document.frmQuery.userName.value;
        Pku.getExt("sysUserGrid").store.baseParams.roleId = document.frmQuery.roleId.value;
        Pku.getExt("sysUserGrid").store.baseParams.roleIdOper = document.frmQuery.roleIdOper.value;
        Pku.getExt("sysUserGrid").store.load();
    }
    Ext.onReady(function(){
    	doSysUserQuery();
    });
    </script>
</head>
<body>
<div id="sysUserGrid" iconCls="icon-window" xtype="grid" region="center" pagingBar="true" pageSize="12" forceFit="true" border="false" onExtRowdblclick="onRowdblclick()">
	<div xtype="tbar">
	    <div text="->"></div>
	    <form id="frmQuery" name="frmQuery" method="post">
	        <table>
	            <tr>
	                <td>用户姓名：</td>
	                <td>
	                    <input type="text" name="userName" />
	                    <input type="hidden" name="roleIdOper" value="notIn" />
	                    <input type="hidden" name="roleId" value="${roleId }"/>
	                </td> 
	            </tr>
	        </table>
	    </form>
	    <div text="查询" iconCls="icon-query" onExtClick="doSysUserQuery()"></div>
	</div>
	<div id="sysDeptStore" xtype="store" url="${ctx}/admin/sysRoleUserListData">
       <div xtype="jsonreader">
           <div name="userId"></div>
           <div name="loginName"></div>
           <div name="userName"></div>
           <div name="policeCode"></div>
           <div name="deptId"></div>
           <div name="userType"></div>
           <div name="status"></div>
           <div name="email"></div>
           <div name="tel"></div>
           <div name="addTime"></div>
       </div>
   </div>
   <div xtype="colmodel">
       <div type="checkbox"></div>
       <div header="登录名" width="90" sortable="true" dataIndex="loginName"></div>
       <div header="真实姓名" width="90" sortable="true" dataIndex="userName"></div>
       <div header="警号" width="80" sortable="true" dataIndex="policeCode"></div>
       <div header="所属单位" width="240" sortable="true" dataIndex="deptId" kind="dic" src="DIC_DEPT"></div>
       <div header="当前状态" sortable="true" dataIndex="status" renderer="userStatusRender"></div>
   </div>
</div>
</body>
</html>
