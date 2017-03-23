<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
	<title>编辑单位信息</title>
	<style>
	.psr{position:relative;}.psa{position:absolute;}
	.dept-edit{
		padding:20px;
		font-size:12px;
	}
	.dept-edit div{
		height:30px;
		line-height:30px;
	}
	.dept-edit label{
		display:inline-block;
		width:90px;
		text-align:right;
	}
	.dept-edit span{
		color:red;
	}
    #radios label{
        display:inline-block;
        width:37px;
        text-align:left;
        color:#000;
    }
    .in-text{
        width:225px;
    }
	</style>
	<script type="text/javascript">    

	//关闭本窗口
	function doClose(){
		ownerDialog.close();
	}
	
	//保存
	function doSaveSysDept(){
		var frm = Pku.getExt("addDeptFrm");
	    frm.submit();
	}

	//反馈
	function doResult(form, action) {
		if ( !action.response ) {
			return ;
		}
		var objRet = toJson(action.response.responseText);
	    if ( objRet.success ){
    		ownerDialog.openerWindow["doSysDeptQuery"]();
    		if('${sysDept.deptId}' != ''){ //修改
    			//关闭表单窗口
    			Dialog.alert("修改成功.", function(){
    				doClose();
    			});
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
            if ( 'already' == objRet.message ) {
                checkField(Pku.getDom("deptName"));
                checkField(Pku.getDom("deptId"));
                return;
            } else {
            	Dialog.alert(objRet.message);
            }
	    }
	}
	
	//得到级别
	function getDeptLevel(){
	    var deptLevel = null;
        var radios = document.getElementsByName('deptLevel');
        for ( var i = 0;i < radios.length;i++ ) {
            if ( radios[i].checked ) {
                deptLevel = radios[i].value;
            }
        }
        return (deptLevel === null) ? null : deptLevel;
	}
	
	//设置单位字典
	function doSetDeptDic(id){
        var deptLevel = getDeptLevel();
        Pku.getDom(id).src = "${ctx }/admin/sysDeptDic?deptId=${_pku_user.deptId}&deptLevel=" + deptLevel + "&releType=1";
        Pku.getDom(id).focus();
	}
	
	//检查单位字典
	function doCheckDeptDic(o){
		var deptLevel = getDeptLevel();
	    if ( deptLevel === null ){
	    	Dialog.alert("请选择单位级别");
	    	o.value = "";
	    	o.setAttribute("code","");
	    } else {
	    	doSetDeptDic('parentDeptId');
	    }
	}
	
	function doCheckDataDeptDic(o){
		var pid = Pku.getDom("parentDeptId").getAttribute("code");
	    if (!pid){
	    	Dialog.alert("请选择上级单位");
	    	o.value = "";
	    	o.setAttribute("code","");
	    } else {
	    	o.setAttribute("src","${ctx }/admin/sysDeptDic?deptId=" + pid + "&deptLevel=4&releType=0");
	    }
	}
    //输入验证
    function checkField(objInput){
    	if ( objInput.value ) {
    		var params = "deptId=${sysDept.deptId}&fieldName=" + objInput.name + "&fieldValue=" + encodeURI(encodeURI(objInput.value));
    		Pku.Common.ajax("${ctx}/admin/sysDeptCheckInfo?" + params, {}, function(btn, response, o){
	        	var objRet = toJson(response.responseText);
	            if( !objRet.success ){
	                Pku.getDom(objInput.name + 'Msg').innerHTML = "已存在";
	                objInput.focus();
	            } else {
	            	Pku.getDom(objInput.name + 'Msg').innerHTML = "";
	            }
	        });
    	}
    }
    Ext.onReady(function(){
        //渲染单位级别字典
        /* Pku.Common.ajax("${ctx }/admin/sysDeptLevelDic", {} ,function(btn, response, o){
            var reXml = response.responseXML;
            var data; 
            var radios = '<input type="radio" id="radio_{{DIC_CODE}}" name="deptLevel" value="{{DIC_CODE}}" must="true" {{checked}} /><label class="radio-label" for="radio_{{DIC_CODE}}">{{DIC_TEXT}}</label>';
            var tempRadios;
            var renderHtml = '';
            try {
                data = reXml.selectSingleNode("data").selectNodes("row");
                for ( var i = 0;i < data.length;i++ ) {
                    tempRadios = radios;
                    tempRadios = tempRadios.replace(/{{(\w+)}}/g, function(markOut, markIn){
                        return data[i].getAttribute(markIn) || markOut;
                    });
                    renderHtml += tempRadios.replace(/{{(\w+)}}/g, function(markOut, markIn){
                        return ('${sysDept.deptLevel}' === data[i].getAttribute('DIC_CODE')) ? 'checked' : '';
                    });
                }
                Pku.getDom("radios").innerHTML = renderHtml;
            } catch (err) {
                Dialog.alert("获取角色信息错误，请重试");
            }
        }); */
    });
	</script>
</head>
<body>
	<form id="addDeptFrm" url="${ctx}/admin/sysDeptSave" method="post" onExtSuccess="doResult()" onExtFailure="doResult()">
		<input type="hidden" name="oldDeptId" value="${sysDept.deptId}" />
		<div class="dept-edit">
			<div>
                <label><span>*</span>单位级别</label>
                <span id="radios" >
					<pku:dic dicName="DIC_DEPT_LEVEL" var="deptLevelItems">
					<c:forEach items="${deptLevelItems}" var="item">
						<c:if test="${item.itemCode >= _pku_user.userLevel}">
						<input type="radio" id="radio_${item.itemCode}" name="deptLevel" value="${item.itemCode}" <c:if test="${sysDept.deptLevel == item.itemCode}">checked</c:if> must="true" />
						<label class="radio-label" for="radio_${item.itemCode}">${item.itemValue}</label>
						</c:if>
					</c:forEach>
					</pku:dic>
				</span>
			</div>
			<div class="psr">
                <div class="psa" style="top:0px;left:0px;">
                    <label><span>*</span>上级单位</label>
                </div>
                <div class="psa" style="top:4px;left:95px;">
                	<!-- releType：0为只当前用户下的deptLevel参数指定的级别单位，1：查询当前用户下的deptLevel级别和deptLevel上一级别主管 -->
	                <input type="text" class="in-text" id="parentDeptId" _name="parentDeptId" kind="dic" src="${ctx }/admin/sysDeptDic?deptId=${_pku_user.deptId}&deptLevel=${sysDept.deptLevel}&releType=1" value="${sysDept.parentDeptId}" must="true" 
	                       onFocus="doCheckDeptDic(this)" />
                </div>
			</div>
			<div>
				<label><span>*</span>单位名称</label>
				<input type="text" class="in-text" id="deptName" name="deptName" value="${sysDept.deptName}" maxlength="64" must="true" />
				<span id="deptNameMsg"></span>
			</div>
			<div>
				<label><span>*</span>单位编码</label>
				<input type="text" class="in-text"
				       id="deptId" name="deptId" kind="int"
				       value="${sysDept.deptId}" minLength="12" maxLength="12" must="true" /> 
				<span id="deptIdMsg"></span>
			</div>
			<div>
				<label><span>*</span>是否主管单位</label>
				<input type="radio" name="isMainDept"  value="1" <c:if test="${sysDept.isMainDept == '1'}">checked</c:if>/>是  
				<input type="radio" name="isMainDept"  value="0" <c:if test="${sysDept.isMainDept == null || sysDept.isMainDept == '0'}">checked</c:if>/>否  
				<font color="#666666">（注：是否为当前单位级别中行政级别最高的单位）</font>
			</div>
			<div>
				<label>电话</label>
				<input type="text" class="in-text" name="tel"  value="${sysDept.tel}"  maxlength="20"/>
			</div>
			<div>
				<label>传真</label>
				<input type="text" class="in-text" name="fax" value="${sysDept.fax}" maxlength="20" />
			</div>
		</div>
	</form>
</body>
</html>
