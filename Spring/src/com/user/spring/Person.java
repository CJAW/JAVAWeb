package com.user.spring;

public class Person {

	private IMessage iMessage;

	public IMessage getiMessage() {
		return iMessage;
	}

	public void setiMessage(IMessage iMessage) {
		this.iMessage = iMessage;
	}
	
	public String say(){
		
		return this.iMessage.Message();
	}
}
