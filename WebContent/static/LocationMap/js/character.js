/**
 * @fileOverview 角色
 * @author 吴钦飞（wuqinfei@qq.com）
 */
define( [ "../lib/pixi/4.6.1/pixi", "./config", "jquery" ], function ( PIXI, Config ) {
    "use strict";
    var
        jQuery = window.jQuery
    ;
    /**
     * @description 构造函数
     * @constructor
     */
    function Character ( charactersContainer, options ) {
        this.charactersContainer = charactersContainer;
        this._declare( options );
    }

    /**
     * @description 默认参数
     * @type {{}}
     */
    Character.prototype.defaults = {

    };

    /**
     * @description 声明
     * @param options
     * @private
     */
    Character.prototype._declare = function ( options ) {

        /**
         * @description 传入的参数
         * @type {{}}
         */
        this.options = this.getOptions( options );

        /**
         * @description sprite
         * @type {PIXI.Container}
         */
        this.characterContainer = null;

        /**
         * @description 人员信息
         * @type {{id: string, name: string, type: string}}
         */
        this.personInfo = null;

        /**
         * @description 记录 options 里的x坐标
         * @type {number}
         */
        this.x = 0;

        /**
         * @description 记录 options 里的y坐标
         * @type {number}
         */
        this.y = 0;


        /**
         * @description 对应的名称
         * @type {string}
         */
        this.name = "";

        /**
         * @description CAD图上对应的坐标
         * @type {{x: number, y: number}}
         */
        this.position_CAD = {
            // x: 0,
            // y: 0
        };

        /**
         * @description 2D图上的位置
         * @type {{x: number, y: number}}
         */
        this.position_2D = {
            // x: 0,
            // y: 0
        };


    };

    /**
     * @description 创建
     */
    Character.prototype.create = function () {
        var
            pixiSprite,
            pixiText,
            personInfo = this.personInfo = Config.getPersonInfoById( this.getOptions().id ),
            color = Config.getColor( personInfo.type ),
            graphics = new PIXI.Graphics(),
            characterContainer = new PIXI.Container()
        ;

        this.name = personInfo.name;

        // 图片
        pixiSprite = new PIXI.Sprite(
            PIXI.loader.resources[ personInfo.type ].texture
        );

        // 文字
        pixiText = new PIXI.Text( personInfo.name, {
            // fontFamily: "Microsoft Yahei",
            fontSize: 14,
            fill : color.text
        } );
        pixiText.position.set( 0, pixiSprite.height );

        pixiSprite.position.set( ( pixiText.width - pixiSprite.width ) / 2, 0 );

        // 文字框
        graphics.lineStyle( 1, color.border, 1 );
        graphics.beginFill( color.background, 1 );
        graphics.drawRect( pixiText.position.x - 1 , pixiText.position.y - 1, pixiText.width + 2, pixiText.height + 2 );

        characterContainer.addChild( pixiSprite );
        characterContainer.addChild( graphics );
        characterContainer.addChild( pixiText );

        characterContainer._pku_pixiSprite = pixiSprite;
        characterContainer._pku_graphics = graphics;
        characterContainer._pku_pixiText = pixiText;

        // Opt-in to interactivity
        characterContainer.interactive = true;
        // Shows hand cursor
        characterContainer.buttonMode = true;

        characterContainer.on( "pointerdown", function () {
            // alert( "【" + personInfo.id + ", " + personInfo.name + "】被点击了！" );
            jQuery( document ).trigger( "pku.click.character", personInfo );
        });

        this.charactersContainer.addChild( characterContainer );

        this.characterContainer = characterContainer;
    };

    Character.prototype.update = function () {
        var
            position_CAD = this.position_CAD
        ;

        // 位置改变了，才计算并更新
        if ( this.x !== position_CAD.x || this.y !== position_CAD.y ) {

            position_CAD.x = this.x;
            position_CAD.y = this.y;

            this.updatePixiPosition();
        }
    };

    /**
     * @description 更新，仅记录，而不改属性
     *
     * @param options { { id: String, x: Number, y: Number} }
     */
    Character.prototype.updateCADPosition = function ( options ) {

        this.x = options.x;
        this.y = options.y;

        // 便于垃圾回收
        options = null;
    };

    /**
     * @description 更新PIXI上的位置
     */
    Character.prototype.updatePixiPosition = function () {

        // 计算 2D 坐标
        this.position_2D = Config.convertPosition( this.position_CAD );

        // 设置位置
        this.characterContainer.position.set( this.position_2D.x - this.characterContainer.width / 2, this.position_2D.y  - this.characterContainer.height / 2 );

    };

    /**
     * @description 更新角色的name
     */
    Character.prototype.updateCharacterName = function () {
        var
            characterContainer,
            color,
            pixiSprite,
            graphics,
            pixiText,
            personInfo
        ;

        // 如果 name 不是 数字字符串，则不更新。
        if ( ! jQuery.isNumeric( this.name ) ) {
            return;
        }

        personInfo = Config.getPersonInfoById( this.getOptions().id );

        if ( jQuery.isNumeric( personInfo.name ) ) {
            return;
        }

        this.name = personInfo.name;
        color = Config.getColor( personInfo.type );

        characterContainer = this.characterContainer;
        pixiSprite = characterContainer._pku_pixiSprite;
        graphics = characterContainer._pku_graphics;
        pixiText = characterContainer._pku_pixiText;

        // 重设置 name
        pixiText.text = this.name;

        // 擦除图形（文字框），并重绘制
        graphics.clear();
        graphics.lineStyle( 1, color.border, 1 );
        graphics.beginFill( color.background, 1 );
        graphics.drawRect( pixiText.position.x - 1 , pixiText.position.y - 1, pixiText.width + 2, pixiText.height + 2 );

        // 重新设置图像的位置，使其居中
        pixiSprite.position.set( ( pixiText.width - pixiSprite.width ) / 2, 0 );

    };



    /**
     * @description 销毁
     */
    Character.prototype.destroy = function () {
        this.charactersContainer.removeChild( this.characterContainer );
    };

    /**
     * @description 隐藏
     */
    Character.prototype.hide = function () {
        this.characterContainer.visible = false;
    };

    /**
     * @description 显示
     */
    Character.prototype.show = function () {
        this.characterContainer.visible = true;
    };

    /**
     * @description 获取参数
     * @param options
     * @return {{}}
     */
    Character.prototype.getOptions = function ( options ) {
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

    return Character;
} );