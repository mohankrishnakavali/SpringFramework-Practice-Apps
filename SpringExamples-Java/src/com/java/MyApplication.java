package com.java;

public class MyApplication {
	private EmailService email=new EmailService();
	 public void proceeMessage(String mes,String rec)
	 {
		 this.email.sendMail(mes, rec);
	 }
	
}
