package com.pkusoft.admin.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pkusoft.admin.model.SysDicItem;
import com.pkusoft.admin.model.SysDicList;
import com.pkusoft.admin.service.SysDicItemService;
import com.pkusoft.admin.service.SysDicListService;
import com.pkusoft.common.cache.DicCache;
import com.pkusoft.common.constants.AdminFunctionId;
import com.pkusoft.common.constants.AdminUrlRecource;
import com.pkusoft.common.util.ExcelUtil;
import com.pkusoft.common.util.LogUtils;
import com.pkusoft.framework.controller.BaseController;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.GridResult;
import com.pkusoft.framework.model.JsonResult;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.util.WebUtils;

/**
 * 字典控制器
 * 
 * @author wangl
 */
@Controller
public class SysDicListController extends BaseController {
	/** 日志句柄 */
	private static Logger logger = LoggerFactory.getLogger( SysDicListController.class );

	/** 服务类 */
	@Autowired
	private SysDicListService sysDicListService;
	/** 服务类 */
	@Autowired
	private SysDicItemService sysDicItemService;

	/**
	 * 列表页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping( AdminUrlRecource.SYS_DIC_LIST_LIST )
	public ModelAndView sysDicListList( ModelAndView model ) {
		model.setViewName( AdminUrlRecource.SYS_DIC_LIST_LIST );
		return model;
	}

	/**
	 * 列表数据
	 * 
	 * @param sysDicList
	 * @param pager
	 * @return
	 */
	@RequestMapping( value = AdminUrlRecource.SYS_DIC_LIST_LIST_DATA )
	@ResponseBody
	public GridResult sysDicListListData( SysDicList sysDicList, Pager pager ) {
		try {
			List<SysDicList> list = sysDicListService.getSysDicListList( sysDicList, pager );

			return new GridResult( true, list, pager.getTotalRecords() );
		} catch ( Exception e ) {
			logger.error( "查询列表数据出错", e );
			return new GridResult( false, null );
		}
	}
	/**
	 * 列表数据
	 * 
	 * @param sysDicList
	 * @param pager
	 * @return
	 */
	@RequestMapping( "/admin/sysDicListListDataExt" )
	@ResponseBody
	public GridResult sysDicListListDataExt( String txtQuery ) {
		try {
			Criteria<?> criteria = WebUtils.toCriteria( txtQuery );
			List<SysDicList> list = sysDicListService.getSysDicListList( criteria );
			int count = criteria.getPager() == null ? list.size() : criteria.getPager().getTotalRecords();
			return new GridResult( true, list, count );
		} catch ( Exception e ) {
			logger.error( "查询单位列表数据出错", e );
			return new GridResult( false, null );
		}
	}

	/**
	 * 表单页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping( AdminUrlRecource.SYS_DIC_LIST_FORM )
	public ModelAndView sysDicListForm( java.lang.String dicName, ModelAndView model ) {
		try {
			if ( dicName != null ) {
				SysDicList sysDicList = sysDicListService.get( dicName );
				model.addObject( "sysDicList", sysDicList );
			}

			model.setViewName( AdminUrlRecource.SYS_DIC_LIST_FORM );
			return model;
		} catch ( Exception e ) {
			logger.error( "访问表单页面出错", e );
			throw new RuntimeException( this.getMessage( e ) );
		}
	}

	/**
	 * model
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping( "/admin/sysDicListModel" )
	@ResponseBody
	public JsonResult sysDicListModel( java.lang.String dicName ) {
		JsonResult jsonResult = new JsonResult( true );
		try {
			Assert.hasText( dicName );
			SysDicList sysDicList = sysDicListService.get( dicName );
			jsonResult.setData( sysDicList );
		} catch ( Exception e ) {
			jsonResult.setSuccess( false );
			jsonResult.setMessage( "获取模型失败" );
		}
		return jsonResult;
	}

	/**
	 * 更新字典页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping( AdminUrlRecource.SYS_DIC_LIST_UPDATE_FORM )
	public ModelAndView sysDicListUpdateForm( java.lang.String dicName, ModelAndView model ) {
		try {
			if ( dicName != null ) {
				SysDicList sysDicList = sysDicListService.get( dicName );
				model.addObject( "sysDicList", sysDicList );
			}

			model.setViewName( AdminUrlRecource.SYS_DIC_LIST_UPDATE_FORM );
			return model;
		} catch ( Exception e ) {
			logger.error( "访问表单页面出错", e );
			throw new RuntimeException( this.getMessage( e ) );
		}
	}

	/**
	 * 更新信息
	 * 
	 * @param sysDicList
	 * @return
	 */
	@RequestMapping( AdminUrlRecource.SYS_DIC_LIST_SAVE )
	@ResponseBody
	public JsonResult sysDicListSave( SysDicList sysDicList ) {
		try {
			sysDicListService.updateSysDicList( sysDicList );

			// 载入缓存
			DicCache.refresh( sysDicList.getDicName() );
			LogUtils.log( AdminFunctionId.SYS_DIC_LIST_UPDATE, sysDicList.getDicName() + "修改成功" );
			return new JsonResult( true );
		} catch ( Exception e ) {
			logger.error( "保存信息出错", e );
			return new JsonResult( false, this.getMessage( e ) );
		}
	}

	/**
	 * 新增
	 * 
	 * @param sysDicList
	 * @return
	 */
	@RequestMapping( AdminUrlRecource.SYS_DIC_LIST_ADD )
	@ResponseBody
	public JsonResult sysDicListAdd( SysDicList sysDicList ) {
		try {
			sysDicListService.insertSysDicList( sysDicList );

			// 载入缓存
			DicCache.set( sysDicList.getDicName(), null );
			LogUtils.log( AdminFunctionId.SYS_DIC_LIST_ADD, sysDicList.getDicName() + "新增成功" );
			return new JsonResult( true );
		} catch ( Exception e ) {
			logger.error( "保存信息出错", e );
			return new JsonResult( false, this.getMessage( e ) );
		}
	}

	/**
	 * 删除信息
	 * 
	 * @param dicName
	 * @return
	 */
	@RequestMapping( AdminUrlRecource.SYS_DIC_LIST_DELETE )
	@ResponseBody
	public JsonResult sysDicListDelete( java.lang.String[] dicName ) {
		try {
			sysDicListService.deleteSysDicList( dicName );
			if ( dicName.length > 0 ) {
				for ( int i = 0; i < dicName.length; i++ ) {
					DicCache.remove( dicName[ i ] );
					LogUtils.log( AdminFunctionId.SYS_DIC_LIST_DELETE, dicName[ i ] + "删除成功" );
				}
			}
			return new JsonResult( true );
		} catch ( Exception e ) {
			logger.error( "删除信息出错", e );
			return new JsonResult( false, this.getMessage( e ) );
		}
	}

	/**
	 * 生成字典文件
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping( AdminUrlRecource.SYS_DIC_CREATE_XML_FORM )
	@ResponseBody
	public JsonResult sysDicCreateXmlForm( SysDicList sysDicList ) {
		try {
			// 单个生成字典文件
			if ( sysDicList.getDicName() != null && !"".equals( sysDicList.getDicName() ) ) {
				sysDicListService.createDicFile( sysDicList.getDicName() );
				LogUtils.log( AdminFunctionId.SYS_DIC_LIST_XML_FILE, sysDicList.getDicName() + "生成字典文件成功" );
			} else {
				// 生成全部字典文件
				sysDicListService.createAllDicFile();
				LogUtils.log( AdminFunctionId.SYS_DIC_LIST_XML_FILE, "生成字典文件成功" );
			}

			return new JsonResult( true );
		} catch ( Exception e ) {
			logger.error( "生成字典失败", e );
			throw new RuntimeException( this.getMessage( e ) );
		}
	}
	/**
	 * 生成字典文件
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping( "/admin/sysDicCreateXml" )
	@ResponseBody
	public JsonResult sysDicCreateXml( String[] dicName ) {
		try {
			// 生成指定字典文件
			if ( dicName != null && dicName.length > 0 ) {
				sysDicListService.createDicFile( dicName );
				LogUtils.log( AdminFunctionId.SYS_DIC_LIST_XML_FILE, dicName + "生成指定字典文件" );
			} else {
				// 生成全部字典文件
				sysDicListService.createAllDicFile();
				LogUtils.log( AdminFunctionId.SYS_DIC_LIST_XML_FILE, "生成字典文件成功" );
			}

			return new JsonResult( true );
		} catch ( Exception e ) {
			logger.error( "生成字典失败", e );
			throw new RuntimeException( this.getMessage( e ) );
		}
	}

	/**
	 * 检查字典名称
	 * 
	 * @param SysDicList
	 * @return
	 */
	@RequestMapping( AdminUrlRecource.CHECK_SYS_DIC_LIST_FORM )
	@ResponseBody
	public JsonResult checkSysDicListForm( java.lang.String dicName ) {
		try {
			return new JsonResult( sysDicListService.checkSysDicListForm( dicName ) );
		} catch ( Exception e ) {
			logger.error( "检查字典名称失败", e );
			throw new RuntimeException( this.getMessage( e ) );
		}
	}

	/**
	 * 字典名称唯一性检测
	 * 
	 * @param SysDicList
	 * @return
	 */
	@RequestMapping( "/admin/checkDicNameUnique" )
	@ResponseBody
	public JsonResult checkDicNameUnique( String dicName, String oldDicName ) {
		try {
			boolean isUnique = true;
			// 新增
			if ( oldDicName == null ) {
				isUnique = !sysDicListService.checkSysDicListForm( dicName );
			}
			// 修改
			else {
				if ( oldDicName.equals( dicName ) ) {
					isUnique = true;
				} else {
					isUnique = !sysDicListService.checkSysDicListForm( dicName );
				}
			}

			return new JsonResult( isUnique, "字典名称唯一" );
		} catch ( Exception e ) {
			logger.error( "检查字典名称失败", e );
			throw new RuntimeException( this.getMessage( e ) );
		}
	}

	/**
	 * 文件下载
	 * 
	 * @Description:
	 * @param fileName
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping( "/admin/sysDeptDownload" )
	public void downloadFile( String dicName, HttpServletResponse response ) {
		try {
			Assert.hasText( dicName );
			//response.setCharacterEncoding("utf-8");  
			response.setContentType( "application/force-download" );// 设置强制下载不打开
			response.addHeader( "Content-Disposition", "attachment;fileName=" + dicName + ".xls" );// 设置文件名

			ServletOutputStream outputStream = response.getOutputStream();

			List<SysDicItem> sysDicItemList = sysDicItemService.getListByProperty( "dicName", dicName );
			String[] header = { "条目编号(itemCode)", "条目名称(itemValue)", "是否有效(visiable)" };
			String[] propertyName = { "itemCode", "itemValue", "visiable" };
			ExcelUtil.fillData( sysDicItemList, outputStream, header, propertyName );

		} catch ( Exception e ) {
			throw new RuntimeException( e );
		}
	}
}