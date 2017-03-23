<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
    <title>编辑用户信息</title>
    <style>
    .psr{position:relative;}.psa{position:absolute;}
    .bdr{border-right:solid 1px #cfcfcf;}.bdb{border-bottom:solid 1px #efefef;}
    .user-add-panel{
       width:600px;
       height:400px;
    }
    .user-add-baseinfo{
       top:5px;
       left:0px;
       width:350px;
       height:360px;
    }
    .user-add-userrole{
       top:5px;
       right:0px;
       width:250px;
       height:360px;
    }
    .user-info-title{
        font-weight:bold;
        font-size:14px;
        padding:5px;
    }
    .user-edit-baseinfo{
        color:#0a3f6c;
        padding:5px;
        font-size:12px;
    }
    .user-edit-baseinfo div{
        height:25px;
        line-height:30px;
    }
    .user-edit-baseinfo label{
        display:inline-block;
        width:100px;
        text-align:right;
    }
    .user-edit-baseinfo span{
        color:red;
    }
    .user-edit-userrole{
        height:335px;
        color:#0a3f6c;
        padding:5px;
        padding-left:10px;
        font-size:12px;
        overflow:auto;
    }
    .user-role-level{
        height:24px;
        padding-top:5px;
    }
    .user-role-item div{
        padding-left:20px;
        height:24px;
        line-eight:24px;   
    }
    .user-role-toggle{
        display:inline;
        padding-left:10px;
        padding-right:10px;
        font-size:14px;
        cursor:pointer;
    }
    .role-item-checkbox{
        cursor:pointer;
    }
    #user_status_radio{
        color:black;
    }
    #user_status_radio label{
        display:inline-block;
        width:25px;
    }
    </style>
    
    <script type="text/javascript"> 
        
    //关闭本窗口
    function doClose(){
        ownerDialog.close();
    }

    //保存
    function doSaveSysUser(){
        var frm = Pku.getExt("addUserFrm");
        frm.submit();
    }
    
    //反馈
    function doResult(form, action){
        if ( !action.response ) {
            return ;
        }
        var objRet = toJson(action.response.responseText);
        if ( objRet.success ){
            ownerDialog.openerWindow["doSysUserQuery"]();
            if('${sysUser.userId}' != ''){ //修改
                //关闭表单窗口
                Dialog.alert("修改成功.",function(){
                	doClose();
                });
            }else{ //新增
                Dialog.confirm('保存成功，要继续 录入么？',function(){
                    //重新载入
                    window.location.href = window.location.href;
                },function(){
                    //关闭表单窗口
                    doClose();
                });
            }
        } else {
            Dialog.alert(objRet.message);
        }
    }

    //角色展开/关闭
    function doRoleToggle(){
        var event = event || window.event,
            src = event.target || event.srcElement,
            trgObj;
        if (src.className === "user-role-toggle") {
            trgObj = src.parentNode.parentNode.lastChild;
            if (src.innerHTML === "-") {
                trgObj.style.display = "none";
                src.innerHTML = "+";
            } else {
                trgObj.style.display = "";
                src.innerHTML = "-";
            }
        }
        if ( src.className === "role-item-checkbox" ) {
        	trgObj = src.firstChild;
        	trgObj.checked = trgObj.checked ? false : true;
        }
    }
    
    //密码验证
    function checkPwd(obj, id){
        var obj2 = Pku.getDom(id);
        if ( (obj.value != '' && obj2.value != '') && (obj.value != obj2.value)) {
        	Pku.getDom(obj.id + "Msg").innerHTML = "密码不一致";
        	obj.value = "";
        	obj.focus();
        } else {
        	Pku.getDom(obj.id + "Msg").innerHTML = "";
        }
    }
    //密码大小写
    function  detectCapsLock(event){
	    var e = event || window.event;
	    var obj = e.target||e.srcElement;
	    var keyCode = e.keyCode || e.which;
	    if ( keyCode >= 65 && keyCode <= 90 ){
	    	Pku.getDom(obj.id + "Msg").innerHTML = "注意大小写";
	    } else { 
	    	Pku.getDom(obj.id + "Msg").innerHTML = "";
	    }
	}
    
    //输入信息验证
    function checkField(objInput){
        if ( objInput.value ) {
            var params = "userId=${sysUser.userId}&fieldName=" + objInput.name + "&fieldValue=" + encodeURI(encodeURI(objInput.value));
            Pku.Common.ajax("${ctx}/admin/sysUserCheckInfo?" + params, {}, function(btn, response, o){
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
    <div class="user-add-panel pr">
    <form id="addUserFrm" url="${ctx}/admin/sysUserSave" method="post" onExtSuccess="doResult()" onExtFailure="doResult()">
        <input type="hidden" name="userId" value="${sysUser.userId}" />
        <div class="user-add-baseinfo psa bdr">
            <div class="user-info-title bdb">基本信息</div>
            <div class="user-edit-baseinfo">
                <div>
                    <label><span>*</span>登录名</label>
                    <input type="text" id="loginName" name="loginName" 
                           value="${sysUser.loginName }"  maxlength="30" must="true" />
                    <span id="loginNameMsg"></span>
                </div>
                <div>
                    <label><span>*</span>真实姓名</label>
                    <input type="text" name="userName" value="${sysUser.userName }"  maxlength="30" must="true" />
                </div>
                <div>
                    <label><span>*</span>警号</label>
                    <input type="text" id="policeCode" name="policeCode" 
                           value="${sysUser.policeCode }"  maxlength="6" must="true" />
                    <span id="policeCodeMsg"></span>
                </div>
                <div class="psr">
                   <div class="psa" style="top:0px;left:0px;">
                       <label><span>*</span>所属单位</label>
                   </div>
                   <div class="psa" style="top:3px;left:106px;">
	                   <input type="text" _name="deptId" kind="dic" src="${ctx }/admin/sysDeptDic?deptId=${_pku_user.deptId}&releType=2" value="${sysUser.deptId}" must="true" />
                   </div>
                </div>
                <div class="psr">
                   <div class="psa" style="top:0px;left:0px;">
                       <label><span>*</span>用户类型</label>
                   </div>
                   <div class="psa" style="top:3px;left:106px;">
                       <input type="text" _name="userType"
                              kind="dic" src="DIC_USER_TYPE" value="${sysUser.userType}" 
                              must="true" />
                   </div>
                </div>
                <!-- 改变密码使用重置密码功能 -->
                <c:if test="${sysUser.userId == null}">
                <div>
                    <label><span>*</span>密码</label>
                    <input type="password" id="password" name="password" 
                           maxlength="16" must="true" 
                           onkeypress="detectCapsLock();" onBlur="checkPwd(this, 'password2')" />
                    <span id="passwordMsg"></span>      
                </div>
                <div>
                    <label><span>*</span>重复密码</label>
                    <input type="password" id="password2" 
                           maxlength="16" must="true" 
                           onkeypress="detectCapsLock();" onBlur="checkPwd(this, 'password')" />
                    <span id="password2Msg"></span>      
                </div>
                </c:if>
                <div>
                    <label><span>*</span>用户状态</label>
                    <span id="user_status_radio">
                    <input type="radio" id="user_status_normal" name="status" 
                           value="1" ${sysUser.status != '0' ? "checked" : "" } /> 
                    <label for="user_status_normal">正常</label>
                    <input type="radio" id="user_status_ban" name="status" 
                           value="0" ${sysUser.status == '0' ? "checked" : "" } /> 
                    <label for="user_status_ban">停用</label>
                    </span>
                </div>
                <div>
                    <label>身份证号</label>
                    <input type="text" name="idcard" value="${sysUser.idcard }" kind="idcard" />
                </div>
                <div>
                    <label>数字证书编号</label>
                    <input type="text" name="certificate" value="${sysUser.certificate }" />
                </div>
                <div>
                    <label>邮箱</label>
                    <input type="text" name="email" value="${sysUser.email }" maxlength="64" />
                </div>
                <div>
                    <label>联系电话</label>
                    <input type="text" name="tel" value="${sysUser.tel }" maxlength="20" />
                </div>
                <div>
                    <label>备注</label>
                    <input type="text" name="memo" value="${sysUser.memo }" maxlength="128" />
                </div>
            </div>
        </div>
        <div class="user-add-userrole psa">
            <div class="user-info-title bdb">所属角色</div>
            <div class="user-edit-userrole">
                <c:forEach var="role" items="${roleList}">
                	<div class="user-role-item">
                		<div class="role-item-checkbox">
                			<input type="checkbox" name="roleId" value="${role.roleId}" <c:forEach var="checkedRole" items="${checkedRoleList}"><c:if test="${checkedRole.roleId == role.roleId}">checked</c:if></c:forEach> />${role.roleName}
                		</div>
                	</div>
                </c:forEach>
            </div>
        </div>
    </form>
    </div>
</body>
</html>




