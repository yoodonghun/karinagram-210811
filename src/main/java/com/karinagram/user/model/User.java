package com.karinagram.user.model;

import javax.xml.crypto.Data;

public class User {
   private int id;
   private String loginId;
   private String password;
   private String name;
   private String email;
   private Data createdAt;
   private Data updatedAt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Data getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Data createdAt) {
		this.createdAt = createdAt;
	}

	public Data getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Data updatedAt) {
		this.updatedAt = updatedAt;
	}

}
