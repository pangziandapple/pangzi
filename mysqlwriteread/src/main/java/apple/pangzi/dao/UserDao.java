package apple.pangzi.dao;

import org.apache.ibatis.annotations.Param;

import apple.pangzi.entity.User;

public interface UserDao {

	public User getUserById(@Param("id") int id);
}
