package in.thiru;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import in.thiru.entity.Employee;
import in.thiru.repository.EmployeeRepository;

@SpringBootApplication
public class No02SecondApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(No02SecondApplication.class, args);

		EmployeeRepository empRepo = run.getBean(EmployeeRepository.class);

//		List<Employee> byEmpNam = empRepo.findByEmpNam("Bala");
//
//		byEmpNam.forEach(s -> System.out.println(s));
//
//		empRepo.findByEmpSalary(1000.0);
//
//		List<Employee> byEmpSalaryGreaterThanEqual = empRepo.findByEmpSalaryGreaterThanEqual(4000.0);
//
//		byEmpSalaryGreaterThanEqual.forEach(s -> System.out.println(s));
//
//		System.out.println("----------------");
//
//		List<Employee> byEmpNamEndingWith = empRepo.findByEmpNamEndingWith("th");
//
//		byEmpNamEndingWith.forEach(s -> System.out.println(s));

		// sorting

//		List<Employee> all = empRepo.findAll(Sort.by("empNam").ascending());
//
//		all.forEach(System.out::println);
		
		
		//QBE
		
//		Employee emp=new Employee();
//		emp.setEmpNam("Nikhil");
//		emp.setEmpSalary(2900.0);
//		List<Employee> all = empRepo.findAll(Example.of(emp));
//		all.forEach(System.out::println);
		
		
		Page<Employee> all1 = empRepo.findAll(PageRequest.of(1, 10));
		all1.forEach(System.out::println);
		
		System.out.println("--------------------------------");
//		Page<Employee> all2 = empRepo.findAll(PageRequest.of(1, 5));
//		all2.forEach(System.out::println);
//		

	}

}
