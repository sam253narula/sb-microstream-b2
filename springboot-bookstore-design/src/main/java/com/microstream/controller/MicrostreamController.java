package com.microstream.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microstream.model.MicroStream;
import com.microstream.service.MicrostreamService;
import com.microstream.serviceImpl.MicrostreamServiceImpl;

@RestController
public class MicrostreamController {

	@Autowired
	MicrostreamService microstreamServiceImpl2;

	@GetMapping("/info")
	public MicroStream getInfo() {
		return microstreamServiceImpl2.getInfo();
	}

	@PostMapping("/customInfo")
	public MicroStream getCustomInfo(String courseName, String courseType, String firstName, String lastName) {
		return microstreamServiceImpl2.getCustomInfo(courseName, courseType, firstName, lastName);
	}

//	@GetMapping("/info")
//	//@ResponseBody
//	public String hello() {
//		return "Hello World";
//	}

}
