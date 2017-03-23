<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
	<title>编辑菜单信息</title>
	<style>
	.pa{position:absolute;}.pr{position:relative;}
	.bdr{border-right:solid 1px #cfcfcf;}.bdb{border-bottom:solid 1px #efefef;}
	.menu-add-panel{
        width:300px;
        height:220px;
	}
	.menu-edit-baseinfo{
	    color:#0a3f6c;
	    padding:5px;
	    font-size:12px;
	}
	.menu-edit-baseinfo div{
	    height:30px;
        line-height:30px;
	}
    .menu-edit-baseinfo label{
        display:inline-block;
        width:100px;
        text-align:right;
    }
    .menu-edit-baseinfo span{
        color:red;
    }
    #icons{
        display:none;
        position:absolute; 
        border:solid 1px rgb(126, 173, 217);
        z-index:1999;
        overflow:auto;
        margin-top:100px;
        margin-left:5px;
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
            //查图标
            'sysMenuIcons' : '${ctx}/admin/sysMenuIconsData?random='  + Math.random()
    };
	//关闭本窗口
	function doClose(){
		ownerDialog.close();
	}
	
	//保存
	function doSaveSysMenu(){
		var frm = Pku.getExt("saveMenuFrm");
		frm.submit();
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
            Pku.getDom("icons").style.display = 'none';
        }
    }
	
    //反馈
    function doResult(form, action){
        var objRet = toJson(action.response.responseText);
        if ( objRet.success ){
		   Dialog.confirm('保存成功，要继续录入么？',function(){
		    		//重新载入
		    		window.location.href = window.location.href;
		    	},function(){
 		        	ownerDialog.openerWindow["reloadMenu"]();
		    		//关闭表单窗口
		    		doClose();
		    	});
    		
        } else {
        	Dialog.alert(objRet.message);
        }
    }
 // 页面初始化
    Ext.onReady( function(){
        loadIcons();
    });
	</script>
</head>
<body>
    <div class="menu-add-panel pr">
    <form id="saveMenuFrm" url="${ctx}/admin/sysMenuAdd" method="POST" onExtSuccess="doResult()" onExtFaiure="doResult()">
      	 <div class="menu-edit-baseinfo">
      	 		 <input type="hidden" name="menuId" value="${sysMenu.menuId}"  maxlength="30"/>
      	 		 <input type="hidden" name="menuLevel" value="0" /> <!-- 暂时用不到，默认为0 -->
                <div>
                    <label><span>*</span>菜单名称：</label>
                    <input type="text" name="menuName" maxlength="64" must="true" />
                </div>
                <div>
                    <label>链接路径：</label>
                    <input type="text" name="menuUrl"   maxlength="198"/>
                </div>
                <div class="psr">
                    <label>菜单图标：</label>
                    <input type="text" id="icon" name="icon"  maxlength="30" readonly onclick="showIcons(this)"/>
                    <span id="showIcon"></span>
                    <div id="icons" onclick="setIcons()"></div>
                </div>
              	<div>
                    <div style="float:left;padding-left:3px;">
	           		<label><span>*</span>是否可用：</label>
	         		</div>
	                <div style="padding-top:5px;">
						<input type="radio" id="visiable" name="visiable" value="1" checked="checked"/> 是
						<input type="radio" id="visiable1" name="visiable" value="0"/> 否
                    </div>
               </div>
               <div>
                    <div style="float:left;padding-left:3px;">
	         			<label><span>*</span>是否展开：</label>
	         		</div>
	                <div style="padding-top:5px;">
						<input type="radio" id="expand" name="expand" value="1" checked="checked"/> 是
						<input type="radio" id="expand1" name="expand" value="0"/> 否
                    </div>
               </div>
          </div>     
    </form>
    </div>
</body>
</html>




