package main.java.concert.bean;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	@Pointcut("execution(void main.java.concert.interfaces.Performance.perform(..))")//定义命名的切点
	public void performance(){}//空方法，供注解依附用
	
	//表演之前
	@Before("performance()")
	public void silenceCellPhones(){
		System.out.println("silenceCellPhones");
	}
	
	@Before("performance()")
	public void takeSeats(){
		System.out.println("takeSeats");
	}
	
	//表演之后
	@AfterReturning("performance()")
	public void applause(){
		System.out.println("applause");
	}
	
	//表演失败后
	@AfterThrowing("performance()")
	public void demandRefund(){
		System.out.println("demandRefund");
	}
	
}
