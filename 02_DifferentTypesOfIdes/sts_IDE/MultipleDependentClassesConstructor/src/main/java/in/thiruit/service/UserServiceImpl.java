package in.thiruit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.thiruit.repo.UserRegistratrationImpl;
import in.thiruit.util.EmailSending;
import in.thiruit.util.PasswordEncryption;

@Service
public class UserServiceImpl implements IUserService {

	EmailSending emaiSendingService;

	PasswordEncryption passwordEncrypt;

	UserRegistratrationImpl userRegister;

	public UserServiceImpl(EmailSending emaiSendingService, PasswordEncryption passwordEncrypt,
			UserRegistratrationImpl userRegister) {
		this.emaiSendingService = emaiSendingService;
		this.passwordEncrypt = passwordEncrypt;
		this.userRegister = userRegister;
	}

	@Override
	public void register() {

		// Encrypt the password
		// Save the user details into the database
		// you can send email your successfully register
		boolean encrypt = passwordEncrypt.encrypt();
		boolean isRegister = userRegister.register("abc@gmail.com", "encrypt", "abc");

		if (isRegister) {
			emaiSendingService.sendEmail("abc@gmail.com", "Successfully register",
					"Hello Successfully register the application");
		}

	}

}
