<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
	<title>添加字典条目信息</title>
	<style>
	.dic-edit-table{
		margin:40px 0 0 50px;
	}
	.dicItem-table{
    	font-size:12px;
    	padding:20px;
    	padding-left:50px;
    	
    }
    .dicItem-table td{
    	padding:4px;
    }
   	.dicItem-table td span{
		color:red;
	}
	</style>
	<script type="text/javascript">    
	//关闭本窗口
	function doClose(){
		ownerDialog.close();
	}
	
	//保存
	function doSaveSysDicItem(){
		var frm = Pku.getExt("addDicItemFrm");
		frm.submit();
	}
	
	//反馈
	function doResult(form, action){
		if ( !action.response ) {
			return ;
		}
		var objRet = toJson(action.response.responseText);
	    if ( objRet.success ){
    		ownerDialog.openerWindow["doSysDicItemQuery"]();
    		if('${sysDicItem.itemId}' != ''){ //修改
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
	
	// 检查重名参数名称
	function checkSysItemForm(obj){
		var itemCode = obj.value;
		if (itemCode==''){
			return ;
		}

		var urlParams = "&itemCode=" + itemCode;
		var dicName = "${sysDicItem.dicName}";
		urlParams+= "&dicName=" + dicName;
		Pku.Common.ajax("${ctx}/admin/checksysDicItemForm?" + Math.random() + urlParams,{},function(bln,response,o){
			var objRet = toJson(response.responseText);
			if(objRet.success){
				Pku.getDom("dicItemCode").innerHTML = " 已经存在";
				obj.focus();
			}else {
				Pku.getDom("dicItemCode").innerHTML = "";
			}
		});
	}
	</script>
</head>
<body>
	<div class="dic-edit-table">
		<form id="addDicItemFrm" url="${ctx}/admin/sysDicItemSave" method="post" onExtSuccess="doResult()" onExtFailure="doResult()">
		<table class="dicItem-table">
			<tr> 	
			    <td><span>*</span>字典条目编号</td>
				<td>
					<input type="text" id="itemCode" name="itemCode" value="${sysDicItem.itemCode}" must="true" maxlength="20" onblur1="checkSysItemForm(this)"/>
					<span id="dicItemCode"></span>
				</td>
			</tr>
			<tr> 
			    <td>字典条目名称</td>
				<td>
					<input type="text" name="itemValue" value="${sysDicItem.itemValue}" must="true" maxlength="60"/>
				</td>
			</tr>
			<tr> 
			    <td><span>*</span>是否有效</td>
				<td>
					<input type="radio" id="" name="visiable" style="height:13px;width:30px" value="1" ${sysDicItem.visiable != '0' ? "checked" : "" } /> 是
					<input type="radio" name="visiable" style="height:13px;width:30px" value="0" ${sysDicItem.visiable == '0' ? "checked" : "" } /> 否
				</td>
			</tr>
			<input type="hidden" name="itemId" value="${sysDicItem.itemId}" must="true"/>
			<input type="hidden" name="dicName" value="${sysDicItem.dicName}" must="true"/>
			<input type="hidden" name="orderFlag" value="${sysDicItem.orderFlag}" must="true"/>

       	</table>
		</form>
	</div>
</body>
</html>
