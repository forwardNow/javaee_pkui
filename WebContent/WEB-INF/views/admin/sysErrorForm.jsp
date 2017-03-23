<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
    <title>编辑错误号信息</title>  
    <style type="text/css">
    	.psa{position:absolute;}.psr{position:relative;}
    	.psa{position:absolute;}.psr{position:relative;}
		.bdr{border-right:solid 1px #cfcfcf;}.bdb{border-bottom:solid 1px #efefef;}

		.error-edit-baseinfo{
			margin-top:40px;
			margin-left:0px;
		    color:#0a3f6c;
		    padding:5px;
		    font-size:12px;
		}
		.error-edit-baseinfo div{
		    height:30px;
	        line-height:30px;
		}
	    .error-edit-baseinfo label{
	        display:inline-block;
	        width:100px;
	        text-align:right;
	    }
	    .error-edit-baseinfo span{
	        color:red;
	    }
    </style>
    <script type="text/javascript">	
		//json格式字符串转对象
	    function toObj(str){
	        return eval('(' + str + ')');
	    }
		
		//关闭本窗口
		function doClose(){
			ownerDialog.close();
		}
		
		//保存
		function doSaveSysError(){
			var frm = Pku.getExt("addErrorFrm");
			frm.submit();
		}
		
	    //反馈
	    function doResult(form, action){
	        var objRet = toObj(action.response.responseText);
	        if ( objRet.success ){
	        	ownerDialog.openerWindow["doSysErrorQuery"]();
	        	if('${sysError.errorId}' != ''){ //修改
	        		//关闭表单窗口
	        		Dialog.alert("修改成功",function(){
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
	    
	    //存储修改前错误号值
	    var initErrorCode; 
	    window.onload = function(){
	    	initErrorCode = Pku.getDom("errorCode").value;
	    }
	    //查询错误号
	    function checkSysErrorListForm(){
	    	var errorCode = Pku.getDom("errorCode").value;
	    	var errorId = Pku.getDom("errorId").value;
	    	//修改
	    	if(errorId !=""){
	    		if(errorCode != initErrorCode){
	    			var urlParams = "&errorCode=" + errorCode;
	    	    	Pku.Common.ajax("${ctx}/admin/checkSysErrorListForm?" + Math.random() + urlParams,{},function(bln,response,o){
	    				var objRet = toJson(response.responseText);
	    				if(objRet.success){
	    					Pku.getDom("errorCodeMsg").innerHTML = "错误号 "+ errorCode+" 已经存在";
	    					Pku.getDom("errorCode").value ="";
	    				}else {
	    					Pku.getDom("errorCodeMsg").innerHTML = "";
	    				}
	    			});
	    			
	    		}
	    		return ;
	    	}
	    	var urlParams = "&errorCode=" + errorCode;
	    	Pku.Common.ajax("${ctx}/admin/checkSysErrorListForm?" + Math.random() + urlParams,{},function(bln,response,o){
				var objRet = toJson(response.responseText);
				if(objRet.success){
					Pku.getDom("errorCodeMsg").innerHTML = "错误号 "+ errorCode+" 已经存在";
					Pku.getDom("errorCode").value ="";
				}else {
					Pku.getDom("errorCodeMsg").innerHTML = "";
				}
			});
	    }
	    function beforeSubmit(){
	    	checkSysErrorListForm();
	    }
	    function errorCodeFocus(){
	    	Pku.getDom("errorCodeMsg").innerHTML = "";
	    }
	</script>
</head>
<body>
    <form id="addErrorFrm" url="${ctx}/admin/sysErrorSave" method="POST" onExtBeforeaction="beforeSubmit()" onExtSuccess="doResult()" onExtFaiure="doResult()" >
		<input type="hidden" id="errorId" name="errorId" value="${sysError.errorId}" />
    	<div class="error-edit-baseinfo">
			<div>
                <label><span>*</span>错误号：</label>
                <input type="text" id="errorCode" name="errorCode" kind="int" value="${sysError.errorCode}"  maxlength="6" must="true" onfocus="errorCodeFocus()" />
            	<span id="errorCodeMsg"></span>
            </div>
            <div>
                <label><span>*</span>错误信息：</label>
                <input type="text" name="errorInfo" value="${sysError.errorInfo}"  maxlength="30" must="true" />
            </div>		
    	</div>
    </form>
</body>
</html>




