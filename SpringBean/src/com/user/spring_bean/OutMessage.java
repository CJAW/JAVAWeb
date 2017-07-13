package com.user.spring_bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.cglib.proxy.Factory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试springbean从配置文件中调用类的方法
 * @author user
 *
 */
public class OutMessage {

	
	public static void helloMessage(){
	 
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("config.xml"); //加载配置文件
		Message message = (Message) beanFactory.getBean("messages",Message.class); //通过配置文件中的id读取类
		
		System.out.println(message.message());
	}
	
	public static void main(String[] args){
		
		helloMessage();
	}
}
