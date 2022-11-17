package part02_annotation;

import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*

<!-- https://mvnrepository.com/artifact/org.aspectj/aspectjweaver -->
<dependency>
    <groupId>org.aspectj</groupId>
    <artifactId>aspectjweaver</artifactId>
    <version>1.9.6</version>
    <scope>runtime</scope>
</dependency>

 */

/*
 *	AOP(Aspect Oriented Programming) : 관점 지향 프로그래밍
 *	1. AOP는 문제를 바라보는 관점을 기준으로 프로그래밍하는 기법
 *	2. AOP는 문제를 해결하기 위한 핵심 관심사와 전체에 적용되는 공통 관심사를 기준으로 프로그래밍.
 * 
 */

public class SpringTest {
	public static void main(String[] args) {
//		String path = "part02_annotation/aop.xml";
//		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Service svc = null;
		svc = (Service)context.getBean("svc");
//		svc.prn1();
//		svc.prn1(10);
//		svc.prn1(new Random());
//		svc.prn1(20, 30);
		
//		svc.prn2();
		
//		svc.prn3();
		
//		try {
//			svc.prn4();
//		} catch (Exception e) {
//			System.out.println(e.toString());
//		}
		
		svc.prn5();
	}
}
