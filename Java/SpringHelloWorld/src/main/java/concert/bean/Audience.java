package main.java.concert.bean;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//@Aspect
public class Audience {
	//@Pointcut("execution(** main.java.concert.interfaces.Performance.perform(..))")//�����������е�
	public void performance(){}//�շ�������ע��������
	
	//����֮ǰ
	//@Before("performance()")
	public void silenceCellPhones(){
		System.out.println("Audience.silenceCellPhones");
	}
	
	//@Before("performance()")
	public void takeSeats(){
		System.out.println("Audience.takeSeats");
	}
	
	//����֮��
	//@AfterReturning("performance()")
	public void applause(){
		System.out.println("Audience.applause");
	}
	
	//����ʧ�ܺ�
	//@AfterThrowing("performance()")
	public void demandRefund(){
		System.out.println("Audience.demandRefund");
	}
	
//	//����ע��
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
