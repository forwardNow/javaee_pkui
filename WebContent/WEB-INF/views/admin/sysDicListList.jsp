<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
	<title>字典管理</title>
	<script type="text/javascript">
	//资源
	var UUR = {
		// 新增
		'sysDicListAdd' : '${ctx}/admin/sysDicListForm?' + Math.random(),
		// 修改
		'sysDicListUpdate' : '${ctx}/admin/sysDicListUpdateForm?' + Math.random(),
		// 删除
		'sysDicListDelete' : '${ctx}/admin/sysDicListDelete?' + Math.random(),
		// 维护字典内容
		'sysDicItemList' : '${ctx}/admin/sysDicItemList?' + Math.random(),
		// 生成字典文件
		'sysDicListXml' : '${ctx}/admin/sysDicCreateXmlForm?' + Math.random()
	};
	
	//新增字典
	function doSysDicListAdd(){
		var diag = openMinDialog({
			Title : "新增字典",
			URL : UUR.sysDicListAdd,
			OKEvent : function(){
				diag.innerWin["doSaveSysDicList"]();
			}
		});
	}
	
	//修改单位 
	function doSysDicListUpdate(){
		var sel = Pku.getExt("sysDicListGrid").getSelectionModel().getSelections();
		if(sel.length == 1){
			var DicName = sel[0].get("dicName");
			var editable = sel[0].get("editable");
	        if(editable == '0'){
	        	Dialog.alert("此项不可编辑");
	        	return;
	        }
			var diag = openMidDialog({
				Title : "修改字典",
				URL : UUR.sysDicListUpdate + "&dicName=" + DicName,
				OKEvent : function(){
					diag.innerWin["doSaveSysDicList"]();
				}
			});
		}else{
			Dialog.alert("请选中一条记录");
		}
	}
	
	//删除系统参数
	function doSysDicListDelete(btn){
		var sel = Pku.getExt("sysDicListGrid").getSelectionModel().getSelections();
		if(sel.length > 0){
			Dialog.confirm("确认删除？", function(){
			var urlParams = "";
			var flg = false;
			for(var i=0;i<sel.length;i++){
				urlParams += "&dicName=" + sel[i].get("dicName");
				if(sel[i].get("editable")==0){
					flg = true;
				}
			}
			if(flg){
	        	Dialog.alert("此项不可编辑");
	        	return;
			}
			btn.disable();
			Pku.Common.ajax(UUR.sysDicListDelete + urlParams,{},function(bln,response,o){
				btn.enable();
				var objRet = toJson(response.responseText);
				if(objRet.success){
					Dialog.alert("删除成功");
					doSysDicListQuery();
				}else{
					Dialog.alert(objRet.message);
					}
				});
			});
		}else{
			Dialog.alert("请选中记录");
		}
	}
	
	// 生成单个字典文件
	function doSysDicListDic(){
		var sel = Pku.getExt("sysDicListGrid").getSelectionModel().getSelections();
		if(sel.length == 1){
			Dialog.confirm("确认生成字典文件？", function(){
				Ext.MessageBox.show({
			           msg: '正在生成字典文件, 请稍候...',
			           progressText: '生成...',
			           width:300,
			           wait:true,
			           waitConfig: {interval:70},
			           icon:'ext-mb-download', //custom class in msg-box.html
			           animEl: 'pkucmp_autoBtn'
			        });
				
				var urlParams = "";
				urlParams += "&dicName=" + sel[0].get("dicName");
				Pku.Common.ajax(UUR.sysDicListXml + urlParams,{},function(bln,response,o){
					var objRet = toJson(response.responseText);
					if(objRet.success){
						Ext.MessageBox.hide() ;
						Dialog.alert("生成成功");
						doSysDicListQuery();
					}else{
						Ext.MessageBox.hide() ;
						Dialog.alert("生成失败！") ;
					}
				});
			});
		}else{
			Dialog.alert("请选中一条记录");
		}
	}
	
	// 生成全部字典文件
	function doSysDicListAllDic(){
		Dialog.confirm("确认生成字典文件？", function(){
			Ext.MessageBox.show({
		           msg: '正在生成字典文件, 请稍候...',
		           progressText: '生成...',
		           width:300,
		           wait:true,
		           waitConfig: {interval:1000},
		           icon:'ext-mb-download', //custom class in msg-box.html
		           animEl: 'pkucmp_autoBtn'
		        });
				
			Pku.Common.ajax(UUR.sysDicListXml,{},function(bln,response,o){
				var objRet = toJson(response.responseText);
				if(objRet.success){
					Ext.MessageBox.hide() ;
					Dialog.alert("生成成功");
					doSysDicListQuery();
				}else{
					Ext.MessageBox.hide() ;
					alert("生成失败！") ;
				}
			});
		});	
	}
	
	// 维护字典内容
	function doSysDicListDetail(){
		var sel = Pku.getExt("sysDicListGrid").getSelectionModel().getSelections();
		if(sel.length == 1){
			var DicName = sel[0].get("dicName");
			var diag = openMaxDialog({
				Title : "维护字典内容",
				URL : UUR.sysDicItemList + "&dicName=" + DicName

			});
		}else{
			Dialog.alert("请选中一条记录");
		}
	}
	
	//查询单位 
	function doSysDicListQuery(){
		Pku.getExt("sysDicListGrid").store.baseParams.dicDesc = document.frmQuery.dicDesc.value;
		Pku.getExt("sysDicListGrid").store.load();
	}
    
    //双击行
    function onRowdblclick(data){
        var dicName = data["dicName"];
        var editable = data["editable"];
        if(editable == '0'){
        	Dialog.alert("此项不可编辑");
        	return;
        }
		var diag = openMidDialog({
			Title : "修改字典",
			URL : UUR.sysDicListUpdate + "&dicName=" + dicName,
			OKEvent : function(){
				diag.innerWin["doSaveSysDicList"]();
			}
		});
    }
	</script>
</head>
<body>
	<div id="sysDicListGrid" title="字典管理列表" iconCls="icon-window" xtype="grid" region="center" pagingBar="true" forceFit="true" border="false" onExtRowdblclick="onRowdblclick()">
		<div xtype="tbar">
			<div text="新增" iconCls="icon-add" onExtClick="doSysDicListAdd()" ></div>
			<div text="-"></div>
			<div text="修改" iconCls="icon-update" onExtClick="doSysDicListUpdate()"></div>
			<div text="-"></div>
			<div text="删除" iconCls="icon-delete" onExtClick="doSysDicListDelete()"></div>
			<div text="-"></div>
			<div text="维护字典内容" iconCls="icon-adv-query" onExtClick="doSysDicListDetail()"></div>
			<div text="-"></div>
			<div text="生成单个字典文件" iconCls="icon-dic" onExtClick="doSysDicListDic()"></div>
			<div text="-"></div>
			<div text="生成全部字典文件" iconCls="icon-dic" onExtClick="doSysDicListAllDic()"></div>
			<div text="->"></div>
			<form id="frmQuery" name="frmQuery" method="post">
				<table>
					<tr>
						<td>字典描述：</td>
						<td><input type="text" name="dicDesc" /></td>
					</tr>
				</table>
			</form>
			<div text="查询" iconCls="icon-query" onExtClick="doSysDicListQuery()"></div>
		</div>
		<div id="sysDicListStore" xtype="store" url="${ctx}/admin/sysDicListListData" autoLoad="true">
			<div xtype="jsonreader">
				<div name="dicName"></div>
				<div name="dicDesc"></div>
				<div name="parentDic"></div>
				<div name="dicStandard"></div>
				<div name="visiable"></div>
				<div name="editable"></div>
			</div>
		</div>
		<div xtype="colmodel">
			<div type="checkbox"></div>
		 	<div header="字典名称" width="120" sortable="true" dataIndex="dicName"></div>
		 	<div header="字典描述" width="230" sortable="true" dataIndex="dicDesc"></div>
		  	<div header="字典标准" width="180" sortable="true" dataIndex="dicStandard" ></div>
		  	<div header="是否有效" width="100" sortable="true" dataIndex="visiable" kind="dic" src="DIC_YESORNO"></div>
		  	<div header="是否可编辑" width="100" sortable="true" dataIndex="editable" kind="dic" src="DIC_YESORNO"></div>
		</div>
     </div>
     <form id="sysDicItem" name="sysDicItem" url="" type="hidden">

	 </form>
</body>
</html>
