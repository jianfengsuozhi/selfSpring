package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springidol.PerformanceException;
import com.spring.springidol.Performer;

public class Main02 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-aop05.xml");
		Performer performer = (Performer)ctx.getBean("testPerfomer");
		try {
			performer.perform();
		} catch (PerformanceException e) {
			e.printStackTrace();
		}
	}
}
