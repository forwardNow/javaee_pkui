package com.pkusoft.framework.security;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;

import com.pkusoft.framework.util.ServletUtils;

public class CaptchaFormAuthenticationFilter extends FormAuthenticationFilter {

	public static final String DEFAULT_CAPTCHA_PARAM = "captcha";
	public static final String DEFAULT_IP_PARAM = "ip";
	public static final String DEFAULT_MAC_PARAM = "mac";

	protected AuthenticationToken createToken(ServletRequest request,
			ServletResponse response) {

		String username = getUsername(request);

		String password = getPassword(request);

		String captcha = WebUtils.getCleanParam(request, DEFAULT_CAPTCHA_PARAM);
		String host = WebUtils.getCleanParam(request, DEFAULT_IP_PARAM);
        if (host == null) {
            host = ServletUtils.getRemoteAddr((HttpServletRequest) request);
        }
		String mac = WebUtils.getCleanParam(request, DEFAULT_MAC_PARAM);

		boolean rememberMe = isRememberMe(request);

		

        return new CaptchaUsernamePasswordToken(username, password.toCharArray(), rememberMe, host, captcha, mac);
	}

}
