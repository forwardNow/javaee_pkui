<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
    <title>数据权限表单</title>  
    <style type="text/css">
	    .user-panel{
	        margin:10px 0 0 30px;
	        font-size:12px;
	    }
	    .user-panel .row-panel{
	        display: inline-block;
	        padding-top: 5px;
	    }
	    .user-panel .row-panel .label{
	        width:120px;
	        text-align:right;
	        padding-right: 5px;
	        float: left;
	    }
	    .user-panel .row-panel .label span{
	        color:red;
	    }
	    .user-panel .row-panel .edit{
	    	text-align: left;
	        float: left;
	    }
	    .user-panel .row-panel .clear{
	    	clear: both;
	    }
    </style>
    <script type="text/javascript">	
		//关闭本窗口
		function doClose(){
			ownerDialog.close();
		}
		
		//保存
		function doSaveSysPermit(){
			var frm = Pku.getExt("frmPost");
			frm.submit();
		}
		
	    //反馈
	    function doResult(form, action){
	        var objRet = toJson(action.response.responseText);
	        if ( objRet.success ){
	        	ownerDialog.openerWindow["doSysPermitQuery"]();
	        	Dialog.alert("操作成功",function(){
        			doClose();
        		});
	        } else {
	        	Dialog.alert(objRet.message);
	        }
	    }
	    
	</script>
</head>
<body>
    <div class="user-panel">
        <form id="frmPost" name="frmPost" url="${ctx}/admin/sysPermitSave" method="post" onExtSuccess="doResult()" onExtFailure="doResult()">
            <input type="hidden" name="permitId" value="${sysPermit.permitId }" />    
            <div class="row-panel">
            	<div class="label">
                	<span>*</span>数据权限类型
            	</div>
                <div class="edit">
                	<input type="text" _name="permitCode" value="${sysPermit.permitCode }" kind="dic" src="DIC_PERMIT_TYPE" must="true" />  
                </div>
                <div class="clear"></div>
            </div>
            <div class="row-panel">
                <div class="label">
                	<span>*</span>数据权限名称
                </div>
                <div class="edit">
                	<input type="text" name="permitName" value="${sysPermit.permitName }" maxlength="32" must="true" />  
                </div>
                <div class="clear"></div>
            </div>
            <div class="row-panel">
            	<div class="label">
                	<span>*</span>数据权限值
                </div>
                <div class="edit">
	                <textarea name="permitValue" maxLength="64" rows="4" cols="50" allowBlank="false">${sysPermit.permitValue }</textarea>  
                </div>
                <div class="clear"></div>
            </div>
            <c:if test="${sysPermit != null}">
            <div class="row-panel">
            	<div class="label">
                	<span>*</span>排序
                </div>
                <div class="edit">
	                <input type="text" name="orderFlag" value="${sysPermit.orderFlag }" kind="int" maxlength="4" must="true" />  
                </div>
                <div class="clear"></div>
            </div>
            </c:if>
            <div class="row-panel">
            	<div class="label">
                	备注
                </div>
                <div class="edit">
	                <textarea name="permitDesc" maxLength="64" rows="5" cols="50">${sysPermit.permitDesc }</textarea>  
                </div>
                <div class="clear"></div>
            </div>
        </form>
    </div>
</body>
</html>




