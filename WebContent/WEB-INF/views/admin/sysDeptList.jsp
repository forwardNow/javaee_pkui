<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
	<title>单位管理</title>
	<script type="text/javascript">
	//资源
	var UUR = {
		// 新增
		'sysDeptAdd' : '${ctx}/admin/sysDeptForm?' + Math.random(),
		// 修改
		'sysDeptUpdate' : '${ctx}/admin/sysDeptForm?' + Math.random(),
		// 删除
		'sysDeptDelete' : '${ctx}/admin/sysDeptDelete?' + Math.random(),
		// 数据归属单位
		'sysDeptReleList' : '${ctx}/admin/sysDeptReleList?' + Math.random(),
		//高级查询
		'sysDeptQuery'  : '${ctx}/admin/sysDeptAdvQuery?' + Math.random(),
        //设置主管单位
        'setMainDept'  : '${ctx}/admin/sysDeptSetMainForm?' + Math.random(),
        //生成字典文件
        'sysDeptCreateDic'  : '${ctx}/admin/sysDeptCreateDic?' + Math.random() 		
	};
	
	//新增单位
	function doSysDeptAdd(){
		var diag = openMidDialog({
			Title : "新增管理单位",
			URL : UUR.sysDeptAdd,
			OKEvent : function(){
				diag.innerWin["doSaveSysDept"]();
			}
		});
	}
	
	//修改单位 
	function doSysDeptUpdate(){
		var sel = Pku.getExt("sysDeptGrid").getSelectionModel().getSelections();
		if(sel.length == 1){
			var deptId = sel[0].get("deptId");
			if(deptId == "100000000000"){
				Dialog.alert("该单位不可以修改。");
				return;
			}
			var diag = openMidDialog({
				Title : "修改管理单位",
				URL : UUR.sysDeptUpdate + "&deptId=" + deptId,
				OKEvent : function(){
					diag.innerWin["doSaveSysDept"]();
				}
			});
		}else{
			Dialog.alert("请选择单位");
		}
	}
	
	//删除单位 
	function doSysDeptDelete(btn){
		var sel = Pku.getExt("sysDeptGrid").getSelectionModel().getSelections();
		if(sel.length > 0){
			Dialog.confirm("确认删除选中记录？", function(){
	            var urlParams = "";
	            for(var i=0;i<sel.length;i++){
	                urlParams += "&deptId=" + sel[i].get("deptId");
	            }
	            btn.disable();
	            Pku.Common.ajax(UUR.sysDeptDelete + urlParams,{},function(bln,response,o){
	                btn.enable();
	                var objRet = toJson(response.responseText);
	                if(objRet.success){
	                    Dialog.alert("删除成功");
	                    doSysDeptQuery();
	                }else{
	                    Dialog.alert(objRet.message);
	                }
	            });
			});
		}else{
			Dialog.alert("请选择单位");
		}
	}
	
	// 数据归属
	function doSysDeptReleList(){
		var sel = Pku.getExt("sysDeptGrid").getSelectionModel().getSelections();
		if(sel.length == 1){
			var deptId = sel[0].get("deptId");
			openMidDialog({
				Title : "数据归属单位管理",
				URL : UUR.sysDeptReleList + "&deptId=" + deptId
			});
		}else{
			Dialog.alert("请选择单位");
		}
	}
	
	// 生成字典文件
	function doSysDeptDic(){
        Pku.Common.ajax(UUR.sysDeptCreateDic,{dicName : 'DIC_DEPT'},function(bln,response,o){
            var objRet = toJson(response.responseText);
            if(objRet.success){
                Dialog.alert("生成单位字典成功");
                doSysDeptQuery();
            }else{
                Dialog.alert(objRet.message);
            }
        });
		
	}
	
	//设置主管单位
	function doSetMainDept(){
        var diag = openMaxDialog({
            Title : "设置主管单位",
            URL : UUR.setMainDept
        });
	}
	
	// 高级查询
	function doSysDeptAdvQuery(){
        var diag = openMidDialog({
            Title : "高级查询",
            URL : UUR.sysDeptQuery,
            OKEvent : function(){
            	var qryFrm = diag.innerFrame.contentWindow.document.advQryFrm;
            	var txtQuery = Pku.Common.getQueryJson(qryFrm, "DEPT_ID");
            	Pku.getExt("sysDeptGrid").store.baseParams.txtQuery = txtQuery;
            	Pku.getExt("sysDeptGrid").store.load();
            	Dialog.close();
            }
        });
	}
	
	//查询单位 
	function doSysDeptQuery(){
		var txtQuery = Pku.Common.getQueryJson("frmQuery","DEPT_ID");
		Pku.getExt("sysDeptGrid").store.baseParams.txtQuery = txtQuery;
		Pku.getExt("sysDeptGrid").store.load();
	}
	
    //双击行
    function onRowdblclick(data){
        var deptId = data["deptId"];
		var diag = openMidDialog({
			Title : "修改管理单位",
			URL : UUR.sysDeptUpdate + "&deptId=" + deptId,
			OKEvent : function(){
				diag.innerWin["doSaveSysDept"]();
			}
		});
    }
    
    Pku.onReady(function(){
    	doSysDeptQuery();
    });
	</script>
</head>
<body>
	<div id="sysDeptGrid" title="单位管理列表" iconCls="icon-window" xtype="grid" region="center" pagingBar="true" forceFit="true" border="false" onExtRowdblclick="onRowdblclick()">
		<div xtype="tbar">
			<div text="新增" iconCls="icon-add" onExtClick="doSysDeptAdd()" ></div>
			<div text="-"></div>
			<div text="修改" iconCls="icon-update" onExtClick="doSysDeptUpdate()"></div>
			<div text="-"></div>
			<div text="删除" iconCls="icon-delete" onExtClick="doSysDeptDelete()"></div>
			<div text="-"></div>
			<div text="数据归属维护" iconCls="icon16-drive_edit" onExtClick="doSysDeptReleList()"></div>
			<div text="-"></div>
			<div text="生成字典文件" iconCls="icon-dic" onExtClick="doSysDeptDic()"></div>
            <div text="-"></div>
			<div text="高级查询" iconCls="icon-adv-query" onExtClick="doSysDeptAdvQuery()"></div>
			<div text="->"></div>
			<form id="frmQuery" name="frmQuery" method="post">
				<table>
					<tr>
						<td>单位名称：</td>
						<td><input type="text" fieldname="deptName" operation="like" /></td>
					</tr>
				</table>
			</form>
			<div text="查询" iconCls="icon-query" onExtClick="doSysDeptQuery()"></div>
		</div>
		<div id="sysDeptStore" xtype="store" url="${ctx}/admin/sysDeptListData" autoLoad="false">
			<div xtype="jsonreader">
				<div name="deptId"></div>
				<div name="deptName"></div>
				<div name="deptLevel"></div>
				<div name="parentDeptId"></div>
				<div name="addTime"></div>
			</div>
		</div>
		<div xtype="colmodel">
			<div type="checkbox"></div>
		 	<div header="单位编码" width="120" sortable="true" dataIndex="deptId"></div>
		 	<div header="单位名称" width="180" sortable="true" dataIndex="deptName"></div>
		  	<div header="单位级别" width="100" sortable="true" dataIndex="deptLevel" kind="dic" src="DIC_DEPT_LEVEL"></div>
		  	<div header="上级单位名称" width="180" sortable="true" dataIndex="parentDeptId" kind="dic" src="DIC_DEPT"></div>
		  	<div header="录入时间" width="120" sortable="true" dataIndex="addTime" renderer="dateRender"></div>
		</div>
     </div>
</body>
</html>
