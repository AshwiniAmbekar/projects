package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DenaAtm implements Atm {
@Autowired
private Bank lb;

	public void withdrawMoney(int acno) {
		System.out.println("Amount withdrawn from atm having account number as"+acno);
		lb.myBank(acno);
	}
}
