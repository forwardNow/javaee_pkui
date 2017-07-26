package com.pkusoft.admin.controller;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.ExpiredCredentialsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pkusoft.admin.model.SysUser;
import com.pkusoft.common.constants.FunctionId;
import com.pkusoft.common.util.LogUtils;
import com.pkusoft.framework.User;
import com.pkusoft.framework.model.JsonResult;
import com.pkusoft.framework.security.CaptchaUsernamePasswordToken;
import com.pkusoft.framework.util.ServletUtils;
import com.pkusoft.framework.util.ValidateCode;

/**
 * 登陆初始化控制器
 * 
 * 
 */
@Controller
public class LoginController {
	/**
	 * 登录页面
	 * 
	 * @return
	 */
	@RequestMapping( "/login" )
	public String login() {
		return "login";
	}

	/**
	 * 退出登录页面
	 * 
	 * @return
	 */
	@RequestMapping( "/logout" )
	public String logout() {
		if ( User.getCurrent() != null && User.getUserId() != null ) {
			LogUtils.log( FunctionId.LOG_LOGOUT, "注销登录" );
		}
		SecurityUtils.getSubject().logout();
		return "redirect:login";
	}
	@RequestMapping( value = "/doLogin" )
	@ResponseBody
	public JsonResult doLogin( SysUser sysUser, ServletRequest request ) {
		JsonResult jsonResult = new JsonResult( false );
		String msg = "";
		AuthenticationToken token;
		
		String username = sysUser.getLoginName();
		String password = sysUser.getPassword();
		String captcha = WebUtils.getCleanParam(request, "captcha");
		String host = WebUtils.getCleanParam(request, "ip");
        if (host == null) {
            host = ServletUtils.getRemoteAddr((HttpServletRequest) request);
        }
		String mac = WebUtils.getCleanParam(request, "mac");
		boolean rememberMe = false;

		token = new CaptchaUsernamePasswordToken(username, password.toCharArray(), rememberMe, host, captcha, mac);
		
		Subject subject = SecurityUtils.getSubject();
		try {
			subject.login( token );
			if ( subject.isAuthenticated() ) {
				jsonResult.setSuccess( true );
				jsonResult.setMessage( "登陆成功！" );
			} else {
				jsonResult.setMessage( "未知的错误！" );
			}
		} catch ( IncorrectCredentialsException e ) {
			msg = "登录密码错误. Password for account " + token.getPrincipal() + " was incorrect.";
			jsonResult.setMessage( msg );
			System.out.println( msg );
		} catch ( ExcessiveAttemptsException e ) {
			msg = "登录失败次数过多";
			jsonResult.setMessage( msg );
			System.out.println( msg );
		} catch ( LockedAccountException e ) {
			msg = "帐号已被锁定. The account for username " + token.getPrincipal() + " was locked.";
			jsonResult.setMessage( msg );
			System.out.println( msg );
		} catch ( DisabledAccountException e ) {
			msg = "帐号已被禁用. The account for username " + token.getPrincipal() + " was disabled.";
			jsonResult.setMessage( msg );
			System.out.println( msg );
		} catch ( ExpiredCredentialsException e ) {
			msg = "帐号已过期. the account for username " + token.getPrincipal() + "  was expired.";
			jsonResult.setMessage( msg );
			System.out.println( msg );
		} catch ( UnknownAccountException e ) {
			msg = "帐号不存在. There is no user with username of " + token.getPrincipal();
			jsonResult.setMessage( msg );
			System.out.println( msg );
		} catch ( UnauthorizedException e ) {
			msg = "您没有得到相应的授权！" + e.getMessage();
			jsonResult.setMessage( msg );
			System.out.println( msg );
		}
		return jsonResult;
	}

	/**
	 * 验证码
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping( value = "/captcha" )
	@ResponseBody
	public void captcha( HttpServletRequest request, HttpServletResponse response ) {
		try {
			String textCode = ValidateCode.generateTextCode( ValidateCode.TYPE_NUM_ONLY, 4, null );
			BufferedImage image = ValidateCode.generateImageCode( textCode, 80, 30, 5, true, new Color( 187, 255, 255 ), null, null );

			HttpSession session = request.getSession( true );
			session.setAttribute( "captcha", textCode );

			response.setContentType( "image/jpeg" );
			OutputStream outputStream = response.getOutputStream();
			ImageIO.write( image, "jpeg", outputStream );
			outputStream.close();
		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}

	
	/**
	 * 退出登录页面
	 * 
	 * @return
	 */
	@RequestMapping( "/doLogout" )
	@ResponseBody
	public JsonResult doLogout() {
		try {
			this.logout();
		} catch ( Exception e ) {
			return new JsonResult( false );
		}
		return new JsonResult( true );
	}
}
