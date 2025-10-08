package in.thiru;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.entity.Employee;
import in.thiru.repository.EmployeeRepository;

@SpringBootApplication
public class No01FirstAppUsingJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(No01FirstAppUsingJpaApplication.class, args);

		EmployeeRepository empRepo = run.getBean(EmployeeRepository.class);

		List<Employee> employees = Arrays.asList(
			    new Employee(101, "Aarav", 1000.00),
			    new Employee(102, "Abhinav", 1050.00),
			    new Employee(103, "Aditya", 1100.00),
			    new Employee(104, "Akash", 1150.00),
			    new Employee(105, "Alok", 1200.00),
			    new Employee(106, "Amar", 1250.00),
			    new Employee(107, "Amit", 1300.00),
			    new Employee(108, "Anand", 1350.00),
			    new Employee(109, "Arjun", 1400.00),
			    new Employee(110, "Ashok", 1450.00),
			    new Employee(111, "Bala", 1500.00),
			    new Employee(112, "Bhavesh", 1550.00),
			    new Employee(113, "Chaitanya", 1600.00),
			    new Employee(114, "Chetan", 1650.00),
			    new Employee(115, "Darshan", 1700.00),
			    new Employee(116, "Deepak", 1750.00),
			    new Employee(117, "Dev", 1800.00),
			    new Employee(118, "Dinesh", 1850.00),
			    new Employee(119, "Gaurav", 1900.00),
			    new Employee(120, "Girish", 1950.00),
			    new Employee(121, "Hari", 2000.00),
			    new Employee(122, "Harsha", 2050.00),
			    new Employee(123, "Hemant", 2100.00),
			    new Employee(124, "Ishan", 2150.00),
			    new Employee(125, "Jatin", 2200.00),
			    new Employee(126, "Jay", 2250.00),
			    new Employee(127, "Karan", 2300.00),
			    new Employee(128, "Kiran", 2350.00),
			    new Employee(129, "Krish", 2400.00),
			    new Employee(130, "Lakshman", 2450.00),
			    new Employee(131, "Lokesh", 2500.00),
			    new Employee(132, "Manish", 2550.00),
			    new Employee(133, "Manoj", 2600.00),
			    new Employee(134, "Mohan", 2650.00),
			    new Employee(135, "Mukesh", 2700.00),
			    new Employee(136, "Nagesh", 2750.00),
			    new Employee(137, "Naveen", 2800.00),
			    new Employee(138, "Neeraj", 2850.00),
			    new Employee(139, "Nikhil", 2900.00),
			    new Employee(140, "Omkar", 2950.00),
			    new Employee(141, "Pankaj", 3000.00),
			    new Employee(142, "Parth", 3050.00),
			    new Employee(143, "Pradeep", 3100.00),
			    new Employee(144, "Prakash", 3150.00),
			    new Employee(145, "Pranav", 3200.00),
			    new Employee(146, "Prem", 3250.00),
			    new Employee(147, "Rahul", 3300.00),
			    new Employee(148, "Rajesh", 3350.00),
			    new Employee(149, "Rakesh", 3400.00),
			    new Employee(150, "Ravi", 3450.00),
			    new Employee(151, "Rohit", 3500.00),
			    new Employee(152, "Sachin", 3550.00),
			    new Employee(153, "Sagar", 3600.00),
			    new Employee(154, "Sahil", 3650.00),
			    new Employee(155, "Sanjay", 3700.00),
			    new Employee(156, "Santosh", 3750.00),
			    new Employee(157, "Saurabh", 3800.00),
			    new Employee(158, "Shankar", 3850.00),
			    new Employee(159, "Sharath", 3900.00),
			    new Employee(160, "Shiva", 3950.00),
			    new Employee(161, "Siddharth", 4000.00),
			    new Employee(162, "Soham", 4050.00),
			    new Employee(163, "Sudhir", 4100.00),
			    new Employee(164, "Sunil", 4150.00),
			    new Employee(165, "Suraj", 4200.00),
			    new Employee(166, "Suresh", 4250.00),
			    new Employee(167, "Tarun", 4300.00),
			    new Employee(168, "Tejas", 4350.00),
			    new Employee(169, "Uday", 4400.00),
			    new Employee(170, "Umesh", 4450.00),
			    new Employee(171, "Varun", 4500.00),
			    new Employee(172, "Veer", 4550.00),
			    new Employee(173, "Vijay", 4600.00),
			    new Employee(174, "Vikram", 4650.00),
			    new Employee(175, "Vinay", 4700.00),
			    new Employee(176, "Vinit", 4750.00),
			    new Employee(177, "Vishal", 4800.00),
			    new Employee(178, "Vivek", 4850.00),
			    new Employee(179, "Yash", 4900.00),
			    new Employee(180, "Yogesh", 4950.00),
			    new Employee(181, "Adam", 5000.00),
			    new Employee(182, "Alex", 5050.00),
			    new Employee(183, "Andrew", 5100.00),
			    new Employee(184, "Benjamin", 5150.00),
			    new Employee(185, "Charles", 5200.00),
			    new Employee(186, "Daniel", 5250.00),
			    new Employee(187, "David", 5300.00),
			    new Employee(188, "Edward", 5350.00),
			    new Employee(189, "George", 5400.00),
			    new Employee(190, "Henry", 5450.00),
			    new Employee(191, "James", 5500.00),
			    new Employee(192, "John", 5550.00),
			    new Employee(193, "Joseph", 5600.00),
			    new Employee(194, "Kevin", 5650.00),
			    new Employee(195, "Mark", 5700.00),
			    new Employee(196, "Michael", 5750.00),
			    new Employee(197, "Paul", 5800.00),
			    new Employee(198, "Peter", 5850.00),
			    new Employee(199, "Richard", 5900.00),
			    new Employee(200, "Thomas", 5950.00)
			);


		//01)save: it is used to save one employee data
//		empRepo.save(emp2);
		
//		List<Employee> asList = Arrays.asList(emp1,emp2,emp3);
		
		
		//02)saveAll: it is used to save one employee data
		
//		empRepo.saveAll(employees);
		
		
		//03)count() method
//		long count = empRepo.count();
//		System.out.println("Total Number of employees is :: "+count);
		
		
		
		
		//04)existById() method
//		boolean isPersonAvailable = empRepo.existsById(201);
//		
//		if(isPersonAvailable)
//		{
//			System.out.println("The Employee Available");
//		}
//		else
//		{
//			System.out.println("The Employee not Available");
//		}
		
		
		
		//05)existById() method
//		Optional<Employee> empData = empRepo.findById(108);
//		if(empData.isPresent())
//		{
//			Employee employee = empData.get();
//			System.out.println(employee);
//		}
		
		
		//06)findAllById(asList)
//		List<Integer> asList = Arrays.asList(110,111,112,113,114,115);
//		Iterable<Employee> allById = empRepo.findAllById(asList);
//		allById.forEach(s->System.out.println(s));
		
		
		//07)get all employee data at time
//		Iterable<Employee> all = empRepo.findAll();
//		all.forEach(s->System.out.println(s));
		
		//08)deleteById(pkid)
//		empRepo.deleteById(200);
		
		
//		09)deleteAllById(150,160,170,180)
		
//		List<Integer> asList = Arrays.asList(150,160,170,180,190);
//		empRepo.deleteAllById(asList);
		
		//10)deleteAll
//		empRepo.deleteAll();
		
		
		//11)deleteAll
//		Employee emp1=new Employee(111,"Bala",1500.0);
//		empRepo.delete(emp1);
		
		
		
//		List<Employee> employees1 = Arrays.asList(
//			    new Employee(101, "Aarav", 1000.00),
//			    new Employee(102, "Abhinav", 1050.00),
//			    new Employee(103, "Aditya", 1100.00),
//			    new Employee(104, "Akash", 1150.00),
//			    new Employee(105, "Alok", 1200.00),
//			    new Employee(106, "Amar", 1250.00),
//			    new Employee(107, "Amit", 1300.00),
//			    new Employee(108, "Anand", 1350.00),
//			    new Employee(109, "Arjun", 1400.00),
//			    new Employee(110, "Ashok", 1450.00));
//		
//		empRepo.deleteAll(employees1);
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
