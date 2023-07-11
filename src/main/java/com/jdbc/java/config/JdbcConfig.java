package com.jdbc.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JdbcConfig {

	@Bean("dataSource")
	public DriverManagerDataSource getDataSource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		dataSource.setUsername("root");
		dataSource.setPassword("Anand@123");

		return dataSource;
	}

	@Bean("template")
	public JdbcTemplate getJdbc() {

		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(getDataSource());
		return template;
	}

	@Bean({ "deo" })
	public StudentDeo getDeo() {

		StudentDeo deo = new StudentDeo();
		deo.setTemplate(getJdbc());

		return deo;

	}
}
