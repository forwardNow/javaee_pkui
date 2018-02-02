/**
 * @fileOverview GUI 控制器
 */
define( [  ], function (  ) {

    function Controller ( params ) {
        this._init();
    }

    /**
     * @description 默认参数
     * @type {{}}
     */
    Controller.prototype.defaults = {
        containerGuiTemplate: ""
    };

    /**
     * @description 初始化
     * @private
     */
    Controller.prototype._init = function () {
        this._createGUI();
    };

    /**
     * @description 创建GUI
     * @private
     */
    Controller.prototype._createGUI = function () {

    };

    return Controller;
} );