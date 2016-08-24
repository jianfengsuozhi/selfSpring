package com.spring.javaClassAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.springidol.Juggler;
import com.spring.springidol.Performer;
import com.spring.springidol.Poem;
import com.spring.springidol.PoeticJuggler;
import com.spring.springidol.Sonnet29;

@Configuration//相当于 beans
public class SpringIdolConfig {
	// id是方法名  装配简单的值
	@Bean
	public Performer duke1(){
		return new Juggler(15);
	}
	@Bean
	public Poem sonnet29(){
		return new Sonnet29();
	}
	@Bean
	public Performer poeticDuke(){
		//在其他bean引用sonnet29()时，spring会拦截该方法的调用，并尝试查找该Bean,而不是让这个方法创建一个新的实例
		return new PoeticJuggler(sonnet29());
	}
}
