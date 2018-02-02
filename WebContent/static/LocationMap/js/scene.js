/**
 * @fileOverview 舞台/场景
 */
define(

    [
        "../lib/pixi/4.6.1/pixi",
        "./config",
        "./character"
    ],

function ( PIXI, Config, Character ) {
    "use strict";

    /**
     * @description 构造函数
     * @constructor
     * @param options { {targetId: String}? }
     */
    function Scene ( options ) {
        this.getOptions( options );
        this._declare();
    }

    /**
     * @description 默认参数
     */
    Scene.prototype.defaults = {
        /** 资源 */
        resources: [
            // 地面
            { name: "ground", url: "images/scene/ground.png" },
            // 一般人 - 男
            { name: "ordinary_man", url: "images/character/ordinary_man.png" },
            // 一般人 - 女
            { name: "ordinary_woman", url: "images/character/ordinary_woman.png" },
            // 民警 - 男
            { name: "police_man", url: "images/character/police_man.png" },
            // 民警 - 女
            { name: "police_woman", url: "images/character/police_woman.png" },
            // 嫌疑人 - 男
            { name: "suspect_man", url: "images/character/suspect_man.png" },
            // 嫌疑人 - 女
            { name: "suspect_woman", url: "images/character/suspect_woman.png" }
        ]
    };

    /**
     * @description 缓存
     */
    Scene.prototype.CharacterCache = {
        /**
         * @description 保存 Character
         * @type { {id: Character} }
         */
        cache: {
        },

        /**
         * @description 将 character 添加到缓存
         * @param id {String}
         * @param character {Character}
         * @return {Character}
         */
        set: function ( id, character ) {
            this.cache[ id ] = character;
            return this.cache[ id ];
        },
        /**
         * @description 根据指定ID获取 character
         * @param id {String}
         * @return {Character}
         */
        get: function ( id ) {
            return this.cache[ id ];
        },
        /**
         * @description 从缓存中删除指定ID的character
         * @param id {String}
         */
        remove: function ( id ) {
            delete this.cache[ id ];
        }
    };

    /**
     * @description 声明
     * @private
     */
    Scene.prototype._declare = function () {

        /**
         * @description 容器
         * @type {HTMLElement | null}
         * @private
         */
        this._container = document.getElementById( this.getOptions().targetId );


        /**
         * @description 根容器
         * @type {PIXI.Container}
         * @private
         */
        this._stage = null;

        /**
         * @description 地面
         * @type {PIXI.Sprite}
         * @private
         */
        // this._groundSprite = null;

        /**
         * @description 角色容器
         * @type {PIXI.Container}
         * @private
         */
        this._charactersContainer = null;

        /**
         * @description 渲染器
         * @type {PIXI.autoDetectRenderer}
         * @private
         */
        this._renderer = null;

        /**
         * @description 加载器
         * @type {PIXI.loader}
         * @private
         */
        this._loader = PIXI.loader;

        /**
         * @description 进度条容器
         * @type {PIXI.Container}
         * @private
         */
        this._progress = null;

        /**
         * @description 进度条
         * @type {PIXI.Graphics}
         * @private
         */
        this._progressbar = null;

        /**
         * @description 进度条信息
         * @type {PIXI.Text}
         * @private
         */
        this._progressMsg = null;

    };

    /**
     * @description 初始化
     * @public
     */
    Scene.prototype.init = function ( initializedCallback ) {

        this.initializedCallback = initializedCallback;

        // 创建进度条
        this._createProgressbar();

        // 载入资源
        this._loadResources();

        // 创建场景（ _createProgressbar() 执行完毕后创建 ）
        // this._createScene();
        // _createScene()执行完毕后执行initializedCallback

        // 动画
        this._animate();

    };

    /**
     * @description 设置定位标签
     * @param data {{ id: String, x: Number, y: Number, cmd: Number}}
     */
    Scene.prototype.setCharacter = function ( data ) {

        switch ( data.cmd ) {
            // 离开
            case 0:
            case 4: {
                this.destroyCharacter( data );
                break;
            }
            // 创建（第一次出现）
            case 1: {
                this.createCharacter( data );
                break;
            }
            // 更新（移动）
            case 2: {
                this.updateCharacter( data );
                break;
            }
        }
    };

    /**
     * @description 创建 定位标签
     * @param options {{ id: String, x: Number, y: Number}}
     */
    Scene.prototype.createCharacter = function ( options ) {
        var
            _this = this,
            character
        ;

        if ( this.CharacterCache.get( options.id ) ) {
            this.updateCharacter( options );
            return;
        }
        character = new Character( this._charactersContainer, options );

        character.create();

        character.updateCADPosition( options );

        this.CharacterCache.set( options.id, character );

        Config.getPersonInfoList( function () {
            _this.renameCharacter();
        } );
    };

    /**
     * @description 更新 定位标签
     * @param options {{ id: String, x: Number, y: Number}}
     */
    Scene.prototype.updateCharacter = function ( options ) {
        var
            character = this.CharacterCache.get( options.id )
        ;
        if ( ! character ) {
            this.createCharacter( options );
            return;
        }

        character.updateCADPosition( options );
    };

    /**
     * @description 销毁
     * @param options {{ id: String, x: Number, y: Number }}
     */
    Scene.prototype.destroyCharacter = function ( options ) {
        var
            character = this.CharacterCache.get( options.id ),
            _this = this
        ;
        if ( ! character ) {
            console.warn( "【" + options.id + "】不存在！" );
            return;
        }

        character.destroy();

        this.CharacterCache.remove( options.id );

        Config.getPersonInfoList( function () {
            _this.renameCharacter();
        } );
    };

    /**
     * @description 重命名所有 name的值为id 的角色
     */
    Scene.prototype.renameCharacter = function () {
        var
            cache = this.CharacterCache.cache,
            id,
            character
        ;
        // 遍历缓存，渲染所有角色
        for ( id in cache ) {
            if ( cache.hasOwnProperty( id ) ) {
                character = cache[ id ];
                character.updateCharacterName();
            }
        }
    };

    /**
     * @description 获取参数
     * @param options {{}?}
     * @public
     */
    Scene.prototype.getOptions = function ( options ) {
        var
            propName
        ;
        if ( options ) {
            this.options = this.options || {};
            for ( propName in this.defaults ) {
                if ( ! this.defaults.hasOwnProperty( propName ) ) {
                    continue;
                }
                this.options[ propName ] = this.defaults[ propName ];
            }

            for ( propName in options ) {
                if ( ! options.hasOwnProperty( propName ) ) {
                    continue;
                }
                this.options[ propName ] = options[ propName ];
            }
        }
        return this.options;
    };

    /**
     * @description 获取根容器
     * @return {PIXI.Container}
     */
    Scene.prototype.getStage = function () {
        if ( ! this._stage ) {
            this._stage = new PIXI.Container();
        }
        return this._stage;
    };

    /**
     * @description 获取渲染器
     * @return {PIXI.autoDetectRenderer}
     */
    Scene.prototype.getRenderer = function () {
        if ( ! this._renderer ) {
            this._renderer = new PIXI.autoDetectRenderer( this._container.offsetWidth, this._container.offsetHeight );
            this._container.appendChild( this._renderer.view );
        }
        return this._renderer;
    };

    /**
     * @description 刷新
     * @public
     */
    Scene.prototype.update = function () {
        var
            cache = this.CharacterCache.cache,
            id,
            character
        ;
        // 遍历缓存，渲染所有角色
        for ( id in cache ) {
            if ( cache.hasOwnProperty( id ) ) {
                character = cache[ id ];
                character.update();
            }
        }
        this.getRenderer().render( this.getStage() );
    };

    /**
     * @description 载入资源
     * @private
     */
    Scene.prototype._loadResources = function () {
        var
            _this = this,
            count = 0
        ;

        this._loader
            .add( this.getOptions().resources )
            .on("progress", function loadProgressHandler(loader, resource) {
                +function( progress, name ){
                    setTimeout( function () {
                        _this._setProgress( progress / 100, "加载：" + name );
                    }, count++ * 60 );
                }( loader.progress, resource.name );
            })
            .load();
    };

    /**
     * @description 创建资源加载进度条
     * @private
     */
    Scene.prototype._createProgressbar = function () {
        var
            progressContainer,
            progress,
            progressbar,
            renderer,
            stage
        ;

        if ( ! this._progressbar ) {
            renderer = this.getRenderer();
            stage = this.getStage();

            // 背景色
            renderer.backgroundColor = 0x7698d5;

            progressContainer = new PIXI.Container();
            progressContainer.position.set(300, 300);
            stage.addChild( progressContainer );

            progress = new PIXI.Graphics();
            progress.beginFill(0xfffdff);
            progress.drawRect(0, 0, 204, 20);
            progress.endFill();
            progressContainer.addChild(progress);

            progressbar = new PIXI.Graphics();
            // progressbar.beginFill( 0xaccd94 );
            // progressbar.drawRect(2, 2, 0, 16);
            // progressbar.endFill();
            progressContainer.addChild(progressbar);

            this._progress = progressContainer;

            this._progressbar = progressbar;

            this._progressMsg = new PIXI.Text( "加载...", {
                fontFamily: "Microsoft Yahei",
                fontSize: "16px",
                fill: "#ffffff"
            } );
            this._progressMsg.position.set( 0, 24 );
            progressContainer.addChild( this._progressMsg );
        }

        return this._progressbar;
    };

    /**
     * @description 设置进度条长度
     * @param percentage {Number}
     * @param msg {String}
     * @private
     */
    Scene.prototype._setProgress = function ( percentage, msg ) {
        var
            width,
            progressbar,
            _this = this
        ;
        if ( percentage > 0.98 ) {
            percentage = 1;
            msg = "加载完毕！";
            setTimeout( function () {
                _this._progress.visible = false;
                _this._createScene();
            }, 100 );
        }
        progressbar = this._progressbar;
        width = 200 * percentage;

        progressbar.beginFill( 0xaccd94 );
        progressbar.drawRect(2, 2, width, 16);
        progressbar.endFill();

        this._progressMsg.text = msg || "加载...";
    };


    /**
     * @description 创建场景
     * @private
     */
    Scene.prototype._createScene = function () {
        var
            stage = this.getStage(),
            resources = PIXI.loader.resources,
            ground,
            charactersContainer
        ;
        ground = new PIXI.Sprite( resources[ "ground_dark" ].texture );

        stage.addChild( ground );

        charactersContainer = new PIXI.Container();
        stage.addChild( charactersContainer );

        this._charactersContainer = charactersContainer;

        this.initializedCallback && this.initializedCallback();
    };

    /**
     * @description 动画，每秒刷新60次
     * @private
     */
    Scene.prototype._animate = function () {
        var
            _this = this
        ;

        loop();

        function loop() {

            requestAnimationFrame( loop );

            // setTimeout( loop, 160 );

            _this.update();
        }

    };


    return Scene;
} );