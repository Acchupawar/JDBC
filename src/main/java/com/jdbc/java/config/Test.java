package com.jdbc.java.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDeo bean = context.getBean("deo", StudentDeo.class);

		StudentEntity entity = new StudentEntity();
		entity.setId(205);
		entity.setName("Anil kumar");
		entity.setCity("bhadrapure");

		int i = bean.insertDeo(entity);

		System.out.println(i + " row efected");

	}

}
