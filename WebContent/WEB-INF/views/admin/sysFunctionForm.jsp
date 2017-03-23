<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
    <title>编辑功能号信息</title>  
    <style type="text/css">
    	.psa{position:absolute;}.psr{position:relative;}
    	.psa{position:absolute;}.psr{position:relative;}
		.bdr{border-right:solid 1px #cfcfcf;}.bdb{border-bottom:solid 1px #efefef;}

		.function-edit-baseinfo{
			margin-left:20px;
		    color:#0a3f6c;
		    padding:5px;
		    font-size:12px;
		}
		.function-edit-baseinfo div{
		    height:30px;
	        line-height:30px;
		}
	    .function-edit-baseinfo label{
	        display:inline-block;
	        width:100px;
	        text-align:right;
	    }
	    .function-edit-baseinfo span{
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
		function doSaveSysFunction(){
			var frm = Pku.getExt("addFunctionFrm");
			frm.submit();
		}
		
	    //反馈
	    function doResult(form, action){
	        var objRet = toObj(action.response.responseText);
	        if ( objRet.success ){
	        	ownerDialog.openerWindow["doSysFunctionQuery"]();
	        	if('${sysFunction.functionId}' != ''){ //修改
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
	    var initFunctionCode; 
	    window.onload = function(){
	    	initFunctionCode = Pku.getDom("functionCode").value;
	    }
	    //查询功能号
	    function checkSysFunctionListForm(){
	    	var functionCode = Pku.getDom("functionCode").value;
	    	var functionId = Pku.getDom("functionId").value;
	    	//修改
	    	if(functionId !=""){
	    		if(functionCode != initFunctionCode){
	    			var urlParams = "&functionCode=" + functionCode;
	    	    	Pku.Common.ajax("${ctx}/admin/checksysFunctionListForm?" + Math.random() + urlParams,{},function(bln,response,o){
	    				var objRet = toJson(response.responseText);
	    				if(objRet.success){
	    					Pku.getDom("functionCodeMsg").innerHTML = "功能号 "+ functionCode+" 已经存在";
	    					Pku.getDom("functionCode").value = "";
	    				}else {
	    					Pku.getDom("functionCodeMsg").innerHTML = "";
	    				}
	    			});	
	    		}
	    		return ;
	    	}
	    	var urlParams = "&functionCode=" + functionCode;
	    	Pku.Common.ajax("${ctx}/admin/checksysFunctionListForm?" + Math.random() + urlParams,{},function(bln,response,o){
				var objRet = toJson(response.responseText);
				if(objRet.success){
					Pku.getDom("functionCodeMsg").innerHTML = "功能号 "+ functionCode+" 已经存在";
					Pku.getDom("functionCode").value = "";
				}else {
					Pku.getDom("functionCodeMsg").innerHTML = "";
				}
			});
	    }
	    function beforeSubmit(){
	    	checkSysFunctionListForm();
	    }
	    function functionCodeFocus(){
	    	Pku.getDom("functionCodeMsg").innerHTML = "";
	    }
	    
	    //同步字典值与编码
	    function setCode(id) {
        	var code = Pku.getDom(id + "_value").code;
        if ( code != undefined ) {
            Pku.getDom(id + "_code").value = code;
        }
    }
	    
	</script>
</head>
<body>
    <form id="addFunctionFrm" url="${ctx}/admin/sysFunctionSave" method="POST" onExtBeforeaction="beforeSubmit()" onExtSuccess="doResult()" onExtFaiure="doResult()" >
		<input type="hidden" name="pku_token" value="${pku_token}" />
		<input type="hidden" id="functionId" name="functionId" value="${sysFunction.functionId}" />
    	<div class="function-edit-baseinfo">
			<div>
                <label><span>*</span>功能号：</label>
                <input type="text" id="functionCode" name="functionCode" kind="int" value="${sysFunction.functionCode}" maxlength="6" must="true" onfocus="functionCodeFocus()"/>
            	<span id="functionCodeMsg"></span>
            </div>
            <div>
                <label><span>*</span>功能名称：</label>
                <input type="text" name="functionName"  value="${sysFunction.functionName}"  maxlength="30" must="true" />
            </div>
            <div class="psr">
	            <div>
	                <label><span>*</span>操作类型：</label>
	            </div>
	            <div class="psa" style="top:5px;left:103px;">
	              	<input type="text" id="operationType_value" _name="operationType" kind="dic" src="DIC_OPERATE_TYPE" value="${sysFunction.operationType}" must="true" />
	            </div>
            </div>
            <div class="psr">
	            <div>
	                <label><span>*</span>日志类型：</label>
	            </div>
	            <div class="psa" style="top:5px;left:103px;">
	              	<input type="text" _name="logType" kind="dic" src="DIC_LOG_TYPE" value="${sysFunction.logType}" must="true" />
	            </div>
            </div>		
            <div class="psr">
                <label><span>*</span>模块：</label>
                <div class="psa" style="top:5px;left:103px;">
                	<input type="text" _name="module" kind="dic" src="DIC_MODULE" value="${sysFunction.module}"  maxlength="16" must="true" />
            	</div>
            </div>
            <div class="psr">						
				<div>
	                <label>子模块：</label>
	            </div>
	        	<div class="psa" style="top:5px;left:103px;">
	            	<input type="text" _name="submodule" kind="dic" src="DIC_SUB_MODULE" value="${sysFunction.submodule}" />
	        	</div>
			</div>
    	</div>
    </form>
</body>
</html>




