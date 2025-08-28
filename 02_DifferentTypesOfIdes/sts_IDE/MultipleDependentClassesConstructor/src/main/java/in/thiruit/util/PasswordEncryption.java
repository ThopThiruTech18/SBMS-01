package in.thiruit.util;

import org.springframework.stereotype.Component;

@Component
public class PasswordEncryption {

	public boolean encrypt() {
		
		System.out.println("encrypt() started");
		
		boolean isEncrypt=true;
		System.out.println("encrypt() ended");

		return isEncrypt;

	}

}
