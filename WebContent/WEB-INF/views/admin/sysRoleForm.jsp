<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
    <title>编辑角色信息</title>
    <style>
    .psr{position:relative;}.psa{position:absolute;}
    .role-panel{
        margin:10px 0 0 30px;
        font-size:12px;
    }
    .role-panel div{
        height:30px;
        line-height:30px;
    }
    .role-panel label{
        display:inline-block;
        width:60px;
        text-align:right;
    }
    .role-panel label span{
        color:red;
    }
    #radios label{
        display:inline-block;
        width:37px;
        text-align:left;
    }
    textarea{
        width:185px;
        height:70px;
    }
    </style>
    
    <script type="text/javascript"> 
        
    //关闭本窗口
    function doClose(){
        ownerDialog.close();
    }

    //保存
    function doSaveSysRole(){
        var frm = Pku.getExt("addRoleFrm");
        frm.submit();
    }
    
    //反馈
    function doResult(form, action){
    	if ( !action.response ) {
    		return;
    	}
        var objRet = toJson(action.response.responseText);
        if ( objRet.success ){
            Dialog.alert('操作成功！',function(){
             ownerDialog.openerWindow.location.href = ownerDialog.openerWindow.location.href;
             doClose();
            });
        } else {
       		Dialog.alert(objRet.message);
        }
    }
    
    
    //输入信息验证
    function checkField(objInput){
        if ( objInput.value ) {
            var params = "roleId=${sysUser.userId}&roleLevel=" + document.addRoleFrm.roleLevel.value + "&fieldName=" + objInput.name + "&fieldValue=" + encodeURI(encodeURI(objInput.value));
            Pku.Common.ajax("${ctx}/admin/sysRoleCheckInfo?" + params, {}, function(btn, response, o){
                var objRet = toJson(response.responseText);
                if( !objRet.success ){
                    Pku.getDom(objInput.name + 'Msg').innerHTML = "已存在";
                    objInput.focus();
                } else {
                    Pku.getDom(objInput.name + 'Msg').innerHTML = "";
                }
            });
        }
    }
    </script>
</head>
<body>
    <div class="role-panel">
        <form id="addRoleFrm" name="addRoleFrm" url="${ctx}/admin/sysRoleSave" method="post" onExtSuccess="doResult()" onExtFailure="doResult()">
            <input type="hidden" name="roleId" value="${sysRole.roleId }" />    
            <input type="hidden" name="roleLevel" value="0" /> <!-- 角色暂不分级，默认为0 -->    
            <div>
                <label><span>*</span>角色名称</label>
                <input type="text" name="roleName" value="${sysRole.roleName }" maxlength="32" must="true" />  
                <span id="roleNameMsg"></span>  
            </div>
            <c:if test="${sysRole != null}">
            <div>
                <label><span>*</span>排序</label>
                <input type="text" name="orderFlag" value="${sysRole.orderFlag }" kind="int" maxlength="3" must="true" />  
                <span id="roleNameMsg"></span>  
            </div>
            </c:if>
            <div>
                <label style="vertical-align:top">角色描述</label>
                <textarea name="roleDerc" maxLength="64">${sysRole.roleDerc }</textarea>  
                <span id="roleDercMsg"></span>  
            </div>
        </form>
    </div>
</body>
</html>




