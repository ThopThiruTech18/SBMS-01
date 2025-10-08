package in.thiru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.service.EmployeeService;

@SpringBootApplication
public class No02JpaRepositoryMethodsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(No02JpaRepositoryMethodsApplication.class, args);
		EmployeeService bean = run.getBean(EmployeeService.class);
		
		bean.saveEmployee();
	
	}

}
