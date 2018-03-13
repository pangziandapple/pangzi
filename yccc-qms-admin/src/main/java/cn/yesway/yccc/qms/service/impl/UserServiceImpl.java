package cn.yesway.yccc.qms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yesway.yccc.qms.dao.UserDao;
import cn.yesway.yccc.qms.entity.User;
import cn.yesway.yccc.qms.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	@Override
	public List<User> findUserInfo() {
		return userDao.findUserInfo();
	}
}
