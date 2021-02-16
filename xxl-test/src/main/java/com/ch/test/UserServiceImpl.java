package com.ch.test;

public class UserServiceImpl implements UserService {
	@Override
	public UserInfo getUserById(Long id) {
		UserInfo userInfo = new UserInfo();
		userInfo.setUserName("chenh");
		userInfo.setId(1L);
		userInfo.setAge(30);
		return userInfo;
	}
}
