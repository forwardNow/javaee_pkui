<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
	<title>修改最大编号信息</title>
	<style>
	.maxid-edit{
		padding:25px;
		font-size:12px;
	}
	.maxid-edit div{
		height:30px;
		line-height:30px;
	}
	.maxid-edit label{
		display:inline-block;
		width:90px;
		text-align:right;
	}
	.maxid-edit span{
		color:red;
	}
	</style>
	<script type="text/javascript">    
	//关闭本窗口
	function doClose(){
		ownerDialog.close();
	}
	
	//保存
	function doSaveSysMaxId(){
		var frm = Pku.getExt("updateMaxIdTypeFrm");
		frm.submit();
	}
	
	//反馈
	function doResult(form, action){
		var objRet = toJson(action.response.responseText);
	    if ( objRet.success ){ 
	    	ownerDialog.openerWindow["doSysMaxIdQuery"]();
    		if('${sysMaxId.idType}' != ''){ //修改
    			//关闭表单窗口
    			Dialog.alert("修改成功.",function(){
    				doClose();
    			});
    		}
			
	    } else {
	    	Dialog.alert(objRet.message,function(){
	    		doClose();
	    	});
	    }
	}
	</script>
</head>
<body>
	<form id="updateMaxIdTypeFrm" url="${ctx}/admin/sysMaxIdSave" method="post" onExtSuccess="doResult()" onExtFailure="doResult()">
		<div class="maxid-edit">

			<input type="hidden" name="idType" value="${sysMaxId.idType}" />  

			<div>
             	<label><span>*</span>参数一</label>
                <input type="text" name="idPara1" kind="int" value="${sysMaxId.idPara1}" maxlength="100" readonly />
			</div>
			<div>
				<label><span>*</span>参数二</label>
				<input type="text" name="idPara2" kind="int" value="${sysMaxId.idPara2}" maxlength="100" readonly />
			</div>
			<div>
				<label><span>*</span>最大编号</label>
				<input type="text" name="idCurrValue" kind="int"  value="${sysMaxId.idCurrValue}" must="true" />
			</div>
		</div>
	</form>
</body>
</html>
