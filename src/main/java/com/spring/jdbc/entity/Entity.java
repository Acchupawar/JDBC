package com.spring.jdbc.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Entity {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/entity/EntityConfig.xml");

		StudentDeoInterce deo = context.getBean("deo", StudentDeo.class);

		/*
		 * save data in database
		 */
/*		StudentEntity entity = new StudentEntity();

		entity.setId(111);
		entity.setName("avinash");
		entity.setCity("yelanka");
		
		int i = deo.insertDeo(entity);
		
		System.out.println(i +" row efected");
*/
		/*
		 * update data in database
		 */
/*		StudentEntity entity1 = new StudentEntity();

		entity1.setId(101);
		entity1.setName("goutam");
		entity1.setCity("electronic city");
		
		int i = deo.updateDeo(entity1);

		System.out.println(i + " row efected");
*/
		
		/*
		 * delete operation from data base
		 */
//		
//		int i = deo.deletDeo(0);
//		System.out.println(i + "rows efected");
//		
		int j = deo.getDeo(110);
		
		System.out.println(j + "rows efected");
		
	}

}
