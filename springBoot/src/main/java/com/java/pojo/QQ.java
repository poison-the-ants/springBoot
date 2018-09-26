package com.java.pojo;

public class QQ {
	private String nick;
	private String pwd;
	private String phone;
	private String email;
	private Integer age;
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "QQ [nick=" + nick + ", pwd=" + pwd + ", phone=" + phone + ", email=" + email + ", age=" + age + "]";
	}
	
}
