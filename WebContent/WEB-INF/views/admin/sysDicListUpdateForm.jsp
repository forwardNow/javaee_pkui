<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
	<title>修改字典信息</title>
	<style>
	.psr{position:relative;}.psa{position:absolute;}
	.DicList-edit{
		padding:20px;
		font-size:12px;
	}
	.DicList-edit div{
		height:30px;
		line-height:30px;
	}
	.DicList-edit label{
		display:inline-block;
		width:90px;
		text-align:right;
	}
	.DicList-edit span{
		color:red;
	}
	</style>
	<script type="text/javascript">    
	//关闭本窗口
	function doClose(){
		ownerDialog.close();
	}
	
	//保存
	function doSaveSysDicList(){
		var frm = Pku.getExt("updateDicListFrm");
		frm.submit();
	}
	
	//反馈
	function doResult(form, action){
		if ( !action.response ) {
			return ;
		}
		var objRet = toJson(action.response.responseText);
    		ownerDialog.openerWindow["doSysDicListQuery"]();
	    if ( objRet.success ){
    		if('${sysDicList.dicName}' != ''){ //修改
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
	
	function editablemsg(obj){
		if(obj.value == 0){
			Dialog.alert("提交后此字典将不能再被修改，是否继续？");
		}
	}
	</script>
</head>
<body>
	<form id="updateDicListFrm" url="${ctx}/admin/sysDicListSave" method="post" onExtSuccess="doResult()" onExtFailure="doResult()">
		<div class="DicList-edit">
			<div>
				<label><span>*</span>字典名称</label>
				<input type="text" id="dicName" name="dicName" value="${sysDicList.dicName}" must="true" maxlength="30" readonly/>
			    <span id="dicNameMsg"></span>
			</div>
			<div>
				<label><span></span>字典标准</label>
				<input type="text" name="dicStandard" value="${sysDicList.dicStandard}" maxlength="60" />
			</div>
			<div class="psr">
				<div class="psa" style="top:0px;left:0px;">
					<label><span>*</span>是否可编辑</label>
				</div>	
				<div class="psa" style="top:3px;left:93px;">	
					<input type="radio" name="editable" style="height:13px;width:30px" value="1" ${sysDicList.editable != '0' ? "checked" : "" } /> 是
					<input type="radio" name="editable" style="height:13px;width:30px" value="0" ${sysDicList.editable == '0' ? "checked" : "" }  onclick="editablemsg(this)"/> 否
				</div>
			</div>
			<div class="psr">
			    <div class="psa" style="top:0px;left:0px;">
				    <label><span>*</span>是否有效</label>
				</div>
				<div class="psa" style="top:0px;left:93px;">
					<input type="radio" name="visiable" style="height:13px;width:30px" value="1" ${sysDicList.visiable != '0' ? "checked" : "" } /> 是
					<input type="radio" name="visiable" style="height:13px;width:30px" value="0" ${sysDicList.visiable == '0' ? "checked" : "" } /> 否
				</div>
			</div>
			<div>
                <label style="vertical-align:top;"><span></span>字典描述</label>
                <textarea style="width:180px;height:45px;" name="dicDesc"  maxLength="60" must="true" >${sysDicList.dicDesc}</textarea>
			</div>
		</div>
	</form>
</body>
</html>
