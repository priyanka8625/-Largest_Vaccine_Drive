package com.pam.utility;
import java.util.Properties;



import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.pam.service.SignIn;


public class EmailNotification {
	private static String message="We are pleased to report that your appointment for COVID-19 vaccination has been booked successfully..!";
	private static String subject="#Largest Vaccination Drive : Appointment Confirmation ";
	private static String from="pam120704@gmail.com";
	private static String to="";
	
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
   System.out.println("Preparing to send Message....");
   
   
//   sendEmail(message,subject,to,from);
   
}

public static void sendEmail() {
	// TODO Auto-generated method stub
	String host="smtp.gmail.com";
	to=SignIn.userName;
	
	Properties properties= System.getProperties();
	System.out.println("Properties "+properties);
	//host set
	properties.put("mail.smtp.host",host);
	properties.put("mail.smtp.port","465");
	properties.put("mail.smtp.ssl.enable","true");
	properties.put("mail.smtp.auth","true");
	
	//to get session object
	Session session=Session.getInstance(properties,new Authenticator() {
		@Override
		protected PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication("pam120704@gmail.com","vroauzvamxirtily");
		}
	});
	
	session.setDebug(true);

	//step 2 compose the message
	
	try {
		MimeMessage m=new MimeMessage(session);
	//from
	m.setFrom(new InternetAddress(from));
	
	//add recepient to
	m.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
	
	//adding subject to message
	
	m.setSubject(subject);
	
	//adding text to message
	
	m.setText(message);
	
	//send
	//step 3 send message using transport class
	Transport.send(m);
	
	System.out.println("Message sent successfully");
	
	}catch(MessagingException e) {
		e.printStackTrace();
	}
//	catch(ClassNotFoundException e)
//	{
//		System.out.println("class nahiii");
//	}
 }
}
