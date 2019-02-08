package com.lti.test;

//import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.component.Atm;

public class SpringTest {

	public static void main(String[] args) {
		//Loading the IoC container
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");  //
		
		//Accessing one of the bean
	/*	for(int i=0;i<=5;i++) {
		HelloWorld hw=(HelloWorld)context.getBean("1");//bean id("1")
		System.out.println(hw.sayHello("Bob"));
		}*/
		
		/*for(int i=0;i<=5;i++) {
		Calc calci=(Calc)context.getBean("calculator");
		System.out.println(calci.add(10, 20));
		System.out.println(calci.sub(10, 20));
}*/
		/*TextEdit te=(TextEdit)context.getBean("textEditor");
		te.loadTextDocument("abc.txt");
		*/
		
			Atm a=(Atm)context.getBean("denaAtm");
			a.withdrawMoney(123);
		
	}
}
