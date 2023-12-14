package org.springframework.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class AopTest {
	@Pointcut("execution(* *.test(..))")
	public void test(){
	}

	@After("test()")
	public void afterTest(){
		System.out.println("@After");
	}

	@Before("test()")
	public void beforeTest() {
		System.out.println("@Before");

	}

	@Around("test()")
	public Object aroundTest(ProceedingJoinPoint point) throws Throwable {
		System.out.println("aroundTest before");
		Object proceed = point.proceed();
		System.out.println("aroundTest after");
		return proceed;
	}


}
