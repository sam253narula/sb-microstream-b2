package com.microstream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.microstream.entity.Bookstore;
import com.microstream.model.FullName;
import com.microstream.model.MicroStream;
import com.microstream.service.MicrostreamService;
import com.microstream.serviceImpl.BookstoreCRUDServiceImpl;
import com.microstream.serviceImpl.MicrostreamServiceImpl;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringbootBookstoreDesignApplication implements CommandLineRunner {

	@Autowired
	BookstoreCRUDServiceImpl bookstoreCRUDServiceImpl;
	
	@Autowired
	MicrostreamService microstreamServiceImpl;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBookstoreDesignApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("MicroStream Object -> {}", microstreamServiceImpl.getInfo());
	}

}
