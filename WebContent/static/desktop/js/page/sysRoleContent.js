/**
 * @fileOverview 角色管理-树
 *
 *  SysRoleTree 与 SysRoleContent 的通过自定义事件进行通信。
 *
 * @author 吴钦飞（wuqf@pkusoft.net）
 */
define( function ( require ) {
    "use strict";
    var
        $ = require( "jquery" ),
        layer = window.layer,
        Template = require( "template" ),
        namespace = "pkui.sysrole.content"
    ;

    // 页签
    require( "bootstrap-tab" );

    /*
     *  @event show
     *      页签显示
     */

    /**
     * 默认参数
     */
    SysRoleContent.prototype.defaults = {

        containerSelector: "#sysrole-container",

        sysroleContentSelector: "#sysroleContent",

        sysRoleTablistSelector: "#sysRoleTablist"
    };


    /**
     * 工厂方法
     * @returns {SysRoleContent}
     */
    SysRoleContent.init = function ( options ) {
        return new SysRoleContent( options );
    };

    /**
     * 构造函数
     * @param options {*?} 参数
     * @constructor
     */
    function SysRoleContent( options ) {
        this._init( options );
    }

    /**
     * 初始化
     * @param options {*?} 参数
     * @private
     */
    SysRoleContent.prototype._init = function ( options ) {
        this.opts = $.extend( true, {}, this.defaults, options );
        this._render();
        this._bind();
    };

    /**
     * 渲染
     * @private
     */
    SysRoleContent.prototype._render = function () {
        var
            opts = this.opts
        ;
        this.$container = $( opts.containerSelector );
        this.$sysroleContent = $( opts.sysroleContentSelector );
        this.$tablist = $( opts.sysRoleTablistSelector );
    };

    /**
     * 事件绑定
     * @private
     */
    SysRoleContent.prototype._bind = function () {
        var
            _this = this
        ;

        // 页签
        this.$tablist.on( "click." + namespace, "a", function ( event ) {
            var
                $this = $( this ),
                $parent = $this.parent(),
                tabpanelSelector = $this.attr( "href" )
            ;
            event.preventDefault();

            // 页签 active状态
            $parent.addClass( "active" )
                .siblings().removeClass( "active" );

            // 面板 active状态
            $( tabpanelSelector ).addClass( "active" )
                .siblings().removeClass( "active" );

            /**
             * @event show
             */
            _this.$container.trigger( "show." + namespace, tabpanelSelector );

        } );

        // 点击 radio（“用户是否已关联”），切换按钮
        this.$sysroleContent.on( "click." + namespace, "input[name=roleIdOper]", function () {
            var
                $this = $( this ),
                $addBtn = $( "#sysRoleUser-addBtn" ),
                $removeBtn = $( "#sysRoleUser-removeBtn" )
            ;

            // 如果点击的是已经选中的radio，则返回
            if ( $this.is( ".checked" ) ) {
                return;
            }

            $( ".roleIdOper" ).removeClass( "checked" );
            $this.addClass( "checked" );

            // 查询关联用户（显示“删除”）
            if ( $( this ).val() === "in" ) {
                $addBtn.addClass( "hidden" );
                $removeBtn.removeClass( "hidden" );
            }
            // 查询未关联用户（显示“添加”）
            else {
                $removeBtn.addClass( "hidden" );
                $addBtn.removeClass( "hidden" );
            }

            // 查询
            $( "#sysRoleUserDatagrid-reloadBtn" ).trigger( "click" );
        } );

    };

    return SysRoleContent;
} );