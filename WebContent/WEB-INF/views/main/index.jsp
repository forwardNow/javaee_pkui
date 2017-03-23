<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<jsp:useBean id="now" class="java.util.Date" /> 
<html>
<head>
	<title>登录页</title>

	<script type="text/javascript">
	function doTreeClick(node){
		if(node.isLeaf()){
			var opurl = node.attributes.opurl;
			if(opurl){
				var datNow = new Date();
				var sRandom = datNow.getUTCFullYear() + datNow.getUTCMonth() + datNow.getUTCDate() + 
					datNow.getUTCHours() + datNow.getUTCMinutes() + datNow.getMinutes() + 
					datNow.getUTCSeconds() + datNow.getUTCMilliseconds();
					
				document.getElementById("famRMain").src = "${ctx}" + opurl + (opurl.indexOf("?") == -1 ? "?" : "&") + "random=" + sRandom;
			}
		}
		
	}
	
	function selfwork(){
		document.getElementById("famRMain").src = "${ctx}/workflow/taskList?random=" +  Math.random();
	}
	
	function doQuit(){
		document.location = "${ctx}/logout";
	}
	
	// 将后台返回的list转成ext树节点数组
	function getTreeNodes(data){
		var nodes = [];
		for(var i=0;i<data.length;i++){
			var item = data[i];
			var node = {
				id : item.menuId,
				text : item.menuName,
				opurl : item.menuUrl,
				expanded : (item.expand == 1 ? true : false),
				leaf : true
			};
			if(item.icon){
				Ext.apply(node,{
					iconCls : "icon16-" + item.icon.replace(".png","")
				});
			}
			if(!item.treeParentid){
				nodes.push(node);
			}else{
				var pNode = getTreeParentNode(item.treeParentid,nodes);
				if(pNode){
					if(pNode.children){
						pNode.children.push(node);
					}else{
						pNode.leaf = false;
						pNode.children = [node];
					}
				}
			}
		}
		return nodes;
	}
	
	// 获取父节点
	function getTreeParentNode(pid, nodes){
		for(var i=0;i<nodes.length;i++){
			if(nodes[i].id == pid){
				return nodes[i];
			}else if(nodes[i].children){ // 若没找到父节点，深度遍历它的孩子节点
				node = getTreeParentNode(pid,nodes[i].children);
				if(node != null){
					return node;
				}
			}
		}
		return null;
	}
	
	
	// 页面初始化
	Ext.onReady(function(){
		Pku.Common.ajax("${ctx}/main/menu?" + Math.random(),"",function(bln,response){
			var res = toJson(response.responseText);
			var data = res.data;
			if(data){
				var nodes = getTreeNodes(data);
				Pku.getExt("el_tree_right").getRootNode().appendChild(nodes);
			}
		});
		
		selfwork();
	});
	</script>
</head>
<body>
<div id="famTop" region="north" height="43" border="false">
	<table width="100%" height="43" cellspacing="0" cellpadding="0" style="background-image:url('${ctx}/static/images/pku/titlebg.gif');background-repeat:repeat-x;">
		<tr>
			<td style="padding-left:5px; font-size: 18px;color: #fff;font-weight: bold;" align="left">
				<td width="40px"><img id="logoImg" src="${ctx}/static/images/pku/logo.gif"></td>
				<td style="padding-left:5px; font-size: 18px;color: #fff;font-weight: bold;" align="left">四川省公安厅省级人口信息管理系统</td>
			</td>
			<td id="logoTD" valign="middle" align="right">
				<table width="530px" border="0" cellspacing="0" cellpadding="0" style="color: #fff;font-size: 13px;">
					<tr>
						<td align="center" width="17%">
							<img height="16px;" width="16px;" style="margin-bottom:-3px;"
								src="${ctx}/static/images/default/shared/calendar.gif" />
							<span id="nowDate"><fmt:formatDate value="${now}" type="both" dateStyle="long" pattern="yyyy-MM-dd" /></span>
						</td>
						<td align="center" width="20%">
							<img height="16px" width="14px" style="margin-bottom:-3px;"
								src="${ctx}/static/images/icons/icon021a6.gif" />
							<span id="currentUser"><shiro:principal property="loginName" /></span>
						</td>
						<td align="center" width="17%">
							<img height="16px" width="14px" style="margin-bottom:-3px;"
								src="${ctx}/static/images/icons/icon_key.gif" />
							<span onclick="showPwWin();" style="cursor: pointer;">修改口令</span>
						</td>
						<td align="center" width="17%">
							<img height="16px" width="16px" style="margin-bottom:-3px;"
								src="${ctx}/static/images/icons/icon026a22.gif" />
							<span onclick="selfwork();" style="cursor: pointer;">任务中心</span>
						</td>
						
						<td align="center" width="12%">
							<img height="16px" width="16px" style="margin-bottom:-3px;"
								src="${ctx}/static/images/icons/icon008a19.gif" />
							<span onclick="doHelp()" style="cursor: pointer;">帮助</span>
						</td>
						 
						<td align="center" width="12%">
							<img height="16px" width="16px" style="margin-bottom:-3px;"
								src="${ctx}/static/images/icons/icon019a7.gif" />
							<span onclick="doQuit()" style="cursor: pointer;">注销</span>
						</td>
						<td width="1%"></td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</div>
<div id="menuPanel" region="west" width="200" split="true" collapsible="true" collapseMode='mini' border="false">
	<div id="el_tree_right" xtype="treepanel" region="center" title="功能树" onExtClick="doTreeClick()" autoScroll="true">
		<div id="treeNodeRoot" xtype="root">
		</div>
	</div>
	<div region="south" height="140" title="用户信息" border="false">
		<div region="center">
			<table height="50" align="center" class="info"><tr><td id="userInfo_Title"><shiro:principal property="deptName" /></td></tr><tr><td id="userInfo_UserName"><shiro:principal property="userName" /></td></tr></table>
		</div>
		<div region="south" height="60" title="版权信息">
			<table align="center" height="35" class="info"><tr><td class="info">xxxx</td></tr></table>
		</div>
	</div>
</div>
<div id="mainFrame" region="center" border="false">
	<iframe id="famRMain" name="famRMain" region="center" frameborder="no" height="100%" width="100%" style="overflow:hidden;"></iframe>
</div>
</body>
</html>
