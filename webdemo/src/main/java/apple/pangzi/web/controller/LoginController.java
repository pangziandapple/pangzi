package apple.pangzi.web.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

@Controller
public class LoginController {

	private static Logger logger = LogManager.getLogger(LoginController.class);

	@RequestMapping(value = "/login")
	@ResponseBody
	public JSONObject login() {
		JSONObject resJo = new JSONObject();
		resJo.put("name", "hello word");
		logger.info("test");
		return resJo;
	}

	@RequestMapping(value = "test")
	public String test() {
		return "test";
	}
}
