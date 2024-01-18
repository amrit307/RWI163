package com.maven.ProjectWithMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		CarsInfo bean = (CarsInfo) context.getBean("cons1");
		System.out.println(bean);
		
		

	}

}
