<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
	<title>用户管理</title>
	<script type="text/javascript">
	//资源
	var UUR = UserUrlResource = {
        // 新增
        'sysUserAdd' : '${ctx}/admin/sysUserForm?' + Math.random(),
        // 修改
        'sysUserUpdate' : '${ctx}/admin/sysUserForm?' + Math.random(),
        // 删除
        'sysUserDelete' : '${ctx}/admin/sysUserDelete?' + Math.random(),
        //高级查询
        'sysUserQuery'  : '${ctx}/admin/sysUserAdvQuery?' + Math.random(),
        //重置密码
        'sysUserResetPwd': '${ctx}/admin/sysUserResetPWD?' + Math.random()
	};
	
	//新增用户
	function doAddSysUser(){
        var diag = openMidDialog({
            Title : "新增用户",
            URL : UUR.sysUserAdd,
            OKEvent : function(){
                diag.innerWin["doSaveSysUser"]();
            }
        });
	}
	
	//修改用户 
	function doUpdateSysUser(){
        var sel = Pku.getExt("sysUserGrid").getSelectionModel().getSelections();
        if(sel.length == 1){
            var userId = sel[0].get("userId");
            var diag = openMidDialog({
                Title : "修改用户",
                URL : UUR.sysUserUpdate + "&userId=" + userId,
                OKEvent : function(){
                    diag.innerWin["doSaveSysUser"]();
                }
            });
        }else{
        	Dialog.alert("请选择用户");
        }
	}
	
	//删除用户
	function doDeleteSysUser(btn){
        var sel = Pku.getExt("sysUserGrid").getSelectionModel().getSelections();
        if(sel.length > 0){
            Dialog.confirm("确认删除所选用户？", function(){
                var urlParams = "";
                for ( var i = 0;i < sel.length;i++ ){
                    urlParams += "&userId=" + sel[i].get("userId");
                }
                btn.disable();
                Pku.Common.ajax(UUR.sysUserDelete + urlParams,{},function(bln,response,o){
                    btn.enable();
                    var objRet = toJson(response.responseText);
                    if(objRet.success){
                        Dialog.alert("删除成功",function(){
                        	doSysUserQuery();
                        });
                    }else{
                        Dialog.alert(objRet.message);
                    }
                });
            });
        }else{
            Dialog.alert("请选择用户");
        }
	}
	
    // 高级查询
    function doSysUserAdvQuery(){
        var diag = openMidDialog({
            Title : "高级查询",
            URL : UUR.sysUserQuery,
            OKEvent : function(){
                var qryFrm = diag.innerFrame.contentWindow.document.advQryFrm;
                var txtQuery = Pku.Common.getQueryJson(qryFrm, "USER_ID");
            	Pku.getExt("sysUserGrid").store.baseParams.txtQuery = txtQuery;
            	Pku.getExt("sysUserGrid").store.load();
            	Dialog.close();
            }
        });
    }
	
	//查询用户 
	function doSysUserQuery(){
        var txtQuery = Pku.Common.getQueryJson("frmQuery","USER_ID");
		Pku.getExt("sysUserGrid").store.baseParams.txtQuery = txtQuery;
		Pku.getExt("sysUserGrid").store.load();
	}
	
	//重置密码
	function doResetPwd(){
		var sel = Pku.getExt("sysUserGrid").getSelectionModel().getSelections();
		if(sel.length > 0){
		    Dialog.confirm("确认重置所选用户的密码？", function(){
		        var urlParams = "";
		        for ( var i = 0;i < sel.length;i++ ){
		            urlParams += "&userId=" + sel[i].get("userId");
		        }
		        Pku.Common.ajax(UUR.sysUserResetPwd + urlParams,{},function(btn,response,o){
		            var objRet = toJson(response.responseText);
		            if(objRet.success){
		                Dialog.alert("操作成功");
		                doSysUserQuery();
		            }else{
		                Dialog.alert(objRet.message);
		            }
		        });
		    });
		}else{
		    Dialog.alert("请选择用户");
		}
	}
	
	//状态渲染
	function userStatusRender(v) {
		return (v === "1") ?  "正常" : "<font color='red'>停用</font>";
	}
	
    //双击行
    function onRowdblclick(data){
        var userId = data["userId"];
        var diag = openMidDialog({
            Title : "修改用户信息",
            URL : UUR.sysUserUpdate + "&userId=" + userId,
            OKEvent : function(){
                diag.innerWin["doSaveSysUser"]();
            }
        });
    }
    
    Pku.onReady(function(){
    	doSysUserQuery();
    });
	</script>
</head>
<body>
	<div id="sysUserGrid" title="用户管理列表" iconCls="icon-window" xtype="grid" region="center" pagingBar="true" forceFit="true" border="false" onExtRowdblclick="onRowdblclick()">
		<div xtype="tbar">
			<div text="新增" iconCls="icon-add" onExtClick="doAddSysUser()" ></div>
			<div text="-"></div>
			<div text="修改" iconCls="icon-update" onExtClick="doUpdateSysUser()"></div>
			<div text="-"></div>
			<div text="删除" iconCls="icon-delete" onExtClick="doDeleteSysUser()"></div>
			<div text="-"></div>
			<div text="高级查询" iconCls="icon-adv-query" onExtClick="doSysUserAdvQuery()"></div>
            <div text="-"></div>
            <div text="重置密码" iconCls="icon-key" onExtClick="doResetPwd()"></div>
			<div text="->"></div>
			<form id="frmQuery" name="frmQuery" method="post">
				<table>
					<tr>
						<td>用户姓名：</td>
						<td><input type="text" name="userName" /></td> 
					</tr>
				</table>
			</form>
			<div text="查询" iconCls="icon-query" onExtClick="doSysUserQuery()"></div>
		</div>
		<div id="sysDeptStore" xtype="store" url="${ctx}/admin/sysUserListData" autoLoad="false">
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
		 	<div header="真实姓名" width="100" sortable="true" dataIndex="userName"></div>
		  	<div header="警号" width="70" sortable="true" dataIndex="policeCode"></div>
		  	<div header="所属单位" width="220" sortable="true" dataIndex="deptId" kind="dic" src="DIC_DEPT"></div>
		  	<div header="用户类型" width="110" sortable="true" dataIndex="userType" kind="dic" src="DIC_USER_TYPE"></div>
		  	<div header="当前状态" width="70" sortable="true" dataIndex="status" renderer="userStatusRender"></div>
		  	<div header="邮箱" width="120" sortable="true" dataIndex="email"></div>
		  	<div header="联系电话" width="90" sortable="true" dataIndex="tel"></div>
		  	<div header="录入时间"  sortable="true" dataIndex="addTime" renderer="dateRender"></div>
		</div>
     </div>
</body>
</html>
