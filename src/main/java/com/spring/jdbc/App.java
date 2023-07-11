package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/Congif.xml");

		JdbcTemplate temp = context.getBean("jdbc", JdbcTemplate.class);

		// insert query
		String query = "insert into studen(id,name,city) value(?,?,?)";
		// query fire
		System.out.println(temp.update(query, 109, "Ravikumar", "Bhadrapur") + " row efected");

	}
}
