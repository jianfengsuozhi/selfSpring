package com.spring.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//beanFactory 最简单的容器（bean装配和依赖注入） ApplicationContext容器 更高级的服务
		//找不到 ClassPathXmlApplicationContext 类原因：spring jar版本太老 改为：3.2.0.RELEASE
		//spring.context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");
//		Performer performer = (Performer)ctx.getBean("duke");
//		Performer performer = (Performer)ctx.getBean("poeticDuke");
//		performer.perform();
		//工厂方法
//		Stage stage1 = (Stage)ctx.getBean("theStage");
//		Stage stage2 = (Stage)ctx.getBean("theStage1");
//		System.out.println(stage1 == stage2);//true
		//单例 scope=prototype
//		Ticket ticket = (Ticket)ctx.getBean("ticket");
//		Ticket ticket1 = (Ticket)ctx.getBean("ticket");
//		System.out.println(ticket == ticket1);//true
		//scope="prototype"
//		Ticket ticket = (Ticket)ctx.getBean("ticket1");
//		Ticket ticket1 = (Ticket)ctx.getBean("ticket1");
//		System.out.println(ticket == ticket1);//false
		
//		Auditorium auditorium = (Auditorium)ctx.getBean("auditorium");//构造器 表演前关灯
		
//		Performer performer = (Performer)ctx.getBean("kenny3");//Playing Jingle Bells : TOOT TOOT TOOT
//		performer.perform();
//		Performer performer = (Performer)ctx.getBean("hank1");
//		performer.perform();
		
		
//		TestExpressionInject bean = ctx.getBean("ex1", TestExpressionInject.class);
//		System.out.println(bean);
//		TestExpressionInject [a=5.0, str=wei, bool=false, saxophone=com.springinaction.springidol.Saxophone@48891f64, song=Jingle Bells, return1=return, return2=RETURN, PI=3.141592653589793, random=0.5857309825848083]
		
//		TestExpressionInject01 bean = ctx.getBean("ex2", TestExpressionInject01.class);
//		System.out.println(bean);
//		TestExpressionInject01 [sum=5.141592653589793, sumStr=3.1415926535897932, area=12.566370614359172, equl=false, and=false, sanSelect1=return, sanSelect2=return, matches=true]
	
//		TestExpressionInject02 bean = ctx.getBean("ex3", TestExpressionInject02.class);
//		System.out.println(bean);
//		[choseCities=City [name=3, value=30], name=wdl, java_home=E:\java\jdk1.7, chars=s, bigCities=[City [name=3, value=30], City [name=4, value=40]], bigCity=City [name=3, value=30]]
	}
}
