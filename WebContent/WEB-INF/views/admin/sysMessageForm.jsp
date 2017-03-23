<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
    <title>消息表单</title>  
    <style type="text/css">
	    .commonTable{font-size:12px;border-collapse:collapse;}  
		.commonTable td{border:1px #B0C4DE solid;padding:5px 2px;}  
		.commonTable .commonLable{width:15%;background-color: #F0F8FF;text-align: right;}
		.commonTable .commonLable span{padding-right:3px;color: red;}
		.commonTable .commonEdit{width: 35%;}
    </style>
    <script type="text/javascript">	
		//关闭本窗口
		function doClose(){
			ownerDialog.close();
		}
		
		//保存
		function doSaveSysMessage(){
			Ext.getDom("receiveUserName").value = Ext.getDom("receiveUserId").value;
			var frm = Pku.getExt("frmPost");
			frm.submit();
		}
		
	    //反馈
	    function doResult(form, action){
	        var objRet = toJson(action.response.responseText);
	        if ( objRet.success ){
	        	//ownerDialog.openerWindow["doSysMessageQuery"]();
	        	Dialog.alert("发送成功",function(){
        			doClose();
        		});
	        } else {
	        	Dialog.alert(objRet.message);
	        }
	    }
	    
	</script>
</head>
<body>
	<div style="padding:10px;">
    <form id="frmPost" url="${ctx}/admin/sysMessageSave" method="post" onExtSuccess="doResult()" onExtFaiure="doResult()" >
    	<table class="commonTable" style="width: 640px;">
    		<tr>
    			<td class="commonLable"><span>*</span>接收人</td>
    			<td class="commonEdit"><input id="receiveUserId" type="text" _name="receiveUserId" kind="dic" src="${ctx}/admin/sysMessageUserData" must="true"/></td>
    			<td class="commonLable"><span>*</span>消息类型</td>
    			<td class="commonEdit"><input type="text" _name="msgType" kind="dic" src="DIC_MESSAGE_TYPE" value="10" readOnly/></td>
    		</tr>
    		<tr>
    			<td class="commonLable"><span>*</span>标题</td>
    			<td colspan="3"><input type="text" name="msgTitle" style="width: 465px" must="true" /></td>
    		</tr>
    		<tr>
    			<td class="commonLable"><span>*</span>消息内容</td>
    			<td colspan="3"><textarea name="msgContent" cols="90" rows="10" must="true"></textarea></td>
    		</tr>
    	</table>
		<input type="hidden" id="msgId" name="msgId" value="${sysMessage.msgId}" />
		<input type="hidden" id="receiveUserName" name="receiveUserName" value="${sysMessage.receiveUserName}" />
    </form>
    </div>
</body>
</html>




