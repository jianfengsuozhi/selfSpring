package com.spring.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMain01 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-dao01.xml");
		StudentDao studentDao = (StudentDao)ctx.getBean("studentDao");
		Student student = new Student(1, "d", 345);
//		studentDao.insert(student);
//		
//		Student selectById = studentDao.selectById(1);
//		System.out.println(selectById);
//		List<Student> select = studentDao.select();
//		for (Student student : select) {
//			System.out.println(student);
//		}
//		studentDao.update(student);
//		studentDao.delete(1);
//		int count = studentDao.count();
//		System.out.println(count);
		System.out.println(studentDao.selectNameById(2));
	}
}
