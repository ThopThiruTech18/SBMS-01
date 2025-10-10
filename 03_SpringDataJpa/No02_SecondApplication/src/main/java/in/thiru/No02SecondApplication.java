package in.thiru;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.entity.Employee;
import in.thiru.repository.EmployeeRepository;

@SpringBootApplication
public class No02SecondApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(No02SecondApplication.class, args);
		
		
		EmployeeRepository empRepo = run.getBean(EmployeeRepository.class);
		
		List<Employee> byEmpNam = empRepo.findByEmpNam("Bala");
		
		byEmpNam.forEach(s->System.out.println(s));
		
		empRepo.findByEmpSalary(1000.0);
		
		List<Employee> byEmpSalaryGreaterThanEqual = empRepo.findByEmpSalaryGreaterThanEqual(4000.0);
		
		byEmpSalaryGreaterThanEqual.forEach(s->System.out.println(s));
		
		System.out.println("----------------");
		
		List<Employee> byEmpNamEndingWith = empRepo.findByEmpNamEndingWith("th");
		
	
		byEmpNamEndingWith.forEach(s->System.out.println(s));
	}

}
