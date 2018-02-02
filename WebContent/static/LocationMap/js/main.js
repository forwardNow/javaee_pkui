requirejs.config( {
    paths: {
        "jquery": "../lib/jquery/2.2.4/jquery"
    },
    waitSeconds: 300
} );
/**
 * @fileOverview 入口
 * @author 吴钦飞（wuqinfei@qq.com）
 */
define( [ "./scene", "./config", "jquery" ], function ( Scene, Config ) {
    "use strict";

    /** @event click.character 角色被点击事件 */
    jQuery( document ).on( "pku.click.character", function ( event, personInfo ) {
        alert( "【" + personInfo.id + ", " + personInfo.name + "】被点击了！" );
    } );

    jQuery( document ).ready( function () {
        var
            scene,
            websocketUrl,
            sceneOptions,
            configOptions,
            $target
        ;

        $target = jQuery( "#container" );

        sceneOptions = $target.data( "sceneOptions" );
        sceneOptions.targetId = $target.get( 0 ).id;

        configOptions = $target.data( "configOptions" );

        websocketUrl = $target.data( "websocketUrl" );

        scene = new Scene( sceneOptions );

        scene.init( function () {

            Config.init( configOptions, function () {

                startWebSocket();

                // scene.setCharacter( { cmd: 1, id: "56780", x: 20, y: 20 } );

                // scene.setCharacter( { cmd: 1, id: "56780", x: 336274/10, y: -331342/10 } );
                // scene.setCharacter( { cmd: 1, id: "56782", x: 340274/10, y: -331342/10 } );
                // scene.setCharacter( { cmd: 1, id: "56786", x: 344274/10, y: -331342/10 } );
                // scene.setCharacter( { cmd: 1, id: "56781", x: 336274/10, y: -335342/10 } );
                // scene.setCharacter( { cmd: 1, id: "56783", x: 340274/10, y: -335342/10 } );
                // scene.setCharacter( { cmd: 1, id: "56787", x: 344274/10, y: -335342/10 } );

            } );


        } );


        function startWebSocket () {
            var
                webSocket = new WebSocket( websocketUrl )
            ;
            webSocket.onerror = function ( event ) {
                console.info( "Connection error!", event.data );
            };

            webSocket.onopen = function () {
                webSocket.send( "personNum=10" );
                console.info( "Connection established!" );
            };
            webSocket.onclose = function () {
                console.info( "Connection closed!" );
            };

            webSocket.onmessage = function ( event ) {
                onMessage( event.data );
            };

            function onMessage( data ) {
                if ( data ) {
                    scene.setCharacter( JSON.parse( data ) );
                    // console.info( data );
                }
            }

        }


        window.scene = scene;
    } );

} );