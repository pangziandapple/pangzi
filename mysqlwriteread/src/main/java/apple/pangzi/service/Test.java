package apple.pangzi.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import apple.pangzi.dao.UserDao;
import apple.pangzi.entity.User;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "application.xml" });
		UserDao userDao = context.getBean(UserDao.class);
		User user = userDao.getUserById(1);
		if(user != null){
			System.out.println(user.getAddress());
		}
	}
}
