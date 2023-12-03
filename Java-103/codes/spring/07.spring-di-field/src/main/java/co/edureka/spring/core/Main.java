package co.edureka.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.spring.core.beans.Customer;

public class Main {

	public static void main(String[] args) {		
		ApplicationContext context = new ClassPathXmlApplicationContext("customer-car-beans.xml");
		
		Customer sanjay = (Customer)context.getBean("sanjay");
		
		System.out.printf("%s owns a %s car, which costs Rs. %.2f",sanjay.getCustomerName(), sanjay.getCar().getModel(), sanjay.getCar().getCost());
	}
}
