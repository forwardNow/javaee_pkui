<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>

    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta charset="UTF-8">

    <link rel="stylesheet" href="css/style.css">
    <title>青山分局</title>

    <script data-main="js/main" src="lib/requirejs/2.1.22/require.js"></script>
    <style>
        #container {
            position: relative;
            margin: 10px;
            box-shadow: 0 0 10px rgba(0,0,0,.5);
        }
    </style>

</head>
<body>

    <div id="container"
         style="width: 760px; height: 1050px; transform: scale(0.9);"
         data-websocket-url="ws://${header['host']}${pageContext.request.contextPath}/noauth/websocket/getPosition"
         data-config-options='{
            "personInfoListUrl": "./data/personInfoListData.json"
         }'
         data-scene-options='{
            "resources": [
                { "name": "ground_light", "url": "images/scene/ground_760x1050_light.png" },
                { "name": "ground_dark", "url": "images/scene/ground_760x1050_dark.png" },
                { "name": "ordinary_man", "url": "images/character/v4/ordinary_man.png" },
                { "name": "ordinary_woman", "url": "images/character/v4/ordinary_woman.png" },
                { "name": "police_man", "url": "images/character/v4/police_man.png" },
                { "name": "police_woman", "url": "images/character/v4/police_woman.png" },
                { "name": "suspect_man", "url": "images/character/v4/suspect_man.png" },
                { "name": "suspect_woman", "url": "images/character/v4/suspect_woman.png" }
            ]
         }'>
        <div class="cg-panel">
            <div class="cg-panel-heading"></div>
            <div class="cg-panel-body"></div>
        </div>
    </div>

</body>
</html>