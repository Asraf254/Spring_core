package com.method.injection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
		TicketVEndingMachie tc=context.getBean("ticketVEndingMachie", TicketVEndingMachie.class);
		Ticket t =tc.generateTicket();
		System.out.println(t.printTicket());
	}

}
