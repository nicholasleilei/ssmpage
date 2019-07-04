package com.crx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crx.mapper.StuMapper;
import com.crx.pojo.Stu;
import com.crx.pojo.StuExample;
import com.crx.pojo.StuExample.Criteria;

@Service
public class StuService {
 
	@Autowired
	private StuMapper sm;

	public List<Stu> findAll() {
		// TODO Auto-generated method stub
		return sm.selectByExample(new StuExample());
	}

	public void insert(Stu s) {
		// TODO Auto-generated method stub
		sm.insert(s);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		sm.deleteByPrimaryKey(id);
	}

	public Stu findById(int id) {
		// TODO Auto-generated method stub
		return sm.selectByPrimaryKey(id);
	}
   @Transactional(rollbackFor=Exception.class)
	public void update(Stu s) {
		// TODO Auto-generated method stub
		sm.updateByPrimaryKey(s);
		int i=9/0;
	}

	public List<Stu> findByName(String name) {
		// TODO Auto-generated method stub
		StuExample se = new StuExample();
		Criteria c = se.createCriteria();
		c.andNameLike("%"+name+"%");
		return sm.selectByExample(se);
	}
}
