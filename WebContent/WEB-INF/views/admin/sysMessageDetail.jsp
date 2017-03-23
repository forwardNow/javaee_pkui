<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
    <title>消息详情</title>  
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
    	<table class="commonTable" style="width: 640px;">
    		<tr>
    			<td class="commonLable">发送人</td>
    			<td class="commonEdit">${sysMessage.sendUserName}</td>
    			<td class="commonLable">发送时间</td>
    			<td class="commonEdit"><fmt:formatDate value="${sysMessage.sendTime}" pattern="yyyy-MM-dd"/></td>
    		</tr>
    		<tr>
    			<td class="commonLable">接收人</td>
    			<td class="commonEdit">${sysMessage.receiveUserName}</td>
    			<td class="commonLable">消息类型</td>
    			<td class="commonEdit"><pku:dicValue dicName="DIC_MESSAGE_TYPE" itemCode="${sysMessage.msgType}" /></td>
    		</tr>
    		<tr>
    			<td class="commonLable">标题</td>
    			<td colspan="3">${sysMessage.msgTitle}</td>
    		</tr>
    		<tr>
    			<td class="commonLable">消息内容</td>
    			<td colspan="3" style="height:150px;">${sysMessage.msgContent}</td>
    		</tr>
    		<tr>
    			<td class="commonLable">是否阅读</td>
    			<td class="commonEdit"><pku:dicValue dicName="DIC_YESORNO" itemCode="${sysMessage.readFlag}" /></td>
    			<td class="commonLable">阅读时间</td>
    			<td class="commonEdit"><fmt:formatDate value="${sysMessage.receiveTime}" pattern="yyyy-MM-dd"/></td>
    		</tr>
    	</table>
    </div>
</body>
</html>




