package com.spring.javaClassAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springidol.PerformanceException;
import com.spring.springidol.Performer;

public class Main01 {
	public static void main(String[] args) throws PerformanceException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idolAnnotation.xml");
		Performer performer = (Performer)ctx.getBean("poeticDuke");
//		performer.perform();
	}
}
