package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareAnnotation;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class ContestantIntroducer {
	@DeclareParents(
			value="com.spring.springidol.Performer+",
			defaultImpl=GraciousContestant.class)
	public static Contestant contestant;
}
