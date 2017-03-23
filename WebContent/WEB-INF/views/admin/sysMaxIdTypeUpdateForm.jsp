<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
	<title>编辑编号类型信息</title>
	<style>
	.psr{position:relative;}.psa{position:absolute;}
	.maxidy-edit{
		padding:10px;
		font-size:12px;
	}
	.maxidy-edit div{
		height:30px;
		line-height:30px;
	}
	.maxidy-edit label{
		display:inline-block;
		width:90px;
		text-align:right;
	}
	.maxidy-edit span{
		color:red;
	}
	</style>
	<script type="text/javascript">    
	//关闭本窗口
	function doClose(){
		ownerDialog.close();
	}
	
	//保存
	function doSaveSysMaxIdType(){
		
		var begin = document.updateMaxIdTypeFrm.idBegin.value;
		var end = document.updateMaxIdTypeFrm.idEnd.value;
		if(end < begin){
			Dialog.alert("最大值必须大于最小值");
			return ;
		}else{
			var frm = Pku.getExt("updateMaxIdTypeFrm");
			frm.submit();
		}
	}
	
	//反馈
	function doResult(form, action){
		var objRet = toJson(action.response.responseText);
	    if ( objRet.success ){
    		ownerDialog.openerWindow["doSysMaxIdTypeListQuery"]();
    		if('${sysMaxIdType.idType}' != ''){ //修改
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
	</script>
</head>
<body>
	<form id="updateMaxIdTypeFrm" name="updateMaxIdTypeFrm" url="${ctx}/admin/sysMaxIdTypeSave" method="post" onExtSuccess="doResult()" onExtFailure="doResult()">
		<div class="maxidy-edit">
			<div>
             	<label><span>*</span>编号类型:</label>
                <input type="text" name="idType" kind="int" value="${sysMaxIdType.idType}" maxlength="6" must="true" readonly/>
				<span id="idTypeMsg"></span>
			</div>
			<div>
             	<label><span>*</span>编号名称:</label>
                <input type="text" name="idName" kind="text" value="${sysMaxIdType.idName}" maxlength="15" must="true"/>
				<span id="idTypeMsg"></span>
			</div>
			<div>
				<label><span>*</span>编号长度:</label>
				<input type="text" name="idSize" kind="int" value="${sysMaxIdType.idSize}" maxlength="16" must="true" />
			</div>
			<div>
				<label><span>*</span>最小值:</label>
				<input type="text" name="idBegin" kind="int" value="${sysMaxIdType.idBegin}" maxlength="16" must="true" />
			</div>
			<div>
				<label><span>*</span>最大值:</label>
				<input type="text" name="idEnd" kind="int" value="${sysMaxIdType.idEnd}" maxlength="16" must="true" />
			</div>
			<div class="psr">
                <div class="psa" style="top:0px;left:0px;">
                    <label><span>*</span>是否可循环:</label>
                </div>
                <div class="psa" style="top:0px;left:93px;">
	                <input type="radio" style="height:13px;width:30px" name="idLoop" value="1" ${sysMaxIdType.idLoop != '0' ? "checked" : "" } /> 是
					<input type="radio" style="height:13px;width:30px" name="idLoop" value="0" ${sysMaxIdType.idLoop == '0' ? "checked" : "" } /> 否
                </div>
			</div>
			<div>
                <label style="vertical-align:top;"><span></span>描述:</label>
                <textarea style="width:180px;height:45px;"  name="idDes"  maxLength="60" must="true" >${sysMaxIdType.idDes}</textarea>
			</div>
		</div>
	</form>
</body>
</html>
