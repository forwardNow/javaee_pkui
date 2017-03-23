<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
    <title>编辑资源信息</title>
    <style>
    .pa{position:absolute;}.pr{position:relative;}

    .resource-edit-baseinfo{
        padding:20px;
        font-size:12px;
    }
    .resource-edit-baseinfo div{
        height:30px;
        padding-top:2px;
    }
    .resource-edit-baseinfo label{
        display:inline-block;
        width:90px;
        text-align:right;
    }
    .resource-edit-baseinfo span{
        color:red;
    }
    </style>
    
    <script type="text/javascript"> 
    //链接资源
    var UUR =  {
        //选择菜单
        'sysResourceMenu' : '${ctx}/admin/sysResourceMenu?random=' + Math.random(),
        //树节点查询链接
        'sysMenuTreeData' : '${ctx}/admin/sysMenuTreeData?random=' + Math.random()
    };
    
    //json格式字符串转对象
    function toObj(str){
        return eval('(' + str + ')');
    }
    
    //关闭本窗口
    function doClose(){
        ownerDialog.close();
    }
    
    //资源选择菜单
    function doSysResourceMenu(){       
        var diag = new Dialog();
        diag.Title = "选择菜单";
        diag.Width =230;
        diag.Height = 400;
        diag.URL = UUR.sysResourceMenu;
        diag.show();

    }

    
    //查询得到资源对应的菜单名称
    function menuNameSelect(){
        var menuId = getDom("menuId").value;
        if(menuId == null){return;}
        Pku.Common.ajax(UUR.sysMenuTreeData+"&menuId=" +menuId,{},function(bln,response,o){
            var objRet = toJson(response.responseText);
            var menuName;
            try {
                menuName = objRet['data']['menuName'];
            } catch (err) {
            }
            if(menuName != null){
                getDom("menuName").value = menuName;
            }
        });
    }
    
    //验证资源名称是否重复
    function checkSysResourceName(obj){
		var resourceName = obj.value;
        var resourceId = getDom("resourceId").value;
		if (resourceId!=''){
			return ;
		}
		var urlParams = "&resourceName=" + resourceName;
		Pku.Common.ajax("${ctx}/admin/sysResourceCheckName?" + Math.random() + urlParams,{},function(bln,response,o){
			var objRet = toJson(response.responseText);
			if(objRet.success){
				Pku.getDom("resourceNameMsg").innerHTML = "资源名称 "+ resourceName +" 已经存在";
				obj.focus();
			}else {
				Pku.getDom("resourceNameMsg").innerHTML = "";
			}
		});
	}
    
    //保存
    function doSaveSysResource(){
        var frm = Pku.getExt("addResourceFrm");
        frm.submit();
    }
    
    //反馈
    function doResult(form, action){
        var objRet = toObj(action.response.responseText);
        if ( objRet.success ){
            ownerDialog.openerWindow["reloadResource"]();
            if('${sysResource.resourceId}' != ''){ //修改
                //关闭表单窗口
                doClose();
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
    
    function reloadMenu(){
        Pku.getExt("addResourceFrm").store.load();
    }
      
    Ext.onReady(function(){menuNameSelect(); });
    
    </script>
</head>
<body>
    <form id="addResourceFrm" url="${ctx}/admin/sysResourceSave" method="POST"  onExtSuccess="doResult()" onExtFaiure="doResult()">
        <input type="hidden" name="resourceId" value="${sysResource.resourceId}"/>
        <input type="hidden" name="resourceLevel" value="0"/>
        <div class="resource-edit-baseinfo">
            <div>
                <label><span>*</span>资源名称：</label>
                <input type="text" id="resourceName" name="resourceName" value="${sysResource.resourceName}"  
                <c:if test="${sysResource.resourceId != null}">readonly="readonly"</c:if>
                 maxlength="30" must="true"  onblur="checkSysResourceName(this)"/>
                <span id="resourceNameMsg"></span>
            </div>
            <div>
                <label><span>*</span>资源路径：</label>
                <input type="text" name="resourceUrl" value="${sysResource.resourceUrl}"  maxlength="30" must="true" />
            </div>
            <div class="pr">
                <div class="pa" style="margin-top:2px;">
               		<label><span>*</span>资源菜单：</label>
               	</div>
               	<div class="pa" style="MARGIN-left:96px;">
		            <input type="hidden" id="menuId" name="menuId" value="${sysResource.menuId}"/>
		            <input type="text" iconCls="icon-delete" id="menuName"  name="menuName" maxlength="30" readonly="readonly" must="true"/>
                	<img alt="选择菜单" width="16" height="16" src="../static/images/icons/16x16/zoom.png" onclick="doSysResourceMenu()" />
                </div>
            </div>      
            <div>
                <label style="vertical-align:top;"><span></span>资源描述：</label>
                <textarea style="width:250px;height:60px;" id="resourceDesc" name="resourceDesc"  maxLength="128" >${sysResource.resourceDesc}</textarea>
            </div>
      </div>
    </form>
</body>
</html>




