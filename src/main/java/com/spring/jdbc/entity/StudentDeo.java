package com.spring.jdbc.entity;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDeo implements StudentDeoInterce {

	private JdbcTemplate template;
 
	// save data
	public int insertDeo(StudentEntity entity) {

		String query = "insert into studen(id,name,city) value(?,?,?)";

		int insert = this.template.update(query, entity.getId(), entity.getName(), entity.getCity());

		return insert;
	}

	// update data
	public int updateDeo(StudentEntity entity) {

		String query = "update studen set name=?, city=? where id=?";

		int update = this.template.update(query, entity.getName(), entity.getCity(), entity.getId());

		return update;
	}

	// delete data
	public int deletDeo(int id) {

		String query = "delete from studen where id=?";

		return this.template.update(query, id);
	}


	// feach data from data base by id
	public int getDeo(int id) {

		String query = " select * from studen where id=?";
		
	//	int i = this.template.query(query);
		
		return 0;
	}

	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	
}
