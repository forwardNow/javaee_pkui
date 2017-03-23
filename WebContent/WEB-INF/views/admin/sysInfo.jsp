<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/common/global.jsp"%>
<%@ page import="java.text.DecimalFormat" %>
<html>
<head>
<title>系统信息</title>
<style type="text/css">
.bar TD {
    padding : 0;
}
#pku-latest-activity .pku-bottom-line {
	padding-top: 10px;
    border-bottom : 1px #e8a400 solid;
	}
#pku-latest-activity {
    border: 1px #E8A400 solid;
    background-color: #FFFBE2;
	font-family: Lucida Grande, Arial, Helvetica, sans-serif;
	font-size: 9pt;
    padding: 0 10px 10px 10px;
    margin-bottom: 10px;
    min-height: 280px;
    -moz-border-radius: 4px;
    width: 95%;
    margin-right: 20px;
	}
#pku-latest-activity h4 {
	font-size: 13pt;
	margin: 15px 0 4px 0;
	}
#pku-latest-activity h5 {
	font-size: 9pt;
	font-weight: normal;
    margin: 15px 0 5px 5px;
	padding: 0;
	}
#pku-latest-activity .pku-blog-date {
    font-size: 8pt;
    white-space: nowrap;
	}
#pku-latest-activity .pku-feed-icon {
    float: right;
    padding-top: 10px;
	}
.info-header {
    background-color: #eee;
    font-size: 10pt;
}
.info-table {
    margin-right: 12px;
}
.info-table .c1 {
    text-align: right;
    vertical-align: top;
    color: #666;
    font-weight: bold;
    font-size: 9pt;
    white-space: nowrap;
}
.info-table .c2 {
    font-size: 9pt;
    width: 90%;
}


body, div, p, td, th {
	font-family:arial,helvetica,sans-serif;
	font-size:9pt;
}

/* tables */
.pku-table {
    border-color:#CCCCCC;
    border-style:solid;
    border-width:1px 1px 0;
}
.pku-table .c1, fieldset .c1 {
    width:30%;
}
.pku-table th, .pku-table td, .pku-option-table th, .pku-option-table td {
    padding:6px;
}
.pku-table th th, .pku-table td td {
    padding:0;
}
.pku-table td.icon {
    padding:0 5px 0 3px;
}
.pku-table th {
    background-color:#EEEEEE;
    border-bottom:1px solid #CCCCCC;
    font-family:verdana,arial,helvetica,sans-serif;
    font-size:8pt;
    font-weight:bold;
    text-align:left;
}
.pku-table th table th {
    border-bottom:medium none;
    border-right:medium none;
}
.pku-table th table th a {
    color:#000000;
    text-decoration:none;
}
.pku-table tr td {
    border-bottom:1px solid #E3E3E3;
}
.pku-table td {
    font-family:arial,helvetica,sans-serif;
    font-size:10pt;
}
.pku-table .pku-odd td {
    background-color:#FFFFFF;
}
.pku-table .pku-even td {
    background-color:#FBFBFB;
}
.pku-table tfoot td {
    background-color:#EEEEEE;
    border-bottom:1px solid #CCCCCC;
    font-family:verdana,arial,helvetica,sans-serif;
    font-size:8pt;
}
.pku-table td td {
    border-width:0;
}
.pku-table input, .pku-table select, .pku-option-table input, .pku-option-table select {
    font-family:verdana,arial,helvetica,sans-serif;
    font-size:8pt;
}
.pku-description, .pku-description a, .pku-table .pku-date, .pku-description input, .pku-description select {
    font-family:arial,helvetica,sans-serif;
    font-size:8pt;
}
.pku-label, .pku-option-table label {
    font-weight:bold;
    padding-right:10px;
    white-space:nowrap;
}
.pku-label {
    padding-right:20px;
    vertical-align:top;
}
.pku-buttons .pku-icon {
    padding:3px;
}
.pku-buttons .pku-icon-label {
    font-family:verdana,arial,helvetica,sans-serif;
    font-size:8pt;
    padding:3px 1em 3px 3px;
    white-space:nowrap;
}

/* --------------------------------------------- */
/*  Titles                                       */
/* --------------------------------------------- */

#pku-main #pku-title {
    font-size:12pt;
    font-weight:bold;
    padding-bottom:1em;
}

/* --------------------------------------------- */
/*  Main content                                 */
/* --------------------------------------------- */

#pku-main-content {
	-moz-border-radius-bottomleft:4px;
	-moz-border-radius-bottomright:4px;
	-moz-border-radius-topleft:4px;
	-moz-border-radius-topright:4px;
	background:#FAFAFA url(../${ctx}/static/images/pku/pku-body-contentbox-bg.gif) repeat-x scroll center top;
	border:1px solid #DCDCDC;
	padding:18px 20px;
}
</style>
<script type="text/javascript">
	
</script>
</head>
<body>
	<div title="系统信息" iconCls="icon-window" region="center" border="false">
		<div id="main" style="width: 780px">
			<div id="pku-main">
				<div id="pku-main-content">
					<table border="0" width="100%">
						<td valign="top">
							<!-- <div class="pku-table"> -->
							<table border="0" cellpadding="2" cellspacing="2" width="100%"
								class="info-table">
								<thead>
									<tr>
										<th colspan="2" align="left" class="info-header">应用服务器属性</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td class="c1">启动时间：</td>
										<td class="c2">
											<pku:date longValue="${containerStartTime}" pattern="yyyy-MM-dd HH:mm:ss"></pku:date>
										</td>
									</tr>
									<tr>
										<td class="c1">版本：</td>
										<td class="c2">1.0</td>
									</tr>
									<tr>
										<td class="c1">系统名称：</td>
										<td class="c2">管理平台</td>
									</tr>
									<tr>
										<td class="c1">应用主目录：</td>
										<td class="c2"><%=System.getProperty("user.dir") %></td>
									</tr>
									<tr>
										<td>&nbsp;</td>
									</tr>
								</tbody>
								<thead>
									<tr>
										<th colspan="2" align="left" class="info-header">环境</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td class="c1">JVM 版本和供应商：</td>
										<td class="c2">
										<%
					                        String vmName = System.getProperty("java.vm.name");
					                        if (vmName == null) {
					                            vmName = "";
					                        }
					                        else {
					                            vmName = " -- " + vmName;
					                        }
					                    %>
					                    <%= System.getProperty("java.version") %> <%= System.getProperty("java.vendor") %><%= vmName %>
										</td>
									</tr>
									<tr>
										<td class="c1">Java 安装目录:</td>
										<td class="c2"><%=System.getProperty("java.home") %></td>
									</tr>
									<tr>
										<td class="c1">Host Name:</td>
										<td class="c2"><%=System.getProperty("user.name") %></td>
									</tr>
									<tr>
										<td class="c1">OS／硬件：</td>
										<td class="c2"><%= System.getProperty("os.name") %> / <%= System.getProperty("os.arch") %></td>
									</tr>
									<tr>
										<td class="c1">Java 内存：</td>
										<td>
										    <%    
										    	// The java runtime
							                    Runtime runtime = Runtime.getRuntime();
							
							                    double freeMemory = (double)runtime.freeMemory()/(1024*1024);
							                    double maxMemory = (double)runtime.maxMemory()/(1024*1024);
							                    double totalMemory = (double)runtime.totalMemory()/(1024*1024);
							                    double usedMemory = totalMemory - freeMemory;
							                    double percentFree = ((maxMemory - usedMemory)/maxMemory)*100.0;
							                    double percentUsed = 100 - percentFree;
							                    int percent = 100-(int)Math.round(percentFree);
							
							                    DecimalFormat mbFormat = new DecimalFormat("#0.00");
							                    DecimalFormat percentFormat = new DecimalFormat("#0.0");
							                %>
							
							                <table cellpadding="0" cellspacing="0" border="0" width="300">
							                <tr valign="middle">
							                    <td width="99%" valign="middle">
							                        <div class="bar">
							                        <table cellpadding="0" cellspacing="0" border="0" width="100%" style="border:1px #666 solid;">
							                        <tr>
							                            <%  if (percent == 0) { %>
							
							                                <td width="100%"><img src="${ctx}/static/images/pku/percent-bar-left.gif" width="100%" height="8" border="0" alt=""></td>
							
							                            <%  } else { %>
							
							                                <%  if (percent >= 90) { %>
							
							                                    <td width="<%= percent %>%" background="${ctx}/static/images/pku/percent-bar-used-high.gif"
							                                        ><img src="${ctx}/static/images/pku/blank.gif" width="1" height="8" border="0" alt=""></td>
							
							                                <%  } else { %>
							
							                                    <td width="<%= percent %>%" background="${ctx}/static/images/pku/percent-bar-used-low.gif"
							                                        ><img src="${ctx}/static/images/pku/blank.gif" width="1" height="8" border="0" alt=""></td>
							
							                                <%  } %>
							                                <td width="<%= (100-percent) %>%" background="${ctx}/static/images/pku/percent-bar-left.gif"
							                                    ><img src="${ctx}/static/images/pku/blank.gif" width="1" height="8" border="0" alt=""></td>
							                            <%  } %>
							                        </tr>
							                        </table>
							                        </div>
							                    </td>
							                    <td width="1%" nowrap>
							                        <div style="padding-left:6px;" class="c2">
							                        <%= mbFormat.format(usedMemory) %> MB / <%= mbFormat.format(maxMemory) %> MB (已使用<%= percentFormat.format(percentUsed) %>%) 
							                        </div>
							                    </td>
							                </tr>
							                </table>
										</td>
									</tr>
								</tbody>
								<thead>
									<tr>
										<th colspan="2" align="left" class="info-header">系统访问情况</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td class="c1">在线总人数：</td>
										<td class="c2">
											${fn:length(users)}人
										</td>
									</tr>
									<tr>
										<td class="c1">历史最大在线人数：</td>
										<td class="c2">
											${online.maxOnlineCount}人
										</td>
									</tr>
									<tr>
										<td class="c1">发生时间：</td>
										<td class="c2">
											<fmt:formatDate value="${online.maxOnlineCountDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
										</td>
									</tr>
								</tbody>
							</table> <!-- </div> -->
						</td>
	
					</table>
	
					<br>
	
					<div class="pku-table">
						<table cellpadding="0" cellspacing="0" border="0" width="100%">
							<thead>
								<tr>
									<th>访问者</th>
									<th>创建时间</th>
									<th>最后访问时间</th>
									<th>登录状态</th>
									<th>操作&nbsp;(<a href="${ctx}/admin/sysInfoForceExitAll">强制注销所有</a>)</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${users}" var="item">
								<tr>
									<td>${item.user.ip}<c:if test="${item.user.login}">(${item.user.loginName})</c:if></td>
									<td><pku:date longValue="${item.creationTime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
									<td><pku:date longValue="${item.lastAccessedTime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
									<td><c:if test="${item.user.login}">已登录</c:if><c:if test="${!item.user.login}">未登录</c:if></td>
									<td><a href="${ctx}/admin/sysInfoForceExit?sessionId=${item.sessionId}">强制注销</a></td>
								</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
