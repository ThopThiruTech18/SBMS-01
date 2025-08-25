package in.thiruit.util;

import org.springframework.stereotype.Component;

@Component
public class EmailSending {
	
	

	public boolean sendEmail(String to, String subject, String body) {
		
		System.out.println("sendEmail() started");
		boolean issendEmail=true;
		System.out.println("sendEmail() started");
		
		return issendEmail;
	}

}
