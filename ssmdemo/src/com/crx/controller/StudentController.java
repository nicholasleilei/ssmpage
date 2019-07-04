package com.crx.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crx.mapper.StuMapper;
import com.crx.pojo.Stu;
import com.crx.pojo.StuExample;
import com.crx.pojo.StuExample.Criteria;

@Controller
@RequestMapping("student")
public class StudentController {
   
	@Autowired
	private StuMapper sm;
	
	@RequestMapping("findAll")
	public String findAll(Map<String,Object> map) {
		List<Stu> stus =sm.selectByExample(new StuExample());
		map.put("stus", stus);
		return "../main.jsp";
	}
	
	@RequestMapping("insert")
	public String insert(Stu s) {
		sm.insert(s);
		return "../student/findAll.action";
	}
	@RequestMapping("delete")
	public String delete(int id) {
		sm.deleteByPrimaryKey(id);
		return "../student/findAll.action";
	}
	@RequestMapping("yupdate")
	public String yupdate(int id,Map<String,Object> map) {
		Stu s = sm.selectByPrimaryKey(id);
		map.put("stu", s);
		return "../update.jsp";
	}
	@RequestMapping("update")
	public String update(Stu s) {
		sm.updateByPrimaryKey(s);
		return "../student/findAll.action";
	}
	@RequestMapping("findByName")
	public String findByName(String name,Map<String,Object> map) {
		StuExample se = new StuExample();
		Criteria c = se.createCriteria();
		c.andNameLike("%"+name+"%");
		
		List<Stu> stus =sm.selectByExample(se);
		map.put("stus", stus);
		return "../main.jsp";
	}
}
