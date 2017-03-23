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
	</script>
</head>
<body>
	<form id="advQryFrm" name="advQryFrm">
        <table class="qryTab">
            <tr>
                <td>警号</td>
                <td>
                    <input type="text"  fieldname="policeCode"/>
                </td>
                <td></td>
            </tr>
            <tr>
                <td>真实姓名</td>
                <td><input id="advUserName" type="text" fieldname="userName"  operation="like"/></td>
                <td>
                    <input type="checkbox" value="1" checked onClick="setOperation('advUserName',this)"> 模糊
                </td>
            </tr>
            <tr>
            	<td>用户类型</td>
            	<td><input type="text" kind="dic" fieldname="userType" src="DIC_USER_TYPE" /></td>
            	<td></td>
            </tr>
            <tr>
                <td>所属单位</td>
                <td><input type="text" fieldname="deptId" kind="dic" src="DIC_DEPT" /></td>
                <td></td>
            </tr>
        </table>
	</form>
</body>
</html>
