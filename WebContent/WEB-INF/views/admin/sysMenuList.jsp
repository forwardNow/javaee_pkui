<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
    <title>菜单管理</title>
    <style>
    .psa{position:absolute;}.psr{position:relative;}
    .dinl{display:inline-block;}
    .menu-form{
       padding:15px;
       font-size:12px;
    }
    .menu-form div{
       height:30px;
    }
    .menu-form label{
       display:inline-block;
       width:100px;
       text-align:right;
    }
    .menu-form label span{
       color:red;
    }
    #icons{
        display:none;
        position:absolute; 
        border:solid 1px rgb(126, 173, 217);
        z-index:1999;
        overflow:auto;
    }
    #icons a{
        border:solid 1px #fff;
    }
    #icons a:hover{
        border:solid 1px tomato;
    }
    #showIcon{
        vertical-align:middle;
        
    }
    </style>
    
    <script type="text/javascript">
    //链接资源
    var UUR =  {
            //新增页面
            'sysMenuAddSon' : '${ctx}/admin/sysMenuForm?random=' + Math.random(),
            //删除链接
            'sysMenuDelete' : '${ctx}/admin/sysMenuDelete?random=' + Math.random(),
            //树节点查询链接
            'sysMenuTreeData' : '${ctx}/admin/sysMenuTreeData?random=' + Math.random(),
            //查图标
            'sysMenuIcons' : '${ctx}/admin/sysMenuIconsData?random='  + Math.random(),
            		
            'sysMenuUpdateNode' : '${ctx}/admin/sysMenuUpdateNode?random='  + Math.random()
    };

     //新增子菜单
    function doSysMenuAddSon(){
		try{
			var menuId = Pku.getExt('menuTree').getSelectionModel().getSelectedNode().attributes.id;  //得到选中的节点编号
	        var root = "root";
	        if(menuId == root){
	            var diag = openMidDialog({Title : "新增子菜单",
	                URL : UUR.sysMenuAddSon,
	                OKEvent : function(){
	                    diag.innerWin["doSaveSysMenu"]();
	                }
	            });
	        } else {
	            var diag = openMidDialog({
	                Title : "新增子菜单",
	                URL : UUR.sysMenuAddSon+"&menuId="+menuId,
	                OKEvent : function(){
	                    diag.innerWin["doSaveSysMenu"]();
	                }
	            });
	        }
		} catch(e){
			Dialog.alert("请选中需要操作的菜单");
		}
     }
     
     //更改页面元素状态
     function reStatus(){
         	Pku.getDom("cue").value = "cue"; ////改变值让提示信息消失
            Pku.getDom("menuId").value = "";
            Pku.getDom("menuName").value = "";
            Pku.getDom("menuName").disabled = true;
            Pku.getDom("menuUrl").value = "";
            Pku.getDom("menuUrl").disabled = true;
            Pku.getDom("icon").value = "";
            Pku.getDom("icon").disabled = true;
            Pku.getDom("visiable").disabled = true;
            Pku.getDom("visiable1").disabled = true;
            Pku.getDom("expand").disabled = true;
            Pku.getDom("expand1").disabled = true;
            Pku.getDom("orderFlag").value = "";
            Pku.getDom("orderFlag").disabled = true;
     }
     
     //刷新输入框
     function reInput(objRet){
            var dic = Pku.getDic();
            dic.loadDic("DIC_YESORNO");
            dic.loadDic("DIC_DEPT_LEVEL");
            Pku.getDom("cue").value = "noCcue"; ////改变值让提示信息消失
            Pku.getDom("menuId").disabled = false;
            Pku.getDom("menuId").value = objRet.data.menuId;
            Pku.getDom("menuName").disabled = false;
            Pku.getDom("menuName").value = objRet.data.menuName;
            Pku.getDom("orderFlag").disabled = false;
            Pku.getDom("orderFlag").value = objRet.data.orderFlag;
            Pku.getDom("menuUrl").disabled = false;
            
            if(objRet.data.menuUrl == null){
                Pku.getDom("menuUrl").value = "";
            }else{
                Pku.getDom("menuUrl").value = objRet.data.menuUrl;
            } 
            Pku.getDom("icon").disabled = false;
            if(objRet.data.icon == null){
                Pku.getDom("icon").value = "";
                Pku.getDom("showIcon").innerHTML = '';
            }else{
                var iconName = objRet.data.icon;
                Pku.getDom("icon").value = iconName;
                Pku.getDom("showIcon").innerHTML = '<img src="${ctx}/static/images/icons/16x16/' + iconName + '">';
            }

            Pku.getDom("visiable").disabled = false;            
            Pku.getDom("visiable1").disabled = false;
            Pku.getDom("expand").disabled = false;
            Pku.getDom("expand1").disabled = false;
            
            var vis = objRet.data.visiable;
            var exp = objRet.data.expand;
            

            if(vis == 1){
           	 	Pku.getDom("visiable").checked="checked";
            } else {
           	 	Pku.getDom("visiable1").checked="checked";
            }
            if(exp == 1){
           	 	Pku.getDom("expand").checked="checked";
            } else {
           	 	Pku.getDom("expand1").checked="checked";
            }
           
     }
    //选择树节点得到信息
    function doSysMenuSelect(node){
        var menuId = node.attributes.id;
        var root = "root";
        if(menuId == root){
            reStatus();
        }else{
            reMenuSelect(menuId);
        }
    }
    
    //加载选中的树节点详细信息
    function reMenuSelect(menuId){
        Pku.Common.ajax(UUR.sysMenuTreeData+"&menuId=" +menuId,{},function(bln,response,o){
            var objRet = toJson(response.responseText);
            reInput(objRet);
        });
    }
    
    //保存菜单
    function doSysMenuSave(){
        var cue = getDom("cue").value;
        if(cue != "cue"){
            var frm = Pku.getExt("saveMenuFrm");
            frm.submit();
        }else {
            Dialog.alert("请先选择要保存的菜单！");
        } 
    }
    
    //删除菜单
    function doSysMenuDelete(){
        var cue = getDom("cue").value;
        if(cue != "cue"){
            var menuId = Pku.getExt('menuTree').getSelectionModel().getSelectedNode().attributes.id;  //得到选中的节点编号
            var root = "root";
            if(menuId != root){
                    Dialog.confirm("将会删除菜单和下属相关的<br/>所有菜单，是否删除？", function(){
                        Pku.Common.ajax(UUR.sysMenuDelete+"&menuId=" +menuId,{},function(bln,response,o){
                            var objRet = toJson(response.responseText);
                            if(objRet.success){
                                Dialog.alert("删除成功！",function(){window.document.location.reload();});
                            }else{
                                Dialog.alert(objRet.message);
                            }
                        });
                    });
            }
        }else {
            Dialog.alert("请先选择要删除的菜单！");
        } 
        
    }
    
    //反馈
    function doResult(form, action){
        var objRet = toJson(action.response.responseText);  
         if (objRet.success){
            Dialog.alert("保存成功！", function(){
                reloadMenu();
            });
         } else {
            Dialog.alert(objRet.message);
         }
    }

    //重新加载数据
    function reloadMenu(){
        window.location.href = window.location.href;
    }
    
    //将后台返回的list转成ext树节点数组
    function getTreeNodes(data){
        var nodes = [];
        for(var i=0;i<data.length;i++){
            var item = data[i];
            var node = {
                id : item.menuId,
                text : item.menuName,
                opurl : item.menuUrl,
                expanded : (item.expand == 1 ? true : false),
                leaf : true,
                allowDrag : true
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
                var treeNode = {
                    id : "root",
                    text : "菜单树",
                    expanded : true,
                    allowDrag : false,
                    children : nodes
                };
                Pku.getExt("menuTree").getRootNode().appendChild(treeNode);
            }
        });
    }
    //设置单位字典
    function doSetDeptDic(o, id){
        var deptLevel = o.code;
        if ( deptLevel ) {
            Pku.getDom(id).src = "${ctx }/admin/sysDeptDic?deptLevel=" + deptLevel;
        }
    }
    
           
    //载入图标
    function loadIcons(){
        Pku.Common.ajax(UUR['sysMenuIcons'], {}, function(btn, response, o){
            var data = toJson(response.responseText).data;
            var temp = '<a href="javascript:void(0)"><img name="{{iconName}}" src="${ctx}/static/images/icons/16x16/{{iconName}}" /></a>';
            var renderHtml = '';
            for ( var i = 0;i < data.length;i++) {
                renderHtml += temp.replace(/{{(\w+)}}/g, function(markOut, markIn){
                    return data[i][markIn] || '';
                });
            }
            Pku.getDom("icons").innerHTML = renderHtml;
        });
    }

    //显示图标
    function showIcons(o){
        var x = o.offsetLeft,
            y = o.offsetTop + o.offsetHeight + 1,
            width = 300,
            height = 260;
        var panel = Pku.getDom("icons");
        panel.style.cssText = 
            'display:block;' +
            'top:' + y + 'px;' +
            'left:' + x + 'px;' + 
            'width:' + width + 'px;' +
            'height:' + height + 'px;';                     
    }

    //设置图标
    function setIcons(event){
        var e = event || window.event;
        var obj = e.target||e.srcElement;
        if ( obj.tagName.toUpperCase() === 'IMG' ) {
            Pku.getDom("icon").value = obj.name;
            Pku.getDom("showIcon").innerHTML = '<img src="${ctx}/static/images/icons/16x16/' + obj.name + '">';
            //Pku.getDom("icons").style.display = 'none';
        }
    }
    
    // 页面初始化
    Ext.onReady( function(){
        loadingMenuTree();
        reStatus();
        loadIcons();
        document.onclick = function(){
        	var event = event || window.event,
            src = event.target || event.srcElement;
        	if ( src.className != 'selectIcon' && Pku.getDom("icons").style.display != 'none' ) {
        		Pku.getDom("icons").style.display = 'none';
        	}
        };
    });
    
    function doSysMenuDrag(e){
    	var targetNode = e.target;
    	var dropNode = e.dropNode ;
    	var point = e.point; //- The point of the drop - append, above or below
        try{
    	    var res = Pku.Common.ajax(UUR.sysMenuUpdateNode,{sourceMenuId:dropNode.id,targetMenuId:targetNode.id,point:point},false);
            var retJson = toJson(res.responseText);
            if(retJson.success){
                return true;
            }else{
                Dialog.alert("操作失败:" + retJson.message);
                return false;
            }
        }catch(e){
            Dialog.alert("操作失败:" + e.message);
            return false;
        }
    }
    </script>
</head>
<body>
<div id="sysDeptGrid" title="菜单管理" iconCls="icon-window" xtype="panel" region="center" pagingBar="true" forceFit="true" border="false" onExtRowdblclick="onRowdblclick()">
    <div region="west" width="215" border="false">
        <div xtype="tbar">
            <div id="sysMenuAddSonBtn" text="新增子菜单" iconCls="icon-add" onExtClick="doSysMenuAddSon()"></div>
        </div>
        <div id="menuTree" xtype="treepanel" region="center" border="false" autoScroll="true" enableDD="true" onExtClick="doSysMenuSelect()" onExtBeforenodedrop="doSysMenuDrag()">
            <div id="treeNodeRoot" xtype="root">
            
            </div>
        </div>
    </div>
    <div region="center" >
        <div xtype="tbar">
            <div id="sysMenuSaveBtn" text="保存" iconCls="icon-add" onExtClick="doSysMenuSave()"></div>
            <div id="sysMenuDelBtn" text="-"></div>
            <div text="删除" iconCls="icon-delete" onExtClick="doSysMenuDelete()"></div>
            <div text="-"></div>
        </div>
        <div id="sysMenuForm">
            <form id="saveMenuFrm" url="${ctx}/admin/sysMenuUpdate" method="POST" onExtSuccess="doResult()" onExtFaiure="doResult()">
                <input id="cue" type="hidden" name="cue" value="cue"/>
                <input id="menuId" type="hidden" name="menuId"/>
                <input id="menuLevel" type="hidden" name="menuLevel" value="0"/>
                <div class="menu-form">
                    <div class="psr">
                        <label><span>*</span>菜单名称：</label>
                        <input id="menuName" type="text" name="menuName"  maxlength="64" must="true"/>
                        <div  class="psa dinl"><label><span>*</span>是否展开：</label></div>
						<div class="psa" style="top:0px;left:365px;">
							<input type="radio" id="expand" name="expand" value="1"/> 是
							<input type="radio" id="expand1" name="expand" value="0"/> 否
						</div>
                    </div>
                    <div class="psr">
                        <label><span>*</span>菜单顺序：</label>
                        <input id="orderFlag" type="text" name="orderFlag"  maxlength="30"/>
                        <div  class="psa dinl"><label><span>*</span>是否可用：</label></div>
						<div class="psa" style="top:0px;left:365px;">
							<input type="radio" id="visiable" name="visiable" value="1"/> 是
							<input type="radio" id="visiable1" name="visiable" value="0"/> 否
						</div>
                    </div>
                    <div  class="psr">
                        <label>链接路径：</label>
                        <input id="menuUrl" type="text" name="menuUrl"  maxlength="200"/>
                        
                    </div>  
                    <div class="psr">
                        <label>菜单图标：</label>
                        <input id="icon" type="hidden" name="icon"  maxlength="30" readonly />
                        <span id="showIcon"></span>
                        <a class="selectIcon" href="javascript:;" onclick="showIcons(this)" >选择</a>
                        <div id="icons" onclick="setIcons()"></div>
                    </div>
                </div>
            </form>
        </div>
    </div>
    </div>
</body>
</html>
