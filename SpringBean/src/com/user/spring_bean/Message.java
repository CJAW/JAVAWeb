package com.user.spring_bean;

public class Message implements HelloMessage{

	@Override
	public String message() {
		
		return "helloSpringBean";
	}

}
