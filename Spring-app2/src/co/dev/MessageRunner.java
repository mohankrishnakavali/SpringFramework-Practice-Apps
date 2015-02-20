package co.dev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRunner {
	
	public static void main(String[] args) {
		System.out.println("Initializing spring context..");
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("/DefaultMessageTest-context.xml");
		System.out.println("Spring context Initialized");
			DefaultMessage message=(DefaultMessage)applicationContext.getBean("message");
			System.out.println(message.getMessage("bean"));
	}
}

