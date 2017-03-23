<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
    <title>角色管理</title>
    <style>
    .overflow{
        width:100%;
        height:100%;
        overflow:auto; 
    }
    .role-item-panel{
        font-size:12px;
        padding:2px;
        width:820px;
    }
    .role-item-panel label{
        display:inline-block;
        width:165px;
        padding-left:3px;
        cursor:pointer;
    }
    .resource-block{
        padding-bottom:15px;
    }
    .permit-block{
        padding-bottom:15px;
    }
    .item-title{
        display:block;
        padding:0 0 10px 10px;
        background-image:url(${ctx}/static/images/pku/legend_bg.png);
        background-repeat:no-repeat;
    }
    .item-list{
        display:inline-block;
        width:190px;
        padding:0 0 10px 30px;
    }
     .item-list img{
    	vertical-align:middle; 
     }
     .menu-div{
     	margin:3px;
     }
    .menu-div img{
    	vertical-align:middle; 
     }
	.menu-level-1{
		padding-left:5px;
        background-image:url(${ctx}/static/images/pku/legend_bg.png);
        background-repeat:no-repeat;
	}
    </style>
    <script type="text/javascript">
    var UUR = {
            //增加角色页面
            'sysRoleAdd' : '${ctx}/admin/sysRoleForm?' + Math.random(),
            //修改角色页面
            'sysRoleUpdate' : '${ctx}/admin/sysRoleForm?' + Math.random(),
            //删除角色
            'sysRoleDelete' : '${ctx}/admin/sysRoleDelete?' + Math.random(),
            //添加用户from
            'sysUserForm' : '${ctx}/admin/sysRoleUserList?' + Math.random(),
            //从角色删除用户
            'sysRoleUserDelete' : '${ctx}/admin/sysRoleUserDelete?' + Math.random(),
            //查询当前角色有权限查看的菜单
            'sysRoleMenuList' : '${ctx}/admin/sysRoleMenuListData?' + Math.random(),
            //查询当前角色有权限查看的资源
            'sysRoleResourceList' : '${ctx}/admin/sysRoleResouceListData?' + Math.random(),
            //保存角色菜单
            'sysRoleMenuSave' : '${ctx}/admin/sysRoleMenuSave?' + Math.random(),
            //保存角色资源
            'sysRoleResourceSave' : '${ctx}/admin/sysRoleResouceSave?' + Math.random(),
            
            //查询当前角色数据权限
            'sysRolePermitList' : '${ctx}/admin/sysRolePermitListData?' + Math.random(),
            //保存数据权限
            'sysRolePermitSave' : '${ctx}/admin/sysRolePermitSave?' + Math.random()
            
    };
    
    function getRoleId(){
        var roleId;
        try{
            roleId = Pku.getExt("roleTree").getSelectionModel().getSelectedNode().attributes.opurl;
        } catch(err)  {
            //Dialog.alert("请选择角色.");
            return false;
        }
        if ( !roleId ) {
            Dialog.alert("请选择角色.");
            return false;
        }
        return roleId;
    }
    
    //选择角色
    function doSelectRole(node, event){
    	if(node.leaf != true){
    		return ;
    	}
    	
        var trgTab = Pku.getExt("roleTab").getActiveTab().id,
            roleId = node.attributes.opurl;
        
        if ( trgTab == "pku-roleTabUser" ) {
            document.frmQuery.roleId.value = roleId;
            doSysUserQuery();   
            return ;
        }
        if ( trgTab == "pku-roleTabMenu" ) {
            doRenderMenuList(roleId);
            return ;
        }
        if ( trgTab == "pku-roleTabResource" ) {
            doRenderResourceList(roleId);
            return ;
        }
        if ( trgTab == "pku-roleTabPermit" ) {
            doRenderPermitList(roleId);
            return ;
        }
    }
    
    //选择tab
    function doSelectTab(o){
        var trgTab = o.id,
            roleId = getRoleId();

        if( !roleId ) {
            return ;
        }
        if ( trgTab == "roleTabUser" ) {
            document.frmQuery.roleId.value = roleId;
            doSysUserQuery();   
            return ;
        }
        if ( trgTab == "roleTabMenu" ) {
            doRenderMenuList(roleId);
            return ;
        }
        if ( trgTab == "roleTabResource" ) {
        	doRenderResourceList(roleId);
            return ;
        }
        if ( trgTab == "roleTabPermit" ) {
        	doRenderPermitList(roleId);
            return ;
        }
    }
    
    //增加角色
    function doAddSysRole(){
        var diag = openMinDialog({
            Title : "新增角色",
            URL : UUR.sysRoleAdd,
            OKEvent : function(){
                diag.innerWin["doSaveSysRole"]();
            }
        });
    }
    
    //修改角色
    function doUpdateSysRole(){
        var diag,
            roleId = getRoleId();
        if ( roleId ) {
            diag = openMinDialog({
                Title : "修改角色",
                URL : UUR.sysRoleUpdate + "&roleId=" + roleId,
                OKEvent : function(){
                    diag.innerWin["doSaveSysRole"]();
                }
            });
        }
    }

    //删除角色
    function doDeleteSysRole(btn){
        var diag,
            roleId = getRoleId();
        if ( roleId ) {
            Dialog.confirm("删除角色的同时会删除所有拥有该角色的<br>用户的角色信息, 确认删除 ?", function(){
                btn.disable();
                Pku.Common.ajax(UUR.sysRoleDelete + "&roleId=" + roleId,{},function(bln,response,o){
                    btn.enable();
                    var objRet = toJson(response.responseText);
                    if(objRet.success){
                        window.location.href = window.location.href;
                    }else{
                        Dialog.alert(objRet.message);
                    }
                });
            });
        }
    }
    
    //添加用户到角色
    function doAddUserToRole(){
        var diag,
            roleId = getRoleId();
        if ( roleId ) {
            diag = openMidDialog({
              Title : "添加用户到角色",
              URL : UUR.sysUserForm + "&roleId=" + roleId,
              OKEvent : function(){
                  diag.innerWin["doSaveSysRoleUser"]();
              }
            }); 
        }
    }
    
    //从角色删除用户
    function doDeleteUserFromRole(){
        var sel,
            roleId = getRoleId();
        if ( roleId ) {
            sel = Pku.getExt("sysUserGrid").getSelectionModel().getSelections();
            if( sel.length > 0 ){
                Dialog.confirm("确认从当前角色删除所选用户？", function(){
                    var urlParams = "";
                    for ( var i = 0;i < sel.length;i++ ){
                        urlParams += "&userId=" + sel[i].get("userId");
                    }
                    urlParams += "&roleId=" + roleId;
                    Pku.Common.ajax(UUR.sysRoleUserDelete + urlParams,{},function(bln,response,o){
                        var objRet = toJson(response.responseText);
                        if(objRet.success){
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

    //查询角色菜单,并渲染到相应tab
    function doRenderMenuList(roleId){
        if ( !roleId ) return;
        Pku.Common.ajax(UUR['sysRoleMenuList'] + "&roleId=" + roleId, {}, function(btn, response, o){
            var objRet = toJson(response.responseText),
            	arrMenus = objRet.data,
            	menuIdMark = '';
            var createMenu = function(tpid, menuId, menuName, icon, treeLevel, checked) {
            	var strHtml = '',
                    nodes = new Array(),
                    modelHtml = '\
	            				<div id="div_menu_{{menuId}}" class="menu-level-{{treeLevel}} menu-div" style="padding-left:{{paddingleft}}px" >\
	            					<input id="menu_{{menuId}}" name="roleMenuBox" value="{{menuId}}" type="checkbox" {{checked}} />\
	            					{{icon}}<label for="menu_{{menuId}}">{{menuName}}</label>\
	            					{{_function}}\
	            				</div>\
	            				';
            	//获取下级菜单
            	for ( var i = 0;i < arrMenus.length;i++ ) {
            		if ( (arrMenus[i].treeParentid + '-') === (tpid + '-') ) {
            			nodes.push(arrMenus[i]);
            		}
            	}
            	if ( nodes.length > 0 )  {
            		for ( var j = 0;j < nodes.length;j++ ) {
            			strHtml += modelHtml.replace(/{{(\w+)}}/g, function(markOut, markIn){
							if ( markIn == '_function' ) {
								return createMenu(nodes[j].menuId, nodes[j].menuId, nodes[j].menuName, 
									nodes[j].icon, nodes[j].treeLevel, nodes[j].checked);
							}
							if ( markIn == 'icon' ) {
								if ( nodes[j].icon == null ) {
									return '';
								} else {
									return '<img width="16" src="${ctx}/static/images/icons/16x16/'+ nodes[j].icon + '" />';
								}
							}
							if ( markIn == 'paddingleft' ) {
								return nodes[j].treeLevel * 15;
							}
							return nodes[j][markIn] != null ? nodes[j][markIn] : '';
                        });
            		}
            	}
            	return strHtml;
            };
            Pku.getDom("role_menu").innerHTML = createMenu('null', '', '', '', '', '') + 
      				'<input type="hidden" id="menuSelectAll" value="false">';
        });
    }

    //选择菜单
    function doSelectMenu(id){
    	var o = Pku.getDom("menuSelectAll");
        var b = (o.value === 'false') ? (function(){
            o.value = 'true';
            return true;
        }()) : (function(){
            o.value = 'false';
            return false;
        }());
        var event = event || window.event,
            src = event.target || event.srcElement,
            boxes,
            status;
        if ( !id && (src.tagName.toUpperCase() !== 'INPUT') ){
            return;
        }
        status = id ? b : src.checked;
        boxes = id ? Pku.getDom(id).getElementsByTagName("input") 
        		   : src.parentNode.getElementsByTagName("input");
        for ( var i = 0;i < boxes.length;i++ ){
            if (boxes[i].type === 'checkbox') {
                boxes[i].checked = status;
            }
        }
    }

    //保存角色菜单
    function doSaveMenuToRole(){
        var boxes,
            params,
            roleId = getRoleId();
        if ( roleId ) {
        	boxes = document.menuRoleFrm.roleMenuBox;
        	if ( !boxes ) {
        		return;
        	}
        	for (var i = 0;i < boxes.length;i++) {
        		if ( boxes[i].checked ){
        			params += '&menuId=' + boxes[i].value;
        		}
        	}
        	params += "&roleId=" + roleId;
            Pku.Common.ajax(UUR['sysRoleMenuSave'] + params,{},function(bln,response,o){
                var objRet = toJson(response.responseText);
                if(objRet.success){
                    Dialog.alert("保存成功");
                }else{
                    Dialog.alert(objRet.message);
                }
            });
        }
    }
    
    //查询角色资源,并渲染到相应tab
    function doRenderResourceList(roleId){
        if ( !roleId ) return;
        Pku.Common.ajax(UUR['sysRoleResourceList'] + "&roleId=" + roleId, {}, function(btn, response, o){
            var objRet = toJson(response.responseText);
            var resources = objRet.data;
                resourceSub =     '<span class="item-list">' + 
                                  '<input type="checkbox"  id="resource_{{resourceId}}" name="roleResourceBox" value="{{resourceId}}" {{checked}} />' + 
                                  '<label  for="resource_{{resourceId}}">{{resourceDesc}}</label></span>',
                renderHtml = '';
            //根据资源级别生成资源列表
            var createList = function(obj){
                var tempMenuId;
            	for ( var i = 0;i < obj.length;i++ ) {
                    if ( tempMenuId != obj[i]['menuId'] ) {
            		    tempMenuId = obj[i]['menuId'];
            		} else {
            			continue;
            		}
            		renderHtml += '<div class="resource-block">' + 
            		                '<div>' + 
            		                  '<span class="item-title">' + 
            		                    '<input type="checkbox" id="menuId_' + obj[i]['menuId'] + '" />' + 
            		                    '<label for="menuId_' + obj[i]['menuId'] + '">' + obj[i]['menuName'] + '</label>' + 
            		                  '</span>' + 
            		                '</div>';
            		for ( var j = 0;j < obj.length;j++ ) {
            			if ( tempMenuId == obj[j]['menuId'] ) {
            				renderHtml += resourceSub.replace(/{{(\w+)}}/g, function(markOut, markIn){
	                            return obj[j][markIn] != null ? obj[j][markIn] : '';
	                        });
	                    }
            		}
            		renderHtml += '</div>';
                }
            };
            createList(resources);
           
            Pku.getDom("role_resource").innerHTML = renderHtml + '<input type="hidden" id="resourceSelectAll" value="false">';
        });
    }
    
    //选择资源
    function doSelectResource(id){
        var o = Pku.getDom("resourceSelectAll");
        var b = (o.value === 'false') ? (function(){
            o.value = 'true';
            return true;
        }()) : (function(){
            o.value = 'false';
            return false;
        }());
        var event = event || window.event,
            src = event.target || event.srcElement,
            boxes,
            status;
        if ( !id 
                && (src.tagName.toUpperCase() !== 'INPUT' 
                 || src.parentNode.className !== 'item-title') ){
            return;
        }
        status = id ? b : src.checked;
        boxes = id ? Pku.getDom(id).getElementsByTagName("input") 
                   : src.parentNode.parentNode.parentNode.getElementsByTagName("input");
        for ( var i = 0;i < boxes.length;i++ ){
            if (boxes[i].type === 'checkbox') {
                boxes[i].checked = status;
            }
        }
    }
    
    //保存资源菜单
    function doSaveResourceToRole(){  
        var boxes,
            params,
            roleId = getRoleId();
        if ( roleId ) {
            boxes = document.resourceRoleFrm.roleResourceBox;
            if ( !boxes ) {
                return;
            }
            for (var i = 0;i < boxes.length;i++) {
                if ( boxes[i].checked ){
                    params += '&resourceId=' + boxes[i].value;
                }
            }
            params += "&roleId=" + roleId;
            Pku.Common.ajax(UUR['sysRoleResourceSave'] + params,{},function(bln,response,o){
                var objRet = toJson(response.responseText);
                if(objRet.success){
                    Dialog.alert("保存成功");
                }else{
                    Dialog.alert(objRet.message);
                }
            });
        }
    }
    
    //查询数据权限,并渲染到相应tab
    function doRenderPermitList(roleId){
        if ( !roleId ) return;
        Pku.Common.ajax(UUR['sysRolePermitList'] + "&roleId=" + roleId, {}, function(btn, response, o){
            var objRet = toJson(response.responseText);
            var permits = objRet.data;
                permitSub =     '<span class="item-list">' + 
                                  '<input type="checkbox"  id="permit_{{PERMIT_ID}}" name="rolePermitBox" value="{{PERMIT_ID}}" {{CHECKED}} />' + 
                                  '<label  for="permit_{{PERMIT_ID}}">{{PERMIT_NAME}}</label></span>',
                renderHtml = '';
            //根据资源级别生成资源列表
            var createList = function(obj){
                var tempMenuId;
            	for ( var i = 0;i < obj.length;i++ ) {
                    if ( tempMenuId != obj[i]['PERMIT_CODE'] ) {
            		    tempMenuId = obj[i]['PERMIT_CODE'];
            		} else {
            			continue;
            		}
            		renderHtml += '<div class="permit-block">' + 
            		                '<div>' + 
            		                  '<span class="item-title">' + 
            		                    '<input type="checkbox" id="permitId_' + obj[i]['PERMIT_CODE'] + '" />' + 
            		                    '<label for="permitId_' + obj[i]['PERMIT_CODE'] + '">' + obj[i]['PERMIT_CODE_DESC'] + '</label>' + 
            		                  '</span>' + 
            		                '</div>';
            		for ( var j = 0;j < obj.length;j++ ) {
            			if ( tempMenuId == obj[j]['PERMIT_CODE'] ) {
            				renderHtml += permitSub.replace(/{{(\w+)}}/g, function(markOut, markIn){
	                            return obj[j][markIn] != null ? obj[j][markIn] : '';
	                        });
	                    }
            		}
            		renderHtml += '</div>';
                }
            };
            createList(permits);
           
            Pku.getDom("role_permit").innerHTML = renderHtml + '<input type="hidden" id="permitSelectAll" value="false">';
        });
    }
    
    //选择资源
    function doSelectPermit(id){
        var o = Pku.getDom("permitSelectAll");
        var b = (o.value === 'false') ? (function(){
            o.value = 'true';
            return true;
        }()) : (function(){
            o.value = 'false';
            return false;
        }());
        var event = event || window.event,
            src = event.target || event.srcElement,
            boxes,
            status;
        if ( !id 
                && (src.tagName.toUpperCase() !== 'INPUT' 
                 || src.parentNode.className !== 'item-title') ){
            return;
        }
        status = id ? b : src.checked;
        boxes = id ? Pku.getDom(id).getElementsByTagName("input") 
                   : src.parentNode.parentNode.parentNode.getElementsByTagName("input");
        for ( var i = 0;i < boxes.length;i++ ){
            if (boxes[i].type === 'checkbox') {
                boxes[i].checked = status;
            }
        }
    }
    
    //保存资源菜单
    function doSavePermitToRole(){  
        var boxes,
            params,
            roleId = getRoleId();
        if ( roleId ) {
            boxes = document.getElementsByName("rolePermitBox");
            if ( !boxes ) {
                return;
            }
            for (var i = 0;i < boxes.length;i++) {
                if ( boxes[i].checked ){
                    params += '&permitId=' + boxes[i].value;
                }
            }
            params += "&roleId=" + roleId;
            Pku.Common.ajax(UUR['sysRolePermitSave'] + params,{},function(bln,response,o){
                var objRet = toJson(response.responseText);
                if(objRet.success){
                    Dialog.alert("保存成功");
                }else{
                    Dialog.alert(objRet.message);
                }
            });
        }
    }
    </script>
</head>
<body>
    <div title="角色管理" iconCls="icon-window" xtype="panel" region="center" pagingBar="true" forceFit="true" border="false">
        <div region="west" width="185">
            <div xtype="tbar">
                <div text="新增" iconCls="icon-add" onExtClick="doAddSysRole()"></div>
                <div text="-"></div>
                <div text="修改" iconCls="icon-update" onExtClick="doUpdateSysRole()"></div>
                <div text="-"></div>
                <div text="删除" iconCls="icon-delete" onExtClick="doDeleteSysRole()"></div>
                
            </div>
            <div id="roleTree" xtype="treepanel" border="false" onExtClick="doSelectRole()">
                <div xtype="root">
                	<div text="角色树" expanded="true">
                    	<c:forEach var="role" items="${roleList}">
                    	<div text="${role.roleName }" opurl="${role.roleId }"></div>
                    	</c:forEach>
                	</div>
                </div>
            </div>
        </div>
        <div region="center">
            <div id="roleTab" xtype="tabpanel" region="center" border="false">
                <div id="roleTabUser" title="关联用户" iconCls="icon-window" onExtActivate="doSelectTab(this)">
                    <div id="sysUserGrid" iconCls="icon-window" xtype="grid" region="center" pagingBar="true" pageSize="20" forceFit="true" border="false" >
                        <div xtype="tbar">
                            <div text="添加用户到角色" iconCls="icon-add" onExtClick="doAddUserToRole()" ></div>
                            <div text="-"></div>
                            <div text="从角色中删除用户" iconCls="icon-update" onExtClick="doDeleteUserFromRole()"></div>
                            <div text="->"></div>
                            <form id="frmQuery" name="frmQuery" method="post">
                                <table>
                                    <tr>
                                        <td>用户姓名：</td>
                                        <td>
                                            <input type="text" name="userName" />
                                            <input type="hidden" name="roleIdOper" value="in" />
                                            <input type="hidden" name="roleId" />
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
                            <div header="登录名" width="100" sortable="true" dataIndex="loginName"></div>
                            <div header="真实姓名" width="100" sortable="true" dataIndex="userName"></div>
                            <div header="警号" width="120" sortable="true" dataIndex="policeCode"></div>
                            <div header="所属单位" width="190" sortable="true" dataIndex="deptId" kind="dic" src="DIC_DEPT"></div>
                            <div header="当前状态" sortable="true" dataIndex="status" renderer="userStatusRender"></div>
                        </div>
                     </div>
                </div>
                <div id="roleTabMenu" title="菜单权限" iconCls="icon-window"  onExtActivate="doSelectTab(this)">
                    <div xtype="tbar">
                        <div text="保存#S" iconCls="icon-save" onExtClick="doSaveMenuToRole()" ></div>
                        <div text="-"></div>
                        <div text="全选#A" iconCls="icon-tick" onExtClick="doSelectMenu('role_menu')"></div>
                    </div>
                    <form id="menuRoleFrm" name="menuRoleFrm">
                        <div class="overflow"><div id="role_menu" class="role-item-panel" onclick="doSelectMenu()"></div></div>
                    </form>
                </div>
                <div id="roleTabResource" title="资源权限" iconCls="icon-window"  onExtActivate="doSelectTab(this)">
                    <div xtype="tbar">
                        <div text="保存#S" iconCls="icon-save" onExtClick="doSaveResourceToRole()" ></div>
                        <div text="-"></div>
                        <div text="全选#A" iconCls="icon-tick" onExtClick="doSelectResource('role_resource')"></div>
                    </div>
                    <form id="resourceRoleFrm" name="resourceRoleFrm">
                        <div class="overflow"><div id="role_resource"  class="role-item-panel" onclick="doSelectResource()"></div></div>
                    </form>
                </div>
                <div id="roleTabPermit" title="数据权限" iconCls="icon-window"  onExtActivate="doSelectTab(this)">
                    <div xtype="tbar">
                        <div text="保存#S" iconCls="icon-save" onExtClick="doSavePermitToRole()" ></div>
                        <div text="-"></div>
                        <div text="全选#A" iconCls="icon-tick" onExtClick="doSelectPermit('role_permit')"></div>
                    </div>
                    <form id="permitRoleFrm" name="permitRoleFrm">
                        <div class="overflow"><div id="role_permit"  class="role-item-panel" onclick="doSelectPermit()"></div></div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>