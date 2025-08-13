package in.thiruit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiruit.repo.StudentRepo;
import in.thiruit.service.StudentService;

@SpringBootApplication
public class SpringBootAnnotationsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootAnnotationsApplication.class, args);
		
		StudentService stdObj1 = run.getBean(StudentService.class);
		StudentService stdObj2 = run.getBean(StudentService.class);
		StudentService stdObj3 = run.getBean(StudentService.class);
		
		System.out.println(stdObj1.hashCode());
		System.out.println(stdObj2.hashCode());
		System.out.println(stdObj3.hashCode());
		
		
	}

}
