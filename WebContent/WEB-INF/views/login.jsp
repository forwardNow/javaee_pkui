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
    <script data-main="${ ctx }/static/js/main.js" data-timestamp="2017-10-26" src="${ ctx }/static/pkui/pkui.js"></script>
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

<!-- 
<div class="index-choices clearfix" style="display: none;">
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
 -->
 
<div class="pages">
	<div class="pages-info">
		<div class="container">
			<h1>项目选择（首页选择）</h1>
			<p>基于PKUI的项目的使用示例</p>
		</div>
	</div>
	<div class="container pages-list">
		<div class="row">
			<div class="col-xs-5">
				<div class="pages-item hovereffect">
			        <img class="img-responsive" src="${ ctx }/static/laweye/images/index_desktop.png" alt="">
			        <div class="overlay">
			            <h2>基础版（desktop）</h2>
			            <a class="info" href="${ ctx }/static/desktop/index.html">进入</a>
			        </div>
			    </div>
			</div>
			<div class="col-xs-5">
				<div class="pages-item hovereffect">
			        <img class="img-responsive" src="${ ctx }/static/laweye/images/index_new.jpg" alt="">
			        <div class="overlay">
			            <h2>执法监督（laweye）</h2>
			            <a class="info" href="${ ctx }/static/laweye/index.html">进入</a>
			        </div>
			    </div>
			</div>
		</div>
	</div>
</div> 
<style>
.pages {
	display: none;
	z-index: 10;
	position: absolute;
	top: 0;
	left: 0;
	width: 100%;
	height: 100%;
	background-color: #fff;
}
	
.pages-info {
    margin-bottom: 30px;
    text-align: center;
    padding: 20px;
    color: #4e6167;
    background: #F4F7FC;
}
.pages-info h1 {
	font-size: 32px;
    font-weight: bold;
    color: #333;
}
.pages-info p {
	margin-top: 6px;
	font-size: 16px;
	color: #888;
}
.pages-list {
	max-width: 900px;
}
.pages-item:hover {
    -webkit-box-shadow: 0 0 20px rgba(0,0,0,0.3);
    box-shadow: 0 0 20px rgba(0,0,0,0.3);
}
.pages-item img {
	width: 100%;
}

</style>
 
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
            		jQuery( ".pages" ).show( 300 );
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
<style>
.hovereffect {
  width: 100%;
  height: 100%;
  float: left;
  overflow: hidden;
  position: relative;
  text-align: center;
  cursor: default;
}

.hovereffect .overlay {
  width: 100%;
  height: 100%;
  position: absolute;
  overflow: hidden;
  top: 0;
  left: 0;
  opacity: 0;
  filter: alpha(opacity=0);
  background-color: rgba(0,0,0,0.5);
  -webkit-transition: all 0.4s cubic-bezier(0.88,-0.99, 0, 1.81);
  transition: all 0.4s cubic-bezier(0.88,-0.99, 0, 1.81);
}

.hovereffect img {
  display: block;
  position: relative;
  -webkit-transition: all 0.4s cubic-bezier(0.88,-0.99, 0, 1.81);
  transition: all 0.4s cubic-bezier(0.88,-0.99, 0, 1.81);
}

.hovereffect h2 {
  width: 100%;		
  color: #fff;
  text-align: center;
  position: relative;
  font-size: 17px;
  background: rgba(0,0,0,0.6);
  -webkit-transform: translatey(-100px);
  -ms-transform: translatey(-100px);
  transform: translatey(-100px);
  -webkit-transition: all 0.4s cubic-bezier(0.88,-0.99, 0, 1.81);
  transition: all 0.4s cubic-bezier(0.88,-0.99, 0, 1.81);
  padding: 10px;
}

.hovereffect a.info {
  text-decoration: none;
  display: inline-block;
  text-transform: uppercase;
  color: #fff;
  border: 1px solid #fff;
  background-color: transparent;
  opacity: 0;
  filter: alpha(opacity=0);
  -webkit-transition: all 0.4s ease;
  transition: all 0.4s ease;
  margin: 50px 0 0;
  padding: 7px 14px;
}

.hovereffect a.info:hover {
  box-shadow: 0 0 5px #fff;
}

.hovereffect:hover img {
  -ms-transform: scale(1.2);
  -webkit-transform: scale(1.2);
  transform: scale(1.2);
}

.hovereffect:hover .overlay {
  opacity: 1;
  filter: alpha(opacity=100);
}

.hovereffect:hover h2,.hovereffect:hover a.info {
  opacity: 1;
  filter: alpha(opacity=100);
  -ms-transform: translatey(0);
  -webkit-transform: translatey(0);
  transform: translatey(0);
}

.hovereffect:hover a.info {
  -webkit-transition-delay: .2s;
  transition-delay: .2s;
}
</style>
</body>
</html>
