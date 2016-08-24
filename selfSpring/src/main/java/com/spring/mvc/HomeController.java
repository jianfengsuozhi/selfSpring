package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

//控制器
@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String showHomePage(ModelMap model){//model 模型：要返回浏览器显示的数据
		model.put("home", "主页");
		return "home";//视图名称
	}
}
