package com.third.spring3.helper;

import java.time.LocalDateTime;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
//import org.springframework.stereotype.Component;

            //AOP - Aspect Oriented Programming   IMP
@Aspect
//@Component
public class Helper {

	@Before("execution (*com.third.spring3.controller.managerController.getAllManagerDetails())")
	public void checkAuthorization() {
		System.out.println("Authorized user !! "+ LocalDateTime.now());
	}
	
	@After("execution (*com.third.spring3.controller.managerController.getAllManagerDetails())")
	public void checkAuthorization1() {
		System.out.println("Authorized user after method !!");
	}
}

/*@Around
  @AfterThrowing
  @AfterReturning
 */
 