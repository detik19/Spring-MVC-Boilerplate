package com.embeddednesia.web.model;

import javax.servlet.http.HttpServletRequest;

import org.hdiv.logs.IUserData;

public class User implements IUserData {

	@Override
	public String getUsername(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return "test";
	}

	@Override
	public String getLocalIp(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return "127.0.0.1";
	}

	@Override
	public String getRemoteIp(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
