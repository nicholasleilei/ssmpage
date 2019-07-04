package com.crx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    
	@RequestMapping("login")
	public String login(String username) {
		if("admin".equals(username))
			//return "redirect:../student/findAll";//如果配置了视图解析器
		return "../student/findAll.action"; //如果没有配置视图解析器
		return "../login.jsp";
	}
}
