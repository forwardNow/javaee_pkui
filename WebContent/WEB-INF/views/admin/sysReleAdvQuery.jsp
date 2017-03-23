<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/common/global.jsp" %>
<html>
<head>
	<title>高级查询</title>
	<style>
	   body{
	       font-size:12px;
	   }
	   .qryTab{
	       margin:10px 0px 0px 20px;
	   }
	   .qryTab td{
	       height:30px;
	   }
	</style>
	<script type="text/javascript">
    	function setOperation(opid,dom){
    		if(dom.checked){
	    		Pku.getDom(opid).setAttribute("operation","like");
    		}else{
	    		Pku.getDom(opid).setAttribute("operation","=");
    		}
    	}
    	function setCheckbox(dom,val){
    		if(dom.checked){
    			dom.value = val;
    		}else{
    			dom.value = "";
    		}
    	}
	</script>
</head>
<body>
	<form id="advQryFrm" name="advQryFrm">
        <table class="qryTab">
            <tr>
                <td>单位名称</td>
                <td><input id="advDeptName" type="text" name="deptName" fieldname="deptName" operation="like" /></td>
                <td>
                    <input type="checkbox" value="1" checked onClick="setOperation('advDeptName',this)"> 模糊
                </td>
            </tr>
            <tr>
                <td>单位编码</td>
                <td><input type="text" name="deptId" fieldname="deptId"  maxlength="12" /></td>
                <td></td>
            </tr>
            <tr>
                <td>是否主管单位</td>
                <td>
                    <input type="checkbox" name="isMainDept" fieldname="isMainDept" value="" onClick="setCheckbox(this,'1')"/>是  
					<input type="checkbox" name="isMainDept" fieldname="isMainDept" value="" onClick="setCheckbox(this,'0')"/>否  
                </td>
                <td><font color="#666666">（注：单位级别中行政级别最大的单位）</font></td>
            </tr>
            <tr>
                <td>上级单位</td>
                <td>
                    <input type="text" kind="dic" _name="parentDeptId" fieldname="parentDeptId" src="DIC_RELE" />
                </td>
                <td></td>
            </tr>
            <tr>
                <td>单位级别</td>
                <td>
                    <input type="text" _name="deptLevel" fieldname="deptLevel" kind="dic" src="DIC_DEPT_LEVEL" />
                </td>
                <td></td>
            </tr>
        </table>
	</form>
</body>
</html>
