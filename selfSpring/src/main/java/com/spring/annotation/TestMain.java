package com.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springidol.PerformanceException;
import com.spring.springidol.Performer;


public class TestMain {
	public static void main(String[] args) throws PerformanceException{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idolAnnotation.xml");
//		Performer performer = (Performer)ctx.getBean("a");
//		performer.perform();
//		Performer performer1 = (Performer)ctx.getBean("kenny");
//		performer1.perform();
//		Performer performer1 = (Performer)ctx.getBean("kenny2");
//		performer1.perform();//java.lang.NullPointerException
		System.out.println(ctx.getBean("gt"));
	}

}
