<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
	<title>用户管理</title>
	<script type="text/javascript">
	//资源
	var UUR = ErrorUrlResource = {
        // 新增
        'sysErrorAdd' : '${ctx}/admin/sysErrorForm?' + Math.random(),
        // 修改
        'sysErrorUpdate' : '${ctx}/admin/sysErrorForm?' + Math.random(),
        // 删除
        'sysErrorDelete' : '${ctx}/admin/sysErrorDelete?' + Math.random(),
        //高级查询
        'sysErrorQuery'  : '${ctx}/admin/sysErrorAdvQuery?' + Math.random(),
    	// 生成字典文件
		'sysErrorListXml' : '${ctx}/admin/sysErrorCreateXmlForm?' + Math.random()
	};
	
	//新增错误号
	function doAddSysError(){
		var diag = new Dialog();
	    diag.Width =420;
        diag.Height = 160;
        diag.Title = "新增错误号";
        diag.URL = UUR.sysErrorAdd;
        diag.OKEvent = function(){
        	 diag.innerWin["doSaveSysError"]();
        }
        diag.show();
	}
	
	//修改错误号
	function doUpdateSysError(){
        var sel = Pku.getExt("sysErrorGrid").getSelectionModel().getSelections();
        if(sel.length == 1){
            var errorId = sel[0].get("errorId");
            var diag = new Dialog();
    	    diag.Width =420;
            diag.Height = 160;
            diag.Title = "修改错误号";
            diag.URL = UUR.sysErrorUpdate + "&errorId=" + errorId;
            diag.OKEvent = function(){
            	diag.innerWin["doSaveSysError"]();
            }
            diag.show();
        }else{
            Dialog.alert("请选中一条记录");
        }
	}
	
	//删除错误号
	function doDeleteSysError(btn){
        var sel = Pku.getExt("sysErrorGrid").getSelectionModel().getSelections();
        if(sel.length > 0){
            Dialog.confirm("确认删除选中记录？", function(){
                var urlParams = "";
                for ( var i = 0;i < sel.length;i++ ){
                    urlParams += "&errorId=" + sel[i].get("errorId");
                }
                btn.disable();
                Pku.Common.ajax(UUR.sysErrorDelete + urlParams,{},function(bln,response,o){
                    btn.enable();
                    var objRet = toJson(response.responseText);
                    if(objRet.success){
                        Dialog.alert("删除成功");
                        doSysErrorQuery();
                    }else{
                        Dialog.alert(objRet.message);
                    }
                });
            });
        }else{
            Dialog.alert("请选中记录");
        }
	}
	
	//查询错误号
	function doSysErrorQuery(){
		//alert(document.frmQuery.errorCode.value);
        Pku.getExt("sysErrorGrid").store.baseParams.errorCode = document.frmQuery.errorCode.value;
        Pku.getExt("sysErrorGrid").store.load();
	}
	
	//状态渲染
	function userStatusRender(v) {
		/*
		if ( v == "1" ) {
			return '<img height="16" src="${ctx}/static/images/icons/icon021a2.gif" title="正常" />';
		} else {
			return '<img height="16" src="${ctx}/static/images/icons/icon021a3.gif" title="停用" />';
		}
		*/
		return (v === "1") ?  "正常" : "<font color='red'>停用</font>";
	}
	
    //双击行
    function onRowdblclick(data){
        var	errorId = data["errorId"];
        var diag = new Dialog();
	    diag.Width =420;
        diag.Height = 160;
        diag.Title = "修改错误号";
        diag.URL = UUR.sysErrorUpdate + "&errorId=" + errorId;
        diag.OKEvent = function(){
        	diag.innerWin["doSaveSysError"]();
        }
        diag.show();
    }
    
    //生成字典文件
    function doSysErrorDic(){
    	Dialog.confirm("确认生成字典", function(){
	        Ext.MessageBox.show({
	     		msg: '正在生成字典文件, 请稍候...',
	     	    progressText: '生成...',
	     	    width:300,
	     	    wait:true,
	     	    waitConfig: {interval:70},
	     	    icon:'ext-mb-download', //custom class in msg-box.html
	     	    animEl: 'pkucmp_autoBtn'
	     	});
			Pku.Common.ajax(UUR.sysErrorListXml,{},function(bln,response,o){
				var objRet = toJson(response.responseText);
				if(objRet.success){
					Ext.MessageBox.hide() ;
					Dialog.alert("生成成功");
				}else{
					Ext.MessageBox.hide() ;
					Dialog.alert("生成失败！") ;
				}
			});
        });
    }
	</script>
</head>
<body>
	<div id="sysErrorGrid" title="错误号管理" iconCls="icon-window" xtype="grid" region="center" pagingBar="true" forceFit="true" border="false" onExtRowdblclick="onRowdblclick()">
		<div xtype="tbar">
			<div text="新增" iconCls="icon-add" onExtClick="doAddSysError()" ></div>
			<div text="-"></div>
			<div text="修改" iconCls="icon-update" onExtClick="doUpdateSysError()"></div>
			<div text="-"></div>
			<div text="删除" iconCls="icon-delete" onExtClick="doDeleteSysError()"></div>
			<div text="-"></div>
			<div text="生成字典文件" iconCls="icon-dic" onExtClick="doSysErrorDic()"></div>
			<div text="->"></div>
			<form id="frmQuery" name="frmQuery" method="post">
				<table>
					<tr>
						<td>错误号：</td>
						<td><input type="text" name="errorCode" /></td> 
					</tr>
				</table>
			</form>
			<div text="查询" iconCls="icon-query" onExtClick="doSysErrorQuery()"></div>
		</div>
		<div id="sysErrorStore" xtype="store" url="${ctx}/admin/sysErrorListData" autoLoad="true">
			<div xtype="jsonreader">
				<div name="errorId"></div>
				<div name="errorCode"></div>
				<div name="errorInfo"></div>
			</div>
		</div>
		<div xtype="colmodel">
            <div type="checkbox"></div>
		 	<div header="错误号" width="60" sortable="true" dataIndex="errorCode"></div>
		  	<div header="错误信息" width="120" sortable="true" dataIndex="errorInfo"></div>
		</div>
     </div>
</body>
</html>
