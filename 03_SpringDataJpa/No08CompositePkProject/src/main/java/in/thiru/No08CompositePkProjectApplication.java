package in.thiru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.entity.Employee;
import in.thiru.service.EmployeeService;

@SpringBootApplication
public class No08CompositePkProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(No08CompositePkProjectApplication.class, args);
	
	
		EmployeeService empObj = run.getBean(EmployeeService.class);
		empObj.saveEmployee();
	
	}

}
