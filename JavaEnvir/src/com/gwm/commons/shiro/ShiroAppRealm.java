package com.gwm.commons.shiro;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.web.filter.authz.AuthorizationFilter;

public class ShiroAppRealm extends AuthorizationFilter{

	@Override
	protected boolean isAccessAllowed(ServletRequest arg0,
			ServletResponse arg1, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}



}
