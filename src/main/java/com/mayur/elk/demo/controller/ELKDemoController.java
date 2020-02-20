package com.mayur.elk.demo.controller;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ELKDemoController {
	
	
	Logger LOG = LoggerFactory.getLogger(ELKDemoController.class);

	@Autowired
	RestTemplate restTemplete;

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	
	@RequestMapping(value = "/elk")
	public String hello() {
		String response = "Welcome to ELK DEMO Application" + new Date();
		LOG.info(response);

		return response;
	}
	
	@RequestMapping(value = "/exception")
	public String exception() {
		String response = "";
		try {
			throw new Exception("Exception has occured....");
		} catch (Exception e) {
			LOG.error("Error Message is:"+e);
			LOG.error("Exception Stactrace is- " + e.getStackTrace());
			response = e.getStackTrace().toString();
		}

		return response;
	}

}
