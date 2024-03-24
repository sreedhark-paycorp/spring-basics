package com.cs.spring_core_xml.impl;

import java.util.UUID;

public class Hello implements HelloWorld{

	@Override
	public void print(String msg) {
		System.out.println("Hello "+msg);
		
	}

	@Override
	public String retName() {
		// TODO Auto-generated method stub
		
		return UUID.randomUUID().toString();
}

	
}
