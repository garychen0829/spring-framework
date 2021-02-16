package com.ch.test;

public class UserInfo {
	private Long id;
	private String userName;
	private int age;

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("UserInfo{");
		sb.append("id=").append(id);
		sb.append(", userName='").append(userName).append('\'');
		sb.append(", age=").append(age);
		sb.append('}');
		return sb.toString();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
