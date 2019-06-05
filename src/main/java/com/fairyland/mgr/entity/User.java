package com.fairyland.mgr.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data // @Data注解可以动态为实体类生成getter和setter等方法
@Entity
@Table(name = "user")
public class User implements Serializable{

	private static final long serialVersionUID = 4858945745866446549L;
    @Id
    @GeneratedValue
    @Column(name = "id")
	private int id;
    @Column(name = "user_name")
	private String userName;
    @Column(name = "pass_word")
	private String passWord;
    @Column(name = "signature")
	private String signature;

	public User() {
		
	}

	public User(int id, String userName, String passWord, String signature) {
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.signature = signature;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", signature=" + signature + "]";
	}

}
