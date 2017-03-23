<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
    <title>最大编号信息</title>
    <style>

    </style>
    
    <script type="text/javascript"> 
	//资源
	var UUR = {
		// 新增
		'sysMaxIdAdd' : '${ctx}/admin/sysMaxIdForm?' + Math.random(),
		// 修改
		'sysMaxIdUpdate' : '${ctx}/admin/sysMaxIdUpdateForm?' + Math.random(),
		// 删除
		'sysMaxIdDelete' : '${ctx}/admin/sysMaxIdDelete?' + Math.random()
	};
    //关闭本窗口
    function doClose(){
        ownerDialog.close();
    }
    
	//新增编码
	function doSysMaxIdAdd(){
		var IdType = "${sysMaxId.idType}";
		var diag = openMinDialog({
			Title : "新增编码",
			URL : UUR.sysMaxIdAdd + "&idType=" + IdType,
			OKEvent : function(){
				diag.innerWin["doSaveSysMaxId"]();
			}
		});
	}
	
	//修改编码
	function doSysMaxIdUpdate(){
		var sel = Pku.getExt("sysMaxIdListGrid").getSelectionModel().getSelections();
		if(sel.length == 1){
			var IdType = sel[0].get("idType");
			var IdPara1 = sel[0].get("idPara1");
			var IdPara2 = sel[0].get("idPara2");
			var diag = openMinDialog({
				Title : "修改编码",
				URL : UUR.sysMaxIdUpdate + "&idType=" + IdType+ "&idPara1=" + IdPara1+ "&idPara2=" + IdPara2,
				OKEvent : function(){
					diag.innerWin["doSaveSysMaxId"]();
				}
			});
		}else{
			Dialog.alert("请选中一条记录");
		}
	}
	
	//删除编码
	function doSysMaxIdDelete(btn){
		var sel = Pku.getExt("sysMaxIdListGrid").getSelectionModel().getSelections();
		if(sel.length == 1){
			Dialog.confirm("确认删除？", function(){
				var urlParams = "";
				for(var i=0;i<sel.length;i++){
					var IdType = sel[0].get("idType");
					var IdPara1 = sel[0].get("idPara1");
					var IdPara2 = sel[0].get("idPara2");
					urlParams += "&idType=" + IdType+ "&idPara1=" + IdPara1+ "&idPara2=" + IdPara2;
				}
				btn.disable();
				Pku.Common.ajax(UUR.sysMaxIdDelete + urlParams,{},function(bln,response,o){
					btn.enable();
					var objRet = toJson(response.responseText);
					if(objRet.success){
						Dialog.alert("删除成功");
						doSysMaxIdQuery();
					}else{
						Dialog.alert(objRet.message);
					}
				});
			});
		}else{
			Dialog.alert("请选中一条记录");
		}
	}
    //保存
    function doSaveSysUser(){
        var frm = Pku.getExt("addUserFrm");
        frm.submit();
    }
    
    //反馈
    function doResult(form, action){
        var objRet = toJson(action.response.responseText);
        if ( objRet.success ){
            ownerDialog.openerWindow["doSysUserQuery"]();
            if('${sysUser.userId}' != ''){ //修改
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
    
	Ext.onReady(function (){
		Pku.getExt("sysMaxIdListGrid").store.baseParams.idType = "${sysMaxId.idType}";
		Pku.getExt("sysMaxIdListGrid").store.load();
	});
	
	//查询
	function doSysMaxIdQuery(){
		var IdType = "${sysMaxId.idType}";
		Pku.getExt("sysMaxIdListGrid").store.baseParams.idType = IdType;
		Pku.getExt("sysMaxIdListGrid").store.baseParams.idPara1 = document.frmQuery.idPara1.value;
		Pku.getExt("sysMaxIdListGrid").store.load();
	}
	
	function onRowdblclick(data){
        var idType = data["idType"];
        var idPara1 = data["idPara1"];
        var idPara2 = data["idPara2"];

		var diag = openMinDialog({
			Title : "修改编码",
			URL : UUR.sysMaxIdUpdate + "&idType=" + idType+ "&idPara1=" + idPara1+ "&idPara2=" + idPara2,
			OKEvent : function(){
				diag.innerWin["doSaveSysMaxId"]();
			}
		});
	}
    </script>
</head>
<body>
 
	<div id="sysMaxIdListGrid" title="编号管理列表" iconCls="icon-window" xtype="grid" region="center" onExtRowdblclick="onRowdblclick()">
		<div xtype="tbar">
			<div text="新增" iconCls="icon-add" onExtClick="doSysMaxIdAdd()" ></div>
			<div text="-"></div>
			<div text="修改" iconCls="icon-update" onExtClick="doSysMaxIdUpdate()"></div>
			<div text="-"></div>
			<div text="删除" iconCls="icon-delete" onExtClick="doSysMaxIdDelete()"></div>
			<div text="-"></div>
			<form id="frmQuery" name="frmQuery" method="post">
				<table>
					<tr>
						<td>参数一：</td>
						<td><input type="text" name="idPara1" /></td>
					</tr>
				</table>
			</form>
			<div text="查询" iconCls="icon-query" onExtClick="doSysMaxIdQuery()"></div>
			<div text="->"></div>
		</div>
		<div id="sysMaxIdStore" xtype="store" url="${ctx}/admin/sysMaxIdListData">
			<div xtype="jsonreader">
				<div name="idType"></div>
				<div name="idPara1"></div>
				<div name="idPara2"></div>
				<div name="idCurrValue"></div>
			</div>
		</div>
		<div xtype="colmodel">
			<div type="checkbox"></div>
		 	<div header="编号类型" width="100" sortable="true" dataIndex="idType"></div>
		 	<div header="参数一" width="100" sortable="true" dataIndex="idPara1"></div>
		  	<div header="参数二" width="100" sortable="true" dataIndex="idPara2" ></div>
		  	<div header="最大编号" width="100" sortable="true" dataIndex="idCurrValue" ></div>
		</div>
     </div>
     <input type="hidden" id="" value="${sysMaxId.idType}">
</body>
</html>




