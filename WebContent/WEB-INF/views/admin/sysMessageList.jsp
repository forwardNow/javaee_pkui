<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
	<title>消息列表</title>
	<script type="text/javascript">
	//资源
	var UUR = ErrorUrlResource = {
        // 新增
        'sysMessageAdd' : '${ctx}/admin/sysMessageForm?' + Math.random(),
        // 删除
        'sysMessageDelete' : '${ctx}/admin/sysMessageDelete?' + Math.random(),
        // 查看
        'sysMessageDetail' : '${ctx}/admin/sysMessageDetail?' + Math.random()
	};
	
	// 发送新消息
	function doAddSysMessage(){
		var diag = new Dialog();
	    diag.Width =700;
        diag.Height = 300;
        diag.Title = "发送新消息";
        diag.URL = UUR.sysMessageAdd;
        diag.OKEvent = function(){
        	 diag.innerWin["doSaveSysMessage"]();
        }
        diag.show();
	}
	
	//删除消息
	function doDeleteSysMessage(isSend,frmName,gridId,btn){
        var sel = Pku.getExt(gridId).getSelectionModel().getSelections();
        if(sel.length > 0){
            Dialog.confirm("确认删除选中记录？", function(){
                var urlParams = "";
                for ( var i = 0;i < sel.length;i++ ){
                    urlParams += "&msgId=" + sel[i].get("msgId");
                }
                btn.disable();
                var url = UUR.sysMessageDelete;
                if(isSend){
	                url += "&isSend=true";
                }else{
	                url += "&isSend=false";
                }
                Pku.Common.ajax(url + urlParams,{},function(bln,response,o){
                    btn.enable();
                    var objRet = toJson(response.responseText);
                    if(objRet.success){
                        Dialog.alert("删除成功");
                        doSysMessageQuery(frmName,gridId);
                    }else{
                        Dialog.alert(objRet.message);
                    }
                });
            });
        }else{
            Dialog.alert("请选中记录");
        }
	}
	
	//查询信息
	function doSysMessageQuery(frmName,gridId){
        Pku.getExt(gridId).store.baseParams.msgTitle = Ext.getDom(frmName).msgTitle.value;
        Pku.getExt(gridId).store.load();
	}
	
    //双击行
    function onRowdblclick(data){
        var	msgId = data["msgId"];
        var diag = new Dialog();
	    diag.Width =700;
        diag.Height = 300;
        diag.Title = "消息详情";
        diag.URL = UUR.sysMessageDetail + "&msgId=" + msgId;
        diag.show();
    }
    
    // 是否阅读图标
    function readFlagRender(v){
    	if(v == '0'){
    		return '<img src="${ctx}/static/images/icons/16x16/email.png" title="未阅读"/>';
    	}else{
    		return '<img src="${ctx}/static/images/icons/16x16/email_open.png" title="已阅读"/>';
    	}
    }
	</script>
</head>
<body>
	<div title="消息中心" region="center" iconCls="icon-window" border="false">
		<div xtype="tabpanel" region="center" border="false">
			<div id="sysMessageGrid" title="收件箱" xtype="grid" region="center" pagingBar="true" forceFit="true" border="false" onExtRowdblclick="onRowdblclick()">
				<div xtype="tbar">
					<div text="发送新消息" iconCls="icon-add" onExtClick="doAddSysMessage()" ></div>
					<div text="-"></div>
					<div text="删除" iconCls="icon-delete" onExtClick="doDeleteSysMessage(false,'frmQuery','sysMessageGrid')"></div>
					<div text="->"></div>
					<form id="frmQuery" name="frmQuery" method="post">
						<table>
							<tr>
								<td>标题：</td>
								<td><input type="text" name="msgTitle" /></td> 
							</tr>
						</table>
					</form>
					<div text="查询" iconCls="icon-query" onExtClick="doSysMessageQuery('frmQuery','sysMessageGrid')"></div>
				</div>
				<div id="sysMessageStore" xtype="store" url="${ctx}/admin/sysMessageListData?isSend=false" autoLoad="true">
					<div xtype="jsonreader">
						<div name="msgId"></div>
						<div name="msgTitle"></div>
						<div name="msgContent"></div>
						<div name="readFlag"></div>
						<div name="sendUserName"></div>
						<div name="sendTime"></div>
					</div>
				</div>
				<div xtype="colmodel">
		            <div type="checkbox"></div>
				 	<div header="已阅读" width="30" sortable="true" dataIndex="readFlag" renderer="readFlagRender"></div>
				 	<div header="消息标题" width="180" sortable="true" dataIndex="msgTitle"></div>
				  	<div header="发送者" width="100" sortable="true" dataIndex="sendUserName"></div>
				  	<div header="发送时间" width="120" sortable="true" dataIndex="sendTime" renderer="dateRender"></div>
				</div>
		     </div>
			<div id="sysMessageGridSend" title="发件箱" xtype="grid" region="center" pagingBar="true" forceFit="true" border="false" onExtRowdblclick="onRowdblclick()">
				<div xtype="tbar">
					<div text="删除" iconCls="icon-delete" onExtClick="doDeleteSysMessage(true,'frmQuerySend','sysMessageGridSend')"></div>
					<div text="->"></div>
					<form id="frmQuerySend" name="frmQuerySend" method="post">
						<table>
							<tr>
								<td>标题：</td>
								<td><input type="text" name="msgTitle" /></td> 
							</tr>
						</table>
					</form>
					<div text="查询" iconCls="icon-query" onExtClick="doSysMessageQuery('frmQuerySend','sysMessageGridSend')"></div>
				</div>
				<div id="sysMessageStoreSend" xtype="store" url="${ctx}/admin/sysMessageListData?isSend=true" autoLoad="true">
					<div xtype="jsonreader">
						<div name="msgId"></div>
						<div name="msgTitle"></div>
						<div name="msgContent"></div>
						<div name="sendTime"></div>
						<div name="readFlag"></div>
						<div name="receiveUserName"></div>
						<div name="receiveTime"></div>
					</div>
				</div>
				<div xtype="colmodel">
		            <div type="checkbox"></div>
				 	<div header="消息标题" width="180" sortable="true" dataIndex="msgTitle"></div>
				 	<div header="发送时间" width="120" sortable="true" dataIndex="sendTime" renderer="dateRender"></div>
				  	<div header="接收者" width="100" sortable="true" dataIndex="receiveUserName"></div>
				  	<div header="接收者是否阅读" width="60" sortable="true" dataIndex="readFlag" renderer="readFlagRender"></div>
				  	<div header="阅读时间" width="120" sortable="true" dataIndex="receiveTime" renderer="dateRender"></div>
				</div>
		     </div>
	     </div>
     </div>
</body>
</html>
