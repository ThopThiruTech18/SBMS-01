package in.thiruit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiruit.service.UserService;

@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(UserApplication.class, args);
	
		UserService bean = run.getBean(UserService.class);
		
		bean.getNameById(200);
	}

}
