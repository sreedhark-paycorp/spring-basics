/**
 * 
 */
package com.cs.spring_core_xml.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cs.spring_core_xml.impl.Hello;
import com.cs.spring_core_xml.impl.HelloWorld;
import com.cs.spring_core_xml.impl.StudentServiceImpl;
import com.cs.spring_core_xml.service.StudentService;

/**
 * 
 */
@Configuration
public class AppConfig {
	
	@Bean(name="helloBean")
    public HelloWorld helloWorld() {
        return new Hello();
    }
	
	@Bean(name="abc")
    public HelloWorld abcbean() {
        return new Hello();
    }
	
	//consider method name as bean name
	/*
	 * @Bean public HelloWorld testName() { return new Hello(); }
	 */
	@Bean
	public StudentService  getStservice( @Qualifier("abc") HelloWorld hell) {
		
		return new  StudentServiceImpl(hell);
	}
	

}
