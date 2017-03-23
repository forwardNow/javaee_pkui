<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
	<title>资源选择菜单</title>
	<script type="text/javascript">
		//保存
		function doSaveSysMenu(node){
			if(node.leaf){
				var menuId = node.attributes.id;
				var menuName = node.attributes.text;					
				ownerDialog.openerWindow.Pku.getDom("menuName").value = menuName;
				ownerDialog.openerWindow.Pku.getDom("menuName").focus();
				ownerDialog.openerWindow.Pku.getDom("menuName").blur();
				
				ownerDialog.openerWindow.Pku.getDom("menuId").value = menuId;
				Dialog.close();
			}
		}
		
		// 将后台返回的list转成ext树节点数组
		function getTreeNodes(data){
			var nodes = [];
			for(var i=0;i<data.length;i++){
				var item = data[i];
				var node = {
					id : item.menuId,
					text : item.menuName,
					opurl : item.url,
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
					if(pNode.children){
						pNode.children.push(node);
					}else{
						pNode.leaf = false;
						pNode.children = [node];
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
		
		//加载菜单树
		function loadingMenuTree(){
			Pku.Common.ajax("${ctx}/admin/sysMenuListData?" + Math.random(),"",function(bln,response){
				var res = toJson(response.responseText);
				var data = res.data;
				if(data){
					var nodes = getTreeNodes(data);
					Pku.getExt("menuTree").getRootNode().appendChild(nodes);
				}
			});
		}
		
		// 页面初始化
		Ext.onReady(function(){
			 loadingMenuTree();
		});
	</script>
</head>
<body>
	<div id="menuTree" xtype="treepanel" region="center" onExtClick="doSaveSysMenu()">
		<div id="treeNodeRoot" xtype="root"></div>
	</div>
</body>
</html>