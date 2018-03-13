package cn.yesway.yccc.qms.dao;

import java.util.List;

import cn.yesway.yccc.qms.entity.User;

public interface BaseDao<T> {

	public List<User> findUserInfo();
	
	public int total();
	
}
