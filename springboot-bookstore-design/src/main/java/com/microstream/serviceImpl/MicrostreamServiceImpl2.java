package com.microstream.serviceImpl;

import org.springframework.stereotype.Service;

import com.microstream.model.FullName;
import com.microstream.model.MicroStream;
import com.microstream.service.MicrostreamService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MicrostreamServiceImpl2 implements MicrostreamService {

	@Override
	public MicroStream getInfo() {
		log.info("Inside getInfo() Method");
		return new MicroStream("Spring Cloud", "Information Technology",
				FullName.builder().firstName("Samarth").lastName("Narula").build());
	}

	@Override
	public MicroStream getCustomInfo(String courseName, String courseType, String firstName, String lastName) {
		log.info("Inside getCustomInfo() Method");
		return new MicroStream(courseName, courseType, FullName.builder()
				.firstName(firstName).lastName(lastName).build());
	}
}
