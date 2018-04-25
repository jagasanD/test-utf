package com.test.testutf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.testutf.model.TestUtf;
import com.test.testutf.repository.UtfTestRepositiory;
@Service
public class TestServiceImpl implements TestService{


	@Autowired
	UtfTestRepositiory repositiory;
	
	@Override
	public void saveTest(TestUtf service) {
		// TODO Auto-generated method stub
		repositiory.save(service);
		
	}

	@Override
	public List<TestUtf> getList() {
		return repositiory.findAll();
	}
	
	

}
