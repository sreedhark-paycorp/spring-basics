/**
 * 
 */
package com.cs.spring_core_xml.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.cs.spring_core_xml.service.StudentService;

/**
 * 
 */
public class StudentServiceImpl implements StudentService {

	
	
	@Autowired
	@Qualifier("abc")
	HelloWorld hellowWordl;
	
	

	public StudentServiceImpl(HelloWorld hellowWordl) {
		super();
		this.hellowWordl = hellowWordl;
	}

	@Override
	public String stName() {
		// TODO Auto-generated method stub

		return hellowWordl.retName();
		// return null;
	}

	@Override
	public String stAddress() {
		// TODO Auto-generated method stub
		return null;
	}

}
