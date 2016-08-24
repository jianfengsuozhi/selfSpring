package com.spring.dao;

import java.util.List;

public interface StudentDao {
	//jdbcTemplate.update
	void insert(Student student);
	void delete(int id);
	void update(Student student);
	
	//jdbcTemplate.queryForInt
	int count();
	//jdbcTemplate.queryForObject
	String selectNameById(int id);
	//jdbcTemplate.queryForObject rowMapper
	Student selectById(int id);
	//this.jdbcTemplate.query rowMapper
	List<Student> select();
}
