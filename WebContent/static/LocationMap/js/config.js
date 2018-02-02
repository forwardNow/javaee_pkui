/**
 * @fileOverview 配置
 * @author 吴钦飞（wuqinfei@qq.com）
 */
define( [ "jquery" ], function () {
    "use strict";
    var
        Config,
        $ = jQuery
    ;

    Config = {

        /** 调试模式，控制台输出一些调试信息 */
        debug: true,

        /** 人员信息列表 - URL */
        personInfoListUrl: "",
        /** 人员信息列表 - 集合 */
        _personInfoDic: {
            // "56789": { "id": "56789", "name": "吴钦飞", "type": "ordinary_man" },
        },
        /** 人员信息列表 - 处理服务器响应，将其处理成上述格式 */
        handlePersonInfoResponse: null, // 见底部代码

        typeColor: {
            police_man: { text: 0xffffff, background: 0x45a9db, border: 0x1d98d7 },
            police_woman: { text: 0xffffff, background: 0x45a9db, border: 0x1d98d7 },
            suspect_man: { text: 0xffffff, background: 0xea9439, border: 0xe97e0f },
            suspect_woman: { text: 0xffffff, background: 0xea9439, border: 0xe97e0f },
            ordinary_man: { text: 0xffffff, background: 0x999491, border: 0x827d7b },
            ordinary_woman: { text: 0xffffff, background: 0x999491, border: 0x827d7b }
        },

        /** 颜色列表 */
        _colorList: [
            "#7eb8f2",
            "#98689a",
            "#0099cb",
            "#ff6764",
            "#ff9a66",
            "#cd9967",
            "#666666",
            "#99ce66",
            "#cc3431",
            "#013565",
            "#993331",
            "#653567",
            "#0067cc",
            "#cc032f",
            "#346633",
            "#993331",
            "#013300",
            "#323499",
            "#003499",
            "#029b63",
            "#fe9b00"
        ]
    };

    /**
     * @description 初始化
     * @param options {Object}
     * @param callback {Function}
     * @public
     */
    Config.init = function ( options, callback ) {

        $.extend( this, options );


        this.getPersonInfoList( callback );

        return this;
    };


    /**
     * @description 获取人员信息列表
     * @param callback {Function?}
     * @param isSync {Boolean?} 是否同步
     * @public
     */
    Config.getPersonInfoList = function ( callback, isSync ) {
        var
            _this = this
        ;
        $.ajax( {
            async: !isSync,
            url: this.personInfoListUrl,
            method: "GET",
            cache: false,
            dataType: "json"
        } ).done( function ( responseData ) {
            var
                data
            ;
            if ( responseData && responseData.success === true ) {
                data = responseData.data;
                if ( $.isFunction( Config.handlePersonInfoResponse ) ) {
                    data = Config.handlePersonInfoResponse( data );
                }
                _this._personInfoDic = data;
                callback && callback();
            }
            else {
                throw "获取人员信息列表 失败！";
            }
        } ).fail( function () {
            console.error( "获取人员信息列表 失败！" );
        } );
    };


    /**
     * @description 根据id获取人员名称
     * @param id {String}
     * @return {String}
     * @public
     */
    Config.getNameById = function ( id ) {
        var
            name = this.getPersonInfoById( id ).name
        ;

        if ( name === undefined ) {
            Config.log( "未获取到【" + id + "】对应的名称.." );
            name = id;
        }

        return name;
    };


    /**
     * @description 根据id获取人员信息
     * @param id {String}
     * @return { {id:String, name: String, type: String} }
     * @public
     */
    Config.getPersonInfoById = function ( id ) {
        return this._personInfoDic[ id ] || {
            id: id,
            name: id,
            type: "ordinary_man"
        };
    };

    /**
     * @description 获取颜色
     * @param type { string? }
     * @return {{ text: number, background: number, border: number }}
     * @public
     */
    Config.getColor = function ( type ) {
        type = type || "ordinary_man";
        return this.typeColor[ type ];
    };


    /**
     * @description 对CAD坐标进行转换
     *      x = ( x_cad - 31743.286666666667 ) / 5.055851851851852
     *      y = -( y_cad - ( -30955.181818181816 ) ) / 5.033884297520661
     * @param pos { {x: number, y: number} }
     */
    Config.convertPosition = function ( pos ) {
        var
            cad_x = pos.x,
            cad_y = pos.y
        ;

        return {
            x: ( cad_x - 31743.286666666667 ) / 5.055851851851852,
            y: -( cad_y - ( -30955.181818181816 ) ) / 5.033884297520661
        };
    };

    /**
     * @description 将服务器返回的数据转换成需要的数据
     * @example
     *      将 “data/personInfoListData.json” 转换成 “data/personInfoListData_fmt.json”
     * @param personInfoDic
     */
    Config.handlePersonInfoResponse = function ( personInfoDic ) {
        var
            i,
            len,
            tagId,
            personInfo,
            personInfoDicTemp,
            fmtPersonInfo,
            type,
            objtype,
            peopleSex,
            fmtPersonInfoDic = {}
        ;

        // 如果是数组，则将其进行转换
        if ( $.isArray( personInfoDic ) ) {
            personInfoDicTemp = {};
            for ( i = 0, len = personInfoDic.length; i < len; i++ ) {
                personInfo = personInfoDic[ i ];
                tagId = personInfo.tagId;
                personInfoDicTemp[ tagId ] = personInfo;
            }
            personInfoDic = personInfoDicTemp;
        }

        for ( tagId in personInfoDic ) {
            if ( ! personInfoDic.hasOwnProperty( tagId ) ) {
                continue;
            }
            personInfo = personInfoDic[ tagId ];

            objtype = personInfo.objtype;
            peopleSex = personInfo.peopleSex;

            // 1010：办案民警，1020：办案协警
            // 2010：嫌疑人
            // 2020：律师，2030：监护人，9000：其他人员
            if ( objtype.indexOf( "1010" ) !== -1 ) {
                type = "police_";
            }
            else if ( objtype.indexOf( "1020" ) !== -1 ) {
                type = "police_";
            }
            else if ( objtype.indexOf( "2010" ) !== -1 ) {
                type = "suspect_";
            }
            else if ( objtype.indexOf( "2020" ) !== -1 ) {
                type = "ordinary_";
            }
            else if ( objtype.indexOf( "2030" ) !== -1 ) {
                type = "ordinary_";
            }
            else if ( objtype.indexOf( "9000" ) !== -1 ) {
                type = "ordinary_";
            }
            else {
                type = "ordinary_";
            }

            if ( peopleSex === "2" || peopleSex === 2 ) {
                type += "woman";
            } else {
                type += "man";
            }

            fmtPersonInfo = {
                id: tagId,
                name: personInfo.peopleName || tagId,
                type: type
            };

            fmtPersonInfoDic[ tagId ] = fmtPersonInfo;
        }

        return fmtPersonInfoDic;
    };


    /**
     * @description 日志
     * @param content
     * @public
     */
    Config.log = function ( content ) {
        var
            date = new Date(),
            hours = date.getHours(),
            minutes = date.getMinutes(),
            seconds = date.getSeconds(),
            milliseconds = date.getMilliseconds(),
            time
        ;

        milliseconds = ( "   " + milliseconds ).slice( -3 );

        time = hours + "时" + minutes + "分" + seconds + "秒 " + milliseconds + "毫秒: ";

        console.info( time, content );
    };

    return Config;
} );