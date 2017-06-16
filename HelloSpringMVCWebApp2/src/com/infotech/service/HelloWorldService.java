package com.infotech.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

	public String welcomeMessage(){
		return "Welcome to Spring MVC World!!!";
	}

	public Object welcomeAgainMessage() {
		return "Welcome again to Spring MVC World!!!";
	}
}
