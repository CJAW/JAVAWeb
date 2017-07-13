package com.user.spring;

import java.nio.file.FileSystem;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * 
 * 
 * 测试spring
 * 1，创建接口
 * 2.实现接口
 * 3.创建调用类person
 * 4.创建主类 
 * 4.配置文件（）
 * @author user
 *
 */
public class SpringMain {

	public static void main(String[] args){
		Resource resource = (Resource) new FileSystemResource("helloMessage.xml"); //读取配置文件
		BeanFactory b = new XmlBeanFactory((org.springframework.core.io.Resource) resource);  //加载配置文件
		Person person = (Person) b.getBean("person");  //读取配置文件中的person
		String saying = person.say();
		System.out.println(saying);
	}
}
