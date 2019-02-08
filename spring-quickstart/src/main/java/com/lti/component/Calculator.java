package com.lti.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //replaces <bean> tag in the xml file
@Scope("prototype")
public class Calculator implements Calc {

	public	Calculator() {
		System.out.println("Constructor called");
	}
	public int add(int x,int y) {
		return x+y;
	}
	
	public int sub(int x,int y) {
		return x-y;
	}
}
