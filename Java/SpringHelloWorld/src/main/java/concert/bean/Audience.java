package main.java.concert.bean;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	@Pointcut("execution(void main.java.concert.interfaces.Performance.perform(..))")//�����������е�
	public void performance(){}//�շ�������ע��������
	
	//����֮ǰ
	@Before("performance()")
	public void silenceCellPhones(){
		System.out.println("silenceCellPhones");
	}
	
	@Before("performance()")
	public void takeSeats(){
		System.out.println("takeSeats");
	}
	
	//����֮��
	@AfterReturning("performance()")
	public void applause(){
		System.out.println("applause");
	}
	
	//����ʧ�ܺ�
	@AfterThrowing("performance()")
	public void demandRefund(){
		System.out.println("demandRefund");
	}
	
}
