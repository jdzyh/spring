package main.java.concert.bean;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CountPerform {
	private Map<Integer, Integer> performCounts = new HashMap<Integer, Integer>();
	
	//-----带参数的切面
	@Pointcut("execution(** main.java.concert.interfaces.Performance.id(int)) && args(performID)")
	public void countTime(int performID){}
	
	@Before("countTime(performID)")
	public void count(int performID) {
		int currentCount = getPerformCount(performID);
		performCounts.put(performID, currentCount+1);
	}
	
	public int getPerformCount(int id){
		return performCounts.containsKey(id) ? performCounts.get(id) : 0;
	}
}
