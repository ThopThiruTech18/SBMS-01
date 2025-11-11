package in.thiru;

import java.util.Arrays;
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


		
		
		List<Employee> employees = Arrays.asList(
	            new Employee("Aarav", 1000.00),
	            new Employee("Abhinav", 1050.00),
	            new Employee("Aditya", 1100.00),
	            new Employee("Akash", 1150.00),
	            new Employee("Alok", 1200.00),
	            new Employee("Amar", 1250.00),
	            new Employee("Amit", 1300.00),
	            new Employee("Anand", 1350.00),
	            new Employee("Arjun", 1400.00),
	            new Employee("Ashok", 1450.00),
	            new Employee("Bala", 1500.00),
	            new Employee("Bhavesh", 1550.00),
	            new Employee("Chaitanya", 1600.00),
	            new Employee("Chetan", 1650.00),
	            new Employee("Darshan", 1700.00),
	            new Employee("Deepak", 1750.00),
	            new Employee("Dev", 1800.00),
	            new Employee("Dinesh", 1850.00),
	            new Employee("Gaurav", 1900.00),
	            new Employee("Girish", 1950.00),
	            new Employee("Hari", 2000.00),
	            new Employee("Harsha", 2050.00),
	            new Employee("Hemant", 2100.00),
	            new Employee("Ishan", 2150.00),
	            new Employee("Jatin", 2200.00),
	            new Employee("Jay", 2250.00),
	            new Employee("Karan", 2300.00),
	            new Employee("Kiran", 2350.00),
	            new Employee("Krish", 2400.00),
	            new Employee("Lakshman", 2450.00),
	            new Employee("Lokesh", 2500.00),
	            new Employee("Manish", 2550.00),
	            new Employee("Manoj", 2600.00),
	            new Employee("Mohan", 2650.00),
	            new Employee("Mukesh", 2700.00),
	            new Employee("Nagesh", 2750.00),
	            new Employee("Naveen", 2800.00),
	            new Employee("Neeraj", 2850.00),
	            new Employee("Nikhil", 2900.00),
	            new Employee("Omkar", 2950.00),
	            new Employee("Pankaj", 3000.00),
	            new Employee("Parth", 3050.00),
	            new Employee("Pradeep", 3100.00),
	            new Employee("Prakash", 3150.00),
	            new Employee("Pranav", 3200.00),
	            new Employee("Prem", 3250.00),
	            new Employee("Rahul", 3300.00),
	            new Employee("Rajesh", 3350.00),
	            new Employee("Rakesh", 3400.00),
	            new Employee("Ravi", 3450.00),
	            new Employee("Rohit", 3500.00),
	            new Employee("Sachin", 3550.00),
	            new Employee("Sagar", 3600.00),
	            new Employee("Sahil", 3650.00),
	            new Employee("Sanjay", 3700.00),
	            new Employee("Santosh", 3750.00),
	            new Employee("Saurabh", 3800.00),
	            new Employee("Shankar", 3850.00),
	            new Employee("Sharath", 3900.00),
	            new Employee("Shiva", 3950.00),
	            new Employee("Siddharth", 4000.00),
	            new Employee("Soham", 4050.00),
	            new Employee("Sudhir", 4100.00),
	            new Employee("Sunil", 4150.00),
	            new Employee("Suraj", 4200.00),
	            new Employee("Suresh", 4250.00),
	            new Employee("Tarun", 4300.00),
	            new Employee("Tejas", 4350.00),
	            new Employee("Uday", 4400.00),
	            new Employee("Umesh", 4450.00),
	            new Employee("Varun", 4500.00),
	            new Employee("Veer", 4550.00),
	            new Employee("Vijay", 4600.00),
	            new Employee("Vikram", 4650.00),
	            new Employee("Vinay", 4700.00),
	            new Employee("Vinit", 4750.00),
	            new Employee("Vishal", 4800.00),
	            new Employee("Vivek", 4850.00),
	            new Employee("Yash", 4900.00),
	            new Employee("Yogesh", 4950.00),
	            new Employee("Adam", 5000.00),
	            new Employee("Alex", 5050.00),
	            new Employee("Andrew", 5100.00),
	            new Employee("Benjamin", 5150.00),
	            new Employee("Charles", 5200.00),
	            new Employee("Daniel", 5250.00),
	            new Employee("David", 5300.00),
	            new Employee("Edward", 5350.00),
	            new Employee("George", 5400.00),
	            new Employee("Henry", 5450.00),
	            new Employee("James", 5500.00),
	            new Employee("John", 5550.00),
	            new Employee("Joseph", 5600.00),
	            new Employee("Kevin", 5650.00),
	            new Employee("Mark", 5700.00),
	            new Employee("Michael", 5750.00),
	            new Employee("Paul", 5800.00),
	            new Employee("Peter", 5850.00),
	            new Employee("Richard", 5900.00),
	            new Employee("Thomas", 5950.00),
	            new Employee("Victor", 6000.00),
	            new Employee("Zack", 6050.00),
	            new Employee("Aaron", 6100.00),
	            new Employee("Nihar", 6150.00),
	            new Employee("Harith", 6200.00),
	            new Employee("Tushar", 6250.00),
	            new Employee("Saket", 6300.00)
	        );

	        List<Employee> savedList = empRepo.saveAll(employees);

	        if (savedList != null && !savedList.isEmpty()) {
	            System.out.println("✅ 100 Employee records inserted successfully!");
	        }
	        
	        
	        
	        
	      List<Employee> allEmployees = empRepo.getAllEmployees();
	      allEmployees.forEach(s->System.out.println(s));
	        
	      
		
		

	}

}
