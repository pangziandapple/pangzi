package apple.pangzi.dao;

import org.apache.ibatis.annotations.Param;

import apple.pangzi.db.aopdatasource.DataSource;
import apple.pangzi.db.aopdatasource.DynamicDataSourceGlobal;
import apple.pangzi.entity.User;

public interface UserDao {

	@DataSource(DynamicDataSourceGlobal.READ)
	public User getUserById(@Param("id") int id);
}
