package main.java.concert.bean;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//@Aspect
public class Audience {
	//@Pointcut("execution(** main.java.concert.interfaces.Performance.perform(..))")//定义命名的切点
	public void performance(){}//空方法，供注解依附用
	
	//表演之前
	//@Before("performance()")
	public void silenceCellPhones(){
		System.out.println("Audience.silenceCellPhones");
	}
	
	//@Before("performance()")
	public void takeSeats(){
		System.out.println("Audience.takeSeats");
	}
	
	//表演之后
	//@AfterReturning("performance()")
	public void applause(){
		System.out.println("Audience.applause");
	}
	
	//表演失败后
	//@AfterThrowing("performance()")
	public void demandRefund(){
		System.out.println("Audience.demandRefund");
	}
	
//	//环绕注解
//	@Around("performance()")
//	public void watchPerformance(ProceedingJoinPoint jp){
//		try{
//			System.out.println("silenceCellPhones");
//			System.out.println("takeSeats");
//			jp.proceed();
//			System.out.println("applause");
//		} catch(Throwable e){
//			System.out.println("demandRefund");
//		}
//	}
}
