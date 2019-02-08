package com.lti.component;

import org.springframework.stereotype.Component;

@Component
public class LenaBank implements Bank {
	/* (non-Javadoc)
	 * @see com.lti.component.Bank#myBank(int)
	 */
	public void myBank(int acno) {
		System.out.println("Amount withdrawn from bank having account number as "+acno);
		
	}
}
