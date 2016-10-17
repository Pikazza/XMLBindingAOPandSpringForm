package com.springform.aspect;

import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class UserAspect {
	private static Log _log = LogFactory.getLog(UserAspect.class);
	@Before("execution(public String com.springform.controller..*(..))")
	public void getAllAdvice(JoinPoint joinPoint){
		System.out.println("Executing Advice on view registration()");
		_log.info("loggingAdvice on method before="+joinPoint.toString()+ Arrays.toString(joinPoint.getArgs()));

	}
	
	@AfterReturning(pointcut="execution(* com.springform.controller..*(..))" , returning="result")
	 public void afterReturning(JoinPoint joinPoint , Object result) {
	 
_log.info("loggingAdvice on method after returning from ="+joinPoint.toString()+ Arrays.toString(joinPoint.getArgs())+result);
	 
}
	
	@AfterThrowing("within(*) com.springform.controller..*(..))")
	 public void logExceptions(JoinPoint joinPoint){
		_log.info("Exception thrown in SquarePanService Method="+joinPoint.toString());
}

}
