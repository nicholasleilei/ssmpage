package com.crx.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crx.pojo.Stu;
import com.crx.pojo.StuExample;
import com.crx.pojo.StuExample.Criteria;
import com.crx.service.StuService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("student")
public class StudentController {
	@Autowired
	private StuService ss;
	
	@RequestMapping("findAll")
	public String findAll(Map<String,Object> map,@RequestParam(defaultValue="1")int page) {
    System.out.print("888888888");
		int size=3;
		PageHelper.startPage(page, size);
		List<Stu> stus =ss.findAll();
		PageInfo<Stu> pageinfo = new PageInfo<>(stus, size);
		map.put("stus", stus);
		map.put("page",pageinfo);
		System.out.println();
		return "../main.jsp";
	}
	
	@RequestMapping("insert")
	public String insert(Stu s) {
		ss.insert(s);
		return "../student/findAll.action";
	}
	@RequestMapping("delete")
	public String delete(int id) {
		ss.delete(id);
		return "../student/findAll.action";
	}
	@RequestMapping("yupdate")
	public String yupdate(int id,Map<String,Object> map) {
		Stu s = ss.findById(id);
		map.put("stu", s);
		return "../update.jsp";
	}
	@RequestMapping("update")
	public String update(Stu s) {
		ss.update(s);
		return "../student/findAll.action";
	}
	@RequestMapping("findByName")
	public String findByName(String name,Map<String,Object> map) {
		List<Stu> stus =ss.findByName(name);
		map.put("stus", stus);
		return "../main.jsp";
	}
}
