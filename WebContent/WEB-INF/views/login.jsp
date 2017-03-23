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
    <link rel="stylesheet" href="css/style.css">
    <!--
        data-main：当前应用的入口js文件
        data-timestamp: 时间戳（dev为开发模式），比如 data-timestamp="v=2017-02-27"
     -->
    <script data-main="${ ctx }/static/js/main.js" data-timestamp="2017-03-22" src="${ ctx }/static/pkui/pkui.js"></script>
</head>
<style>
     body { background: #33a6e7; }
     .login-page { width: 360px; padding: 8% 0 0; margin: auto; }
     .form { position: relative; z-index: 1; background: #FFFFFF; max-width: 360px; margin: 0 auto 100px; padding: 45px; text-align: center; box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24); }
     .form input { outline: 0; background: #f2f2f2; width: 100%; border: 0; margin: 0 0 15px; padding: 15px; box-sizing: border-box; font-size: 14px; }
     .form button { outline: 0; background: #33a6e7; width: 100%; border: 0; padding: 15px; color: #FFFFFF; font-size: 14px; -webkit-transition: all 0.3s ease; transition: all 0.3s ease; cursor: pointer; }
     .form button:hover,
     .form button:active,.form button:focus { background: #43A047; }
</style>
<body>
<div class="login-page">
    <div class="form">
        <form class="login-form" action="${ ctx }/doLogin"
		    data-pkui-component="validator|form"
		    data-done-callback="doLoginDoneCallback"
		    data-fail-callback="doLoginFailCallback"
		    data-always-callback="doLoginAlwaysCallback" >
		    
            <input type="text" name="loginName" placeholder="登陆名"/>
            <input type="password" name="password" placeholder="密码"/>
            <button type="submit">登陆</button>
        </form>
    </div>
</div>	
<script>

    // 请求发送成功，对服务器端返回的数据进行处理
    function doLoginDoneCallback($form, jsonResult) {
        console.info( jsonResult );
        jsonResult = window.PKUI.handleJsonResult( jsonResult );
        console.info( jsonResult );
        // 服务器端处理成功
        if ( jsonResult.success ) {
            // 提示
            layer.alert( jsonResult.message, { icon: 1 }, function ( index ) {
            	location = "${ ctx }/static/desktop/index.html";
            } );
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
        // 无论
    }
</script>
</body>
</html>
