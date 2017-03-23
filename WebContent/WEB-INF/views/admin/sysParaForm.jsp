<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
	<title>新增参数信息</title>
	<style>
	.psr{position:relative;}.psa{position:absolute;}
	.para-edit{
		padding:10px;
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
	
	// 检查重名参数名称
	function checksysParaForm(obj){
		var paraCode = obj.value;
		if (paraCode==''){
			return ;
		}
		
		if( /[^\w\.\/]/g.test(paraCode) ) {
			Pku.getDom("dicNameMsg").innerHTML = "只能输入英文字母和数字";
			obj.focus();
			return ;
		}
		var urlParams = "&paraCode=" + paraCode;
		Pku.Common.ajax("${ctx}/admin/checksysParaForm?" + Math.random() + urlParams,{},function(bln,response,o){
			var objRet = toJson(response.responseText);
			if(objRet.success){
				Pku.getDom("dicNameMsg").innerHTML = " 已经存在";
				obj.focus();
			}else {
				Pku.getDom("dicNameMsg").innerHTML = "";
			}
		});
	}
	
	//保存
	function doSaveSysPara(){
		var frm = Pku.getExt("addParaFrm");
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
    		if("${sysPara.paraCode}" != ''){ //修改
    			//关闭表单窗口
	    		doClose();
    			Dialog.alert("修改成功.");
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
	<form id="addParaFrm" url="${ctx}/admin/sysParaSave" method="post" onExtSuccess="doResult()" onExtFailure="doResult()">
		<div class="para-edit">
			<div>
				<label><span>*</span>参数编码</label>
				<input type="text" name="paraCode" kind="text" value="${sysPara.paraCode}" maxlength="30" must="true" >
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
				<label style="vertical-align:top;">备注</label>
				<textarea style="width:180px;height:45px;" name="paraDesc"  maxLength="60" >${sysPara.paraDesc}</textarea>
			</div>
		</div>
	</form>
</body>
</html>
