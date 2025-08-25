package in.thiruit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiruit.service.UserServiceImpl;

@SpringBootApplication
public class MultipleDependentClassesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(MultipleDependentClassesApplication.class, args);
		
		UserServiceImpl userServiceImplbean = run.getBean(UserServiceImpl.class);
		userServiceImplbean.register();
	}

}
