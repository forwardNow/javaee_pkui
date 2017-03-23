<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
	<title>编辑单位信息</title>
	<style>
	.psr{position:relative;}.psa{position:absolute;}
	.para-edit{
		padding:20px;
		font-size:12px;
	}
	.para-edit div{
		height:30px;
		line-height:30px;
	}
	.para-edit label{
		display:inline-block;
		width:90px;
		text-align:right;
	}
	.para-edit span{
		color:red;
	}
	</style>
	<script type="text/javascript">    
	//关闭本窗口
	function doClose(){
		ownerDialog.close();
	}
	
	//保存
	function doSaveSysPara(){
		var frm = Pku.getExt("UpdateParaFrm");
		frm.submit();
	}
	
	//反馈
	function doResult(form, action){
		if ( !action.response ) {
			return ;
		}
		var objRet = toJson(action.response.responseText);
	    if ( objRet.success ){
    		ownerDialog.openerWindow["doQuerySysPara"]();
    		if('${sysPara.paraCode}' != ''){ //修改
    			//关闭表单窗口
    			Dialog.alert("修改成功.", function(){
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
	
	function visiablemsg(obj){
		if(obj.value == 0){
			Dialog.alert("提交后此参数将不能再被修改，是否继续？");
		}
	}
	</script>
</head>
<body>
	<form id="UpdateParaFrm" url="${ctx}/admin/sysParaSave" method="post" onExtSuccess="doResult()" onExtFailure="doResult()">
		<input type="hidden" name="oldParaCode" value="${sysPara.paraCode}" />
		<div class="para-edit">
			<div>
				<label><span>*</span>参数编码</label>
				<input type="text" name="paraCode" kind="text" value="${sysPara.paraCode}" maxlength="30" readOnly />
				<span id="dicNameMsg"></span>
			</div>
			<div>
				<label><span>*</span>参数名称</label>
				<input type="text" name="paraName" kind="text" value="${sysPara.paraName}" maxlength="30" must="true">
			</div>
			<div>
             	<label><span>*</span>参数值</label>
                <input type="text" name="paraValue" kind="text" value="${sysPara.paraValue}" maxlength="60" must="true" />
			</div>
			
			<div class="psr">
				<div class="psa" style="top:0px;left:0px;">
					<label><span>*</span>可否编辑</label>
				</div>
				<div class="psa" style="top:0px;left:93px;">
					<input type="radio" name="visiable" value="1" ${sysPara.visiable != '0' ? "checked" : "" } /> 是
					<input type="radio" name="visiable" value="0" ${sysPara.visiable == '0' ? "checked" : "" } onclick="visiablemsg(this)"/> 否
				</div>
			</div>
			<div>
				<label style="vertical-align:top;">参数说明</label>
				<textarea style="width:180px;height:45px;" name="paraDesc"  maxLength="60" >${sysPara.paraDesc}</textarea>
			</div>
		</div>
	</form>
</body>
</html>
