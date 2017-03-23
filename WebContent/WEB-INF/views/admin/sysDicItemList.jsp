<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
    <title>编辑用户信息</title>
    <style>
    
    .dicList-edit {
    	font-size:12px;
    }
    .dicList-edit td{
    	height:25px;
    }
    </style>
    
    <script type="text/javascript"> 
	//资源
	var UUR = {
		// 新增
		'sysDicItemAdd' : '${ctx}/admin/sysDicItemForm?' + Math.random(),
		// 修改
		'sysDicItemUpdate' : '${ctx}/admin/sysDicItemUpdateForm?' + Math.random(),
		// 删除
		'sysDicItemDelete' : '${ctx}/admin/sysDicItemDelete?' + Math.random()
	};
    //关闭本窗口
    function doClose(){
        ownerDialog.close();
    }
    
	//新增字典条目
	function doSysDicListAdd(){
		var DicName = "${sysDicList.dicName}";
		if(DicName ==''){
			Dialog.alert("字典名称获取异常");
			return;
		}
		var diag = openMinDialog({
			Title : "新增字典条目",
			URL : UUR.sysDicItemAdd+ "&dicName=" + DicName,
			OKEvent : function(){
				diag.innerWin["doSaveSysDicItem"]();
			}
		});
	}
	
	//修改字典条目
	function doSysDicItemUpdate(){
		var sel = Pku.getExt("sysDicItemGrid").getSelectionModel().getSelections();
		if(sel.length == 1){
			var ItemId = sel[0].get("itemId");
			var diag = openMinDialog({
				Title : "修改字典条目",
				URL : UUR.sysDicItemUpdate + "&itemId=" + ItemId,
				OKEvent : function(){
					diag.innerWin["doSaveSysDicItem"]();
				}
			});
		}else{
			Dialog.alert("请选中一条记录");
		}
	}
	
	//删除字典条目
	function doSysDicListDelete(btn){
		var sel = Pku.getExt("sysDicItemGrid").getSelectionModel().getSelections();
		if(sel.length > 0){
			Dialog.confirm("确认删除？", function(){
			var urlParams = "";
			var visiable ="";
			for(var i=0;i<sel.length;i++){
				urlParams += "&itemId=" + sel[i].get("itemId");
			}
			btn.disable();
			Pku.Common.ajax(UUR.sysDicItemDelete + urlParams,{},function(bln,response,o){
				btn.enable();
				var objRet = toJson(response.responseText);
				if(objRet.success){
					Dialog.alert("删除成功");
					doSysDicItemQuery();
				}else{
					Dialog.alert(objRet.message);
				}
			});
		  });
		}else{
			Dialog.alert("请选中记录");
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
    
	//查询字典条目 
	function doSysDicItemQuery(){
		Pku.getExt("sysDicItemGrid").store.baseParams.dicName = "${sysDicList.dicName}";
		Pku.getExt("sysDicItemGrid").store.baseParams.itemValue = document.frmQuery.itemValue.value;
		Pku.getExt("sysDicItemGrid").store.load();
	}
	
	Ext.onReady(function (){
		Pku.getExt("sysDicItemGrid").store.baseParams.dicName = "${sysDicList.dicName}";
		Pku.getExt("sysDicItemGrid").store.load();
	});
	
	// 双击运行
	function onRowdblclick(data){
        var itemId = data["itemId"];
		var diag = openMinDialog({
			Title : "修改字典条目",
			URL : UUR.sysDicItemUpdate + "&itemId=" + itemId,
			OKEvent : function(){
				diag.innerWin["doSaveSysDicItem"]();
			}
		});
	}
    </script>
</head>
<body>
   <%-- <div  title="字典类型信息" region="west" width="250">
       	<table class="dicList-edit">
			<tr > 	
			    <td >字典名称</td>
				<td>
					<input type="text" id="dicName" value="${sysDicList.dicName}" readonly/>
				</td>
			</tr>
			<tr> 
			    <td>字典描述</td>
				<td>
					<input type="text" id="dicDesc" value="${sysDicList.dicDesc}" readonly/>
				</td>
			</tr>
			<tr> 
			    <td>是否有效</td>
				<td>
					<input type="text" id="visiable" value="${sysDicList.visiable}" kind="dic" src="DIC_YESORNO" readonly/>
				</td>
			</tr>
			<tr> 	
			    <td>是否可编辑</td>
				<td>
					<input type="text" id="editable" value="${sysDicList.editable}"  kind="dic" src="DIC_YESORNO" readonly/>
				</td>
			</tr>
       	</table>
   </div> --%>
   
	<div id="sysDicItemGrid"  xtype="grid" region="center" onExtRowdblclick="onRowdblclick()" pagingBar="true" forceFit="true" border="false">
			<div xtype="tbar">
				<div text="新增" iconCls="icon-add" onExtClick="doSysDicListAdd()" ></div>
				<div text="-"></div>
				<div text="修改" iconCls="icon-update" onExtClick="doSysDicItemUpdate()"></div>
				<div text="-"></div>
				<div text="删除" iconCls="icon-delete" onExtClick="doSysDicListDelete()"></div>
				<div text="-"></div>
					<form id="frmQuery" name="frmQuery" method="post">
						<table>
							<tr>
								<td>字典条目名称：</td>
								<td><input type="text" name="itemValue" /></td>
							</tr>
						</table>
					</form>
				<div text="查询" iconCls="icon-query" onExtClick="doSysDicItemQuery()"></div>
			</div>
	        <div xtype="groupstore" xtype="store" url="${ctx}/admin/sysDicItemListData">
	           <div xtype="jsonreader">
	          		<div name="dicName"></div>
	                <div name="itemId"></div>
	                <div name="itemCode"></div>
	                <div name="itemValue"></div>
	                <div name="visiable"></div>
	            </div>
	        </div>
	        <div xtype="colmodel">
	        <div type="checkbox"></div>
	            <div header="字典条目编号" width="150" sortable="true" dataIndex="itemCode"></div>
	            <div header="字典条目名称" width="200" sortable="true" dataIndex="itemValue"></div>
	            <div header="是否有效" width="100" sortable="true" dataIndex="visiable" kind="dic" src="DIC_YESORNO"></div>
	        </div>
		</div>
</body>
</html>




