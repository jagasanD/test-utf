package com.test.testutf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.testutf.model.TestUtf;
import com.test.testutf.service.TestService;

@RestController
@RequestMapping("/api")
public class TestController {
	
	@Autowired	
	TestService testService;
	@PostMapping("/save")
	public  void save(@RequestBody TestUtf service) {
		testService.saveTest(service);
	}
	
	@GetMapping("/list")
	public List<TestUtf> getList(){
		return testService.getList();
	}

}
