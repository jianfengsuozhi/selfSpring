package com.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class Dao01 implements StudentDao{
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insert(Student student) {
		//mysql 有自增操作
		String sql = "insert into student(name,age) values(?,?)";
		jdbcTemplate.update(sql, student.getName(),student.getAge());
		System.out.println("插入");
	}
	
	@Override
	public void update(Student student) {
		String sql = "update student set name=?,age=? where id=?";
		this.jdbcTemplate.update(sql, student.getName(),student.getAge(),student.getId());
	}
	
	public void delete(int id){
		String sql = "delete from student where id = ?";
		this.jdbcTemplate.update(sql, id);
	}

	@Override
	public int count() {
		String sql = "select count(*) from student";
		return this.jdbcTemplate.queryForInt(sql);
	}

	@Override
	public String selectNameById(int id) {
		String sql = "select name from student where id = ?";
		return this.jdbcTemplate.queryForObject(sql, String.class, id);
	}
	@Override
	public Student selectById(int id) {
		String sql = "select * from student where id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[]{id}, new StudentRowMapper());
	}

	@Override
	public List<Student> select() {
		String sql ="select * from student";
		return this.jdbcTemplate.query(sql, new StudentRowMapper());
	}

	private  class StudentRowMapper implements RowMapper{
		@Override
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			Student student = new Student();
			student.setId(rs.getInt("id"));
			student.setAge(rs.getInt("age"));
			student.setName(rs.getString("name"));
			return student;
		}
	}




}
