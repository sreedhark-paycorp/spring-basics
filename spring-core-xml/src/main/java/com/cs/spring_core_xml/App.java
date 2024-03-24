package com.cs.spring_core_xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cs.spring_core_xml.config.AppConfig;
import com.cs.spring_core_xml.impl.HelloWorld;
import com.cs.spring_core_xml.service.StudentService;

/**
 * Hello world!
 *
 */



 
public class App {
	
	@Autowired
	private StudentService stuservice;
	
	public static void main(String[] args) {
	    
		//ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	    HelloWorld obj = (HelloWorld) context.getBean("helloBean");
	    
	    StudentService obj1 = (StudentService) context.getBean("getStservice");

	    obj.print("Spring3 Java Config");
	    
	  
	    
	  
	   

	}
	
	public void call() {
		
		String name=stuservice.stName();
		System.out.println("name");
	}
}
