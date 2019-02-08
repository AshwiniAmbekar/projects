package com.lti.jdbc.test;

//import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.dao.CarPartsDao;
import com.lti.entity.CarPart;

public class CarJdbcTest {

	public static void main(String[] args) {
		//Loading the IoC container
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");  //
			
			CarPartsDao cpd=(CarPartsDao)context.getBean("carPartDao4");
			CarPart cp=new CarPart();
			cp.setPartNo(102);
			cp.setName("Stearing");
			cp.setCarModel("B1050");
			cp.setPrice(1200);
			cp.setQuantity(2);
			cpd.addNewPart(cp);
			
			CarPartsDao cpd1=(CarPartsDao)context.getBean("carPartDao");
			cpd1.getAvailableParts();
	
			}
}
