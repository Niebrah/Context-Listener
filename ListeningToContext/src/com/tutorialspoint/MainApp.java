package com.tutorialspoint;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		//there is a bean called HelloWorld which is its id, its value is different
		
		
		context.start();
		
		HelloWorld obj = (HelloWorld) context.getBean("HelloWorld");
		obj.setMessage("YAYAY");
		obj.getMessage();
		
		
		context.stop();
	}

}
