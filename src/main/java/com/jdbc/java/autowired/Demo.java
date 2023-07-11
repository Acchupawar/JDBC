package com.jdbc.java.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDeo deo = context.getBean(StudentDeo.class);
		
		StudentEntity entity = context.getBean(StudentEntity.class);
		
		int i = deo.insertDeo(entity);
		
		System.out.println(i +" row efected");
		
	}

}
