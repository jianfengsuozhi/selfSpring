package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
  @Pointcut("execution(* com.spring.springidol.Performer.perform(..))")
  public void performance(){
	  
  }
  @Before("performance()")
  public void takeSeats() { //<co id="co_takeSeats"/>
    System.out.println("The audience is taking their seats.");
  }
  
  @Before("performance()")
  public void turnOffCellPhones() { //<co id="co_turnOffCellPhones"/>
    System.out.println("The audience is turning off their cellphones");
  }
  @AfterReturning("performance()")
  public void applaud() { //<co id="co_applaud"/>
    System.out.println("CLAP CLAP CLAP CLAP CLAP");
  }
  @AfterThrowing("performance()")
  public void demandRefund() { //<co id="co_demandRefund"/>
    System.out.println("Boo! We want our money back!");
  }
  @Around("performance()")
  public void watchPerformance(ProceedingJoinPoint joinpoint) {
	    try { 
	      long start = System.currentTimeMillis(); //<co id="co_beforeProceed"/>

	      joinpoint.proceed(); //<co id="co_proceed"/>
	      
	      long end = System.currentTimeMillis(); // <co id="co_afterProceed"/>
	      System.out.println("The performance took " + (end - start)
	          + " milliseconds.");
	    } catch (Throwable t) {
	      System.out.println("Boo! We want our money back!"); //<co id="co_afterException"/>
	    }
	}
}