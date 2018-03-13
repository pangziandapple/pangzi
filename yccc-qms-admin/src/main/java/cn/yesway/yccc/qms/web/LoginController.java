package cn.yesway.yccc.qms.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.yesway.yccc.qms.entity.User;
import cn.yesway.yccc.qms.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "Hello World!";
	}
	
	@RequestMapping("/test")
	public String index(){
		List<User> list = userService.findUserInfo();
		return "index";
	}
	
}
