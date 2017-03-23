<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
	<title>编辑单位信息</title>
	<style>
    
	</style>
	<script type="text/javascript">    
	
    //资源
    var UUR = {
        //设置主管单位
        'addMainDept' : '${ctx}/admin/sysDeptAddMainSave?' + Math.random()
    };
	
	//关闭本窗口
	function doClose(){
		ownerDialog.close();
	}
	
	//设置主管单位
	function doAddToMainDept(grid, isMainDept){
		var sel = Pku.getExt(grid).getSelectionModel().getSelections(),
		    urlParams = "";
        if(sel.length > 0){
	        for ( var i = 0;i < sel.length;i++ ){
	            urlParams += "&deptId=" + sel[i].get("deptId");
	        }
	        urlParams += "&isMainDept=" + isMainDept;
	        Pku.Common.ajax(UUR.addMainDept + urlParams,{},function(bln,response,o){
	            var objRet = toJson(response.responseText);
	            if(objRet.success){
	            	doQueryDept();
	            }else{
	                Dialog.alert(objRet.message);
	            }
	        });

        }else{
            Dialog.alert("请选择单位");
        }
	}
		
	//查询单位
	function doQueryDept(v){
		if ( v ) {
	        Pku.getExt("sysDeptGrid").store.baseParams.deptId = v;
	        Pku.getExt("sysDeptGrid").store.baseParams.isMainDept = "1";
	        Pku.getExt("sysDeptGrid").store.load();
		} else {
	        Pku.getExt("sysDeptGrid").store.baseParams.deptId = "${deptId }";
	        Pku.getExt("sysDeptGrid").store.baseParams.isMainDept = "1";
	        Pku.getExt("sysDeptGrid").store.load();
		}
	    doQueryMainDept(v);
	}

	//查询主管单位
    function doQueryMainDept(v){
        if ( v ) {
            Pku.getExt("sysMainDeptGrid").store.baseParams.deptId = v;
            Pku.getExt("sysMainDeptGrid").store.baseParams.isMainDept = "0";
            Pku.getExt("sysMainDeptGrid").store.load();
        } else {
            Pku.getExt("sysMainDeptGrid").store.baseParams.deptId = "${deptId }";
            Pku.getExt("sysMainDeptGrid").store.baseParams.isMainDept = "0";
            Pku.getExt("sysMainDeptGrid").store.load();
        }
    }
	
	//下级单位链接
	function renderLink(v){
		return '<a href="#" onclick="doQueryDept(' + v + ')">查看</a>';
	}
	
	//初始化
    Ext.onReady(function(){
    	doQueryDept();
    });
	</script>
</head>
<body>
    <div region="west" width="400">
	    <div id="sysDeptGrid" iconCls="icon-window" xtype="grid" region="center" pagingBar="true" forceFit="true" border="false">
	        <div xtype="tbar">
	           <div text="将所选单位设置为主管单位" iconCls="icon-add" onExtClick="doAddToMainDept('sysDeptGrid', '1')" ></div>
	           <div text="->"></div>
	           <div text="返回" iconCls="icon-back" onExtClick="doQueryDept(0)"></div>
	        </div>
	        <div id="sysDeptStore" xtype="store" url="${ctx}/admin/sysSubDeptListData">
	            <div xtype="jsonreader">
	                <div name="deptId"></div>
	                <div name="deptCode"></div>
	                <div name="deptName"></div>
	                <div name="deptLevel"></div>
	                <div name="parentDeptId"></div>
	            </div>
	        </div>
	        <div xtype="colmodel">
	            <div type="checkbox"></div>
	            <div header="单位名称" width="180" sortable="true" dataIndex="deptName"></div>
	            <div header="下级单位" width="60" dataIndex="deptId" renderer="renderLink"></div>
	        </div>
	     </div>
    </div>
    <div region="center">        
	    <div id="sysMainDeptGrid" iconCls="icon-window" xtype="grid" region="center" pagingBar="true" forceFit="true" border="false">
            <div xtype="tbar">
               <div text="修改主管单位" iconCls="icon-update" onExtClick="" ></div>
               <div text="-"></div>
               <div text="移除主管单位" iconCls="icon-delete" onExtClick="doAddToMainDept('sysMainDeptGrid', '0')" ></div>
            </div>
	        <div id="sysMainDeptStore" xtype="store" url="${ctx}/admin/sysSubDeptListData">
	            <div xtype="jsonreader">
	                <div name="deptId"></div>
	                <div name="deptCode"></div>
	                <div name="deptName"></div>
	                <div name="deptLevel"></div>
	                <div name="parentDeptId"></div>
	            </div>
	        </div>
	        <div xtype="colmodel">
	            <div type="checkbox"></div>
	            <div header="单位名称" width="180" sortable="true" dataIndex="deptName"></div>
	            <div header="下级单位" width="60" dataIndex="deptId" renderer="renderLink"></div>
	        </div>
	     </div>
    </div>
</body>
</html>
