<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!doctype html>
<html lang="zh-cn">
<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>系统登陆</title>
    <link rel="shortcut icon" href="images/favicon.ico" />
    <link rel="stylesheet" href="${ ctx }/static/desktop/css/style.css">
    <!--
        data-main：当前应用的入口js文件
        data-timestamp: 时间戳（dev为开发模式），比如 data-timestamp="v=2017-02-27"
     -->
    <script data-main="${ ctx }/static/js/main.js" data-timestamp="2017-07-26" src="${ ctx }/static/pkui/pkui.js"></script>
</head>
<style>
     body { background: #33a6e7; }
     .login-page { width: 360px; padding: 8% 0 0; margin: auto; }
     .form { position: relative; z-index: 1; background: #FFFFFF; max-width: 360px; margin: 0 auto 100px; padding: 45px; text-align: center; box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24); }
     .form input { outline: 0; background: #f2f2f2; width: 100%; border: 0; margin: 0 0 15px; padding: 15px; box-sizing: border-box; font-size: 14px; }
     .form button { outline: 0; background: #33a6e7; width: 100%; border: 0; padding: 15px; color: #FFFFFF; font-size: 14px; -webkit-transition: all 0.3s ease; transition: all 0.3s ease; cursor: pointer; }
     .form button:hover,
     .form button:active,
     .form button:focus,
     .form button[disabled] { background: #43A047; }
     
     html,body {
		height: 100%;
	}
	.index-choices {
		z-index: 10;
		position: absolute;
		top: 0;
		left: 0;
		width: 100%;
		height: 100%;
		background-color: #000;
	}
	.hook {display:inline-block;width:0;height:100%;overflow:hidden;margin-left:-1px;font-size:0;line-height:0;vertical-align:middle;}
	.index-page {
		position: relative;
		float: left;
		height: 100%;
		text-align: center;
		border: solid 2px transparent;
		box-sizing: border-box;
		transition: all 0.3s;
	}
	.index-page img {
		width: 80%;
		vertical-align:middle;border:0 none;
		opacity: 0.6;
		transition: all 0.3s;
	}
	.index-page-old {
		width: 40%;
	}
	.index-page-new {
		width: 60%;
	}
	.index-page:hover {
		border-color: #fff;
	}
	.index-page:hover img {
		margin-top: -20px;
		opacity: 1;
	}
	.index-page:hover .index-page-text {
		background-color: #fff;
		color: #000;
	}
	.index-page-text {
		position: absolute;
		top: 0;
		left: 0;
		width: 100%;
		height: 60px;
		line-height: 60px;
		color: #333;
		font-size: 24px;
		text-align: center;
		background-color: rgba(255,255,255,0.3);
		transition: all 0.3s;
	}
     
</style>
<body>
<div class="login-page">
    <div class="form" id="loginForm">
        <form class="login-form" action="${ ctx }/doLogin" method="post"
		    data-pkui-component="validator|form"
		    data-done-callback="doLoginDoneCallback"
		    data-fail-callback="doLoginFailCallback"
		    data-always-callback="doLoginAlwaysCallback" >
		    
            <input type="text" name="loginName"  value="admin"/>
            <input type="text" name="password" value="a"/>
            <button type="submit" id="submitBtn">登陆</button>
        </form>
    </div>
</div>	

<div class="index-choices clearfix" style="display: none;">
	<!-- <div class="alert alert-warning text-center">请选择主页</div> -->
	<a class="index-page index-page-new" href="${ ctx }/static/laweye/index.html">
		<span class="hook"></span>
		<img src="${ ctx }/static/laweye/images/index_new.jpg" alt="" />
		<span class="index-page-text">新版</span>
	</a>
	<a class="index-page index-page-old" href="${ ctx }/static/desktop/index.html">
		<span class="hook"></span>
		<img src="${ ctx }/static/laweye/images/index_old.jpg" alt="" />
		<span class="index-page-text">旧版</span>
	</a>
</div>
<script>

    // 请求发送成功，对服务器端返回的数据进行处理
    function doLoginDoneCallback($form, jsonResult) {
        jsonResult = window.PKUI.handleJsonResult( jsonResult );
        // 服务器端处理成功
        if ( jsonResult.success ) {
            // 提示
            layer.msg( "登陆成功，请选择首页。", { 
            	icon: 1,
            	time: 1000,
            	end: function () {
            		// location = "${ ctx }/static/desktop/index.html";
            		jQuery( ".index-choices" ).show( 300 );
            	}
           	});
        }
        // 服务器端处理失败
        else {
            // 提示
            layer.alert( jsonResult.message, { icon: 2 } );
        }
    }

    // 请求发送失败
    function doLoginFailCallback($form) {
        // 提示网络错误
        layer.alert( '网络错误！', { icon: 0 } );
    }

    // 无论请求发送成功与否
    function doLoginAlwaysCallback($form) {

    }
</script>
</body>
</html>
