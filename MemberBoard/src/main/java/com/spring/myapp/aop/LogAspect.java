package com.spring.myapp.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
/*
 * AOP의 용어정리
 * Joinpoint : AOP 적용의 대상이 될 수 있는 모든 메서드
 * Aspect : AOP적용을 위해 준비한 공통 기능
 * Advice : AOP의 실행 시점
 * (before, after, after-throwing, after-returning, around가 존재)
 * 
 * Pointcut : Joinpoint 중 실제로 AOP를 적용받을 후보 메서드,
 * 
 * Weaving : Pointcut에 실제로 AOP를 적용하는 것
 * 
 * Targer Object : AOP를 적용받은 메서드를 하나 이상 가지고 있는 클래스
 */
	
	//표현식 execution(접근제한자 패키지 클래스 메서드명(파라미터값)) 순으로 작성합니다.
	//표현식은 AOP적용을 받을 메서들을 지목하기 위해 사용합니다.
	
	//AOP적용(Weaving)의 절차
	//1. 빈 깡통메서드를 만들고, @Pointcut(value=표현식)을 이용해 메서드를 지정한다.
	@Pointcut(value="execution(*com.spring..*.sayHello(..))")
	private void helloPointcut() {
		
	}
	
	//2. Advice(적용 시점)을 이노테이션으로 설정하고 포인트컷 집어넣기
	
	@Before("helloPointcut()")
	public void BeforeLig(JoinPoint joinPoint) {
		Signature signature = joinPoint.getSignature();
		System.out.println("[Log : Before] 메서드 이용 :" + 
							signature.getName());
	}
	
	//3. Advice는 반드시 깡통메서드를 이용한 포인트컷을 넣지 않아도된다.
	//표현식을 이용해도 상관없음
	
	@Before("execution(* com.spring..*.*(..))")
	public void AfterLog(JoinPoint joinPoint) {
		Signature signature = joinPoint.getSignature();
		System.out.println("[Log : Before] 메서드 이용 :" + 
							signature.getName());
	}
}
