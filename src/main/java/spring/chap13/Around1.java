package spring.chap13;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Around1 {

	
	@Pointcut("bean(core)")
	public void dumM(){}
	
	@Around("dumM()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("around ���� + proceed ��");
		joinPoint.proceed();
		System.out.println("around ���� + proceed ��");
	}
	
	
	
}
