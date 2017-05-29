package com.embeddednesia.springmvc.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.servlet.http.HttpServletRequest;

import org.hdiv.logs.IUserData;


@Entity
@Table(name="User")
public class User implements IUserData {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column
	private String name;
	@Column
	private String userName;
	@Column
	private String password;
	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
