package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// get the object
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		 Employee e1=(Employee) context.getBean("eob");
	     e1.display();
	     
	     Employee e2=(Employee) context.getBean("eob1");
	     e2.display();
	   
	}

}
