<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
	<title>单位管理</title>
	<style type="text/css">
		#main{
			width:800px;
			height:100%;
			background-color: #FAFAFA;
			border: 1px solid #DCDCDC;
		}
		#mainTable{
			width:450px;
			margin:5px 0px 0px 10px;
		}
		th{
			height:30px;
			text-align:center;
			font-size:14px;
			font-weight: bold;
			border: 1px solid #DCDCDC;
			background-color: #DFE8F6;
		}
		#mainTable td{
			height:30px;
			text-align:center;
			font-size:12px;
			border: 1px solid #DCDCDC;
		}
		.over{
			background-color: #CAD8FD;
		}
		a{
			text-align:center;
			cursor:pointer;
		}

	</style>
	<script type="text/javascript">
		var num = 0;
		var len = 0;
		Pku.onReady(function(){
			Ext.get(Ext.query("tr")).on("mouseover",function(){
				this.className = "over";
			});
			Ext.get(Ext.query("tr")).on("mouseout",function(){
				this.className = "";
			});
			Ext.get(Ext.query("a.create")).on("click",function(){
				var dicDetail = this.parentElement.parentElement.children[0].innerHTML;
				var dicName = this.parentElement.children[0].id;
				var url = this.parentElement.children[0].value;
				var qybz=1;
				if(dicName=="importantDic"){
					dicName = null;
				}
				createDic(url,dicName,qybz,dicDetail);
			});
	    });
		//生成字典文件
		function createDic(paramUrl,paramDicName,paramQybz,dicDetail){
			Dialog.confirm("确认生成"+dicDetail+"?", function(){
		        Ext.MessageBox.show({
		     		msg: '正在生成'+dicDetail+'文件, 请稍候...',
		     	    progressText: '生成...',
		     	    width:300,
		     	    wait:true,
		     	    waitConfig: {interval:70},
		     	    icon:'ext-mb-download', //custom class in msg-box.html
		     	    animEl: 'pkucmp_autoBtn'
		     	});
				Pku.Common.ajax(paramUrl,{dicName:paramDicName,qybz:paramQybz},function(bln,response,o){
					var objRet = toJson(response.responseText);
					if(objRet.success){
						Ext.MessageBox.hide() ;
						Dialog.alert("生成"+dicDetail+"成功");
						
					}else{
						Ext.MessageBox.hide() ;
						Dialog.alert("生成"+dicDetail+"失败！") ;
					}
				});
		    });
		}
		function createAll(){
			var array = new Array();;
			Dialog.confirm("确认生成所有字典?", function(){
				for(var i=0;i<Ext.query("a.create").length;i++){
					var obj = Ext.query("a.create")[i].parentElement.children[0];
					var dicDetail = Ext.query("a.create")[i].parentElement.parentElement.children[0].innerHTML;
					var paramDicName = obj.id;
					var paramUrl = obj.value;
					var paramQybz=1;
					if(paramDicName=="importantDic"){
						paramDicName = null;
					}
					var arr = new Array(dicDetail,paramDicName,paramUrl,paramQybz);
					array[i] = arr;
				}
				len = array.length;
				createAllDicByArray(array);
			});
			
		}
		
		function createAllDicByArray(array){
			 var dicDetail = array[num][0];
			 var paramDicName = array[num][1];
			 var paramUrl = array[num][2];
			 var paramQybz = array[num][3];
			 Ext.MessageBox.show({
		     		msg: '正在生成'+dicDetail+'文件, 请稍候...',
		     	    progressText: '生成...',
		     	    width:300,
		     	    wait:true,
		     	    waitConfig: {interval:70},
		     	    icon:'ext-mb-download', //custom class in msg-box.html
		     	    animEl: 'pkucmp_autoBtn'
		     	});
				Pku.Common.ajax(paramUrl,{dicName:paramDicName,qybz:paramQybz},function(bln,response,o){
					var objRet = toJson(response.responseText);
					if(objRet.success){
						Ext.MessageBox.hide();
						if(num == len-1){
							Dialog.alert("生成所有字典成功");
						}
						if(num<len-1){
							num =num + 1; 
							createAllDicByArray(array);
							//Dialog.alert("生成"+dicDetail+"成功");
						}
					}else{
						Ext.MessageBox.hide() ;
						flag = false;
						Dialog.alert("生成"+dicDetail+"失败！") ;
					}
				});
		}
	</script>
</head>
<body>
	<div title="特殊字典管理" iconCls="icon-window" region="center" border="false">
		<div id="main">
			<table id="mainTable">
				<tr>
					<th>字典名称</th>
					<th>字典文件名</th>
					<th>操作</th>
				</tr>
				<tr>
					<td>单位字典</td>
					<td>DIC_DEPT</td>
					<td>
						<input type="hidden" id="DIC_DEPT" value="${ctx}/admin/sysDeptCreateDic">
						<a class="create">生成</a>
					</td>
				</tr>
				<tr>
					<td>数据归属单位字典</td>
					<td>DIC_RELE</td>
					<td>
						<input type="hidden" id="DIC_RELE" value="${ctx}/admin/sysReleCreateDic">
						<a class="create">生成</a>
					</td>
				</tr>
				<tr>
					<td>区划字典</td>
					<td>DIC_CODE_LOCAL</td>
					<td>
						<input type="hidden" id="DIC_CODE_LOCAL" value="${ctx}/xt/xtQhxxbCreateDic">
						<a class="create">生成</a>
					</td>
				</tr>
				<tr>
					<td>乡镇街道字典</td>
					<td>DIC_CODE_TOWNSHIP
					</td>
					<td>
						<input type="hidden" id="DIC_CODE_TOWNSHIP" value="${ctx}/xt/xtXzjdxxbCreateDic">
						<a class="create">生成</a>
					</td>
				</tr>
				<tr>
					<td>居委会字典</td>
					<td>DIC_CODE_NEIGHBORHOOD
					</td>
					<td>
						<input type="hidden" id="DIC_CODE_NEIGHBORHOOD" value="${ctx}/xt/xtJwhxxbCreateDic">
						<a class="create">生成</a>
					</td>
				</tr>
				<tr>
					<td>街路巷字典</td>
					<td>DIC_CODE_STREETLANE
					</td>
					<td>
						<input type="hidden" id="DIC_CODE_STREETLANE" value="${ctx}/xt/xtJlxxxbCreateDic">
						<a class="create">生成</a>
					</td>
				</tr>
				<tr>
					<td>警务责任区字典</td>
					<td>DIC_DEPT_AOR
					</td>
					<td>
						<input type="hidden" id="DIC_DEPT_AOR" value="${ctx}/xt/xtJwzrqxxbCreateDic">
						<a class="create">生成</a>
					</td>
				</tr>
				<tr>
					<td>通用字典</td>
					<td>&nbsp;</td>
					<td>
						<input type="hidden" id="importantDic" value="${ctx}/admin/sysDicCreateXmlForm">
						<a class="create">生成</a>
					</td>
				</tr>
				<tr>
					<td colspan="3"><a class="createAll" onclick="createAll()">生成所有字典</a></td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>
