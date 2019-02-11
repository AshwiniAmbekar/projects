package com.lti.test;

import java.util.List;

import javax.transaction.Transactional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import com.lti.entity.RegistrationEntity;
import com.lti.repository.RegistrationRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@Rollback(false)
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class RegistrationTest {
	
		@Autowired
		private RegistrationRepository registrationRepository;
		
		@Autowired
		private RegistrationEntity registrationEntity;
		
		@Test
		@Transactional
		public void registerUser() {
		    RegistrationEntity register = new RegistrationEntity();
			register.setFirstName("Ashwini");
			register.setLastName("Ambekar");
			register.setEmailid("ashwini4here@gmail.com");
			register.setPassword("ashwini@123");
			registrationRepository.insert(register);
		}

		@Test
		@Transactional
		public void fetchAllUser() {
		    RegistrationEntity register1 = new RegistrationEntity();
			register1.getFirstName();
			register1.getLastName();
			register1.getEmailid();
			register1.getPassword();
			registrationRepository.fetchAll();	
		}
		
		@Test
		@Transactional
		public void loginUser() {
			
			boolean flag=false;
			String email="ashwini@19";
			String password="ash";
			
			List<RegistrationEntity> userList = registrationRepository.fetchAll();
			
			for(RegistrationEntity re:userList) {
				if(email.equals(re.getEmailid())) {
					if(password.equals(re.getPassword())) {
						flag= true;
					}
				}	
			}
			String flag1=Boolean.toString(flag);
			if(flag1.equals("true")) {
				System.out.println("User is valid");
			}
			else
				System.out.println("user is invalid");
		}
	}
	
	
	
	
	
	
	
	
	


