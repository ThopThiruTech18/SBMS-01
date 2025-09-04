package in.thiruit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiruit.bean.EmployeeBean2;

@SpringBootApplication
public class BeanLifeCycleAnnotationApproachApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(BeanLifeCycleAnnotationApproachApplication.class, args);
		
		EmployeeBean2 bean2 = run.getBean(EmployeeBean2.class);
		
		bean2.printName1("Chinna");
		bean2.printWelcome("Chinna");
		
	}

}
