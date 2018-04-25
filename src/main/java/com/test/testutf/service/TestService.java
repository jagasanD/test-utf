package com.test.testutf.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.test.testutf.model.TestUtf;


public interface TestService {
	
	
	public  void saveTest(@RequestBody TestUtf service);
	List<TestUtf> getList();	
}
