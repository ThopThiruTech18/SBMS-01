package in.thiru.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.thiru.entity.Employee;
import in.thiru.repository.EmployeeRepo;

@Component
public class DataLoader implements CommandLineRunner{
	
	
	@Autowired
	private EmployeeRepo empRepo;

	@Override
	public void run(String... args) throws Exception {


		
		
		List<Employee> listOfEmps = Arrays.asList(new Employee("Arun", 45000.0, "Hyderabad"),
	            new Employee("Bhavani", 55000.0, "Bangalore"),
	            new Employee("Chandru", 47000.0, "Chennai"),
	            new Employee("Deepa", 49000.0, "Pune"),
	            new Employee("Eshwar", 52000.0, "Delhi"),
	            new Employee("Farooq", 53000.0, "Mumbai"),
	            new Employee("Gopi", 51000.0, "Hyderabad"),
	            new Employee("Harini", 60000.0, "Chennai"),
	            new Employee("Indu", 58000.0, "Pune"),
	            new Employee("Jagadeesh", 47000.0, "Delhi"),
	            new Employee("Kavya", 62000.0, "Bangalore"),
	            new Employee("Lokesh", 48000.0, "Hyderabad"),
	            new Employee("Manasa", 50000.0, "Chennai"),
	            new Employee("Naveen", 46000.0, "Pune"),
	            new Employee("Omkar", 54000.0, "Mumbai"),
	            new Employee("Pradeep", 49000.0, "Delhi"),
	            new Employee("Qureshi", 53000.0, "Bangalore"),
	            new Employee("Ravi", 55000.0, "Hyderabad"),
	            new Employee("Sita", 48000.0, "Chennai"),
	            new Employee("Thiru", 57000.0, "Pune"),
	            new Employee("Uma", 59000.0, "Bangalore"),
	            new Employee("Varun", 61000.0, "Delhi"),
	            new Employee("Waseem", 52000.0, "Hyderabad"),
	            new Employee("Xavier", 56000.0, "Chennai"),
	            new Employee("Yamini", 58000.0, "Pune"),
	            new Employee("Zakir", 60000.0, "Bangalore"),

	            new Employee("Anil", 49000.0, "Hyderabad"),
	            new Employee("Bhuvana", 52000.0, "Delhi"),
	            new Employee("Chitra", 53000.0, "Chennai"),
	            new Employee("Dinesh", 50000.0, "Pune"),
	            new Employee("Elango", 55000.0, "Mumbai"),
	            new Employee("Fathima", 57000.0, "Bangalore"),
	            new Employee("Guna", 46000.0, "Hyderabad"),
	            new Employee("Hari", 48000.0, "Chennai"),
	            new Employee("Irfan", 51000.0, "Pune"),
	            new Employee("Jaya", 53000.0, "Delhi"),
	            new Employee("Kiran", 56000.0, "Hyderabad"),
	            new Employee("Lalitha", 60000.0, "Bangalore"),
	            new Employee("Mohan", 49000.0, "Chennai"),
	            new Employee("Nithya", 47000.0, "Delhi"),
	            new Employee("Oviya", 55000.0, "Pune"),
	            new Employee("Pavan", 58000.0, "Hyderabad"),
	            new Employee("Quincy", 52000.0, "Chennai"),
	            new Employee("Ramesh", 60000.0, "Bangalore"),
	            new Employee("Shiva", 59000.0, "Pune"),
	            new Employee("Teja", 61000.0, "Delhi"),
	            new Employee("Usha", 48000.0, "Hyderabad"),
	            new Employee("Vijay", 55000.0, "Bangalore"),
	            new Employee("Wasim", 52000.0, "Pune"),
	            new Employee("Xena", 50000.0, "Delhi"),
	            new Employee("Yogesh", 54000.0, "Chennai"),
	            new Employee("Zoya", 56000.0, "Hyderabad"),

	            new Employee("Ananya", 47000.0, "Chennai"),
	            new Employee("Baskar", 52000.0, "Delhi"),
	            new Employee("Charan", 51000.0, "Hyderabad"),
	            new Employee("Divya", 53000.0, "Pune"),
	            new Employee("Eben", 56000.0, "Bangalore"),
	            new Employee("Feroz", 58000.0, "Chennai"),
	            new Employee("Geetha", 50000.0, "Delhi"),
	            new Employee("Hemant", 62000.0, "Hyderabad"),
	            new Employee("Indira", 54000.0, "Pune"),
	            new Employee("Jatin", 51000.0, "Bangalore"),
	            new Employee("Keerthi", 48000.0, "Chennai"),
	            new Employee("Lakshmi", 60000.0, "Delhi"),
	            new Employee("Manoj", 59000.0, "Pune"),
	            new Employee("Nikita", 57000.0, "Hyderabad"),
	            new Employee("Om", 55000.0, "Bangalore"),
	            new Employee("Preethi", 52000.0, "Chennai"),
	            new Employee("RaviKiran", 61000.0, "Delhi"),
	            new Employee("Sahana", 49000.0, "Pune"),
	            new Employee("Tanish", 56000.0, "Hyderabad"),
	            new Employee("Umesh", 53000.0, "Bangalore"),
	            new Employee("Vasanth", 54000.0, "Pune"),
	            new Employee("Wendy", 55000.0, "Delhi"),
	            new Employee("Xander", 51000.0, "Chennai"),
	            new Employee("Yasmin", 57000.0, "Hyderabad"),
	            new Employee("Zubin", 60000.0, "Bangalore"),
	            new Employee("Arjun", 58000.0, "Chennai"),
	            new Employee("Bobby", 52000.0, "Pune"),
	            new Employee("Catherine", 56000.0, "Delhi"),
	            new Employee("Dharani", 47000.0, "Hyderabad"),
	            new Employee("Evelyn", 54000.0, "Bangalore"),
	            new Employee("Franklin", 51000.0, "Pune"),
	            new Employee("Gowri", 59000.0, "Chennai"),
	            new Employee("Hitesh", 55000.0, "Delhi"),
	            new Employee("Isha", 60000.0, "Hyderabad"),
	            new Employee("Jay", 52000.0, "Bangalore"),
	            new Employee("Karthik", 53000.0, "Pune"),
	            new Employee("Latha", 56000.0, "Chennai"),
	            new Employee("Mani", 54000.0, "Delhi"),
	            new Employee("Neha", 60000.0, "Hyderabad"),
	            new Employee("Omar", 58000.0, "Bangalore"),
	            new Employee("Pooja", 57000.0, "Pune"),
	            new Employee("Rohit", 55000.0, "Delhi"),
	            new Employee("Sneha", 52000.0, "Chennai"),
	            new Employee("Tarun", 59000.0, "Hyderabad"),
	            new Employee("Vani", 53000.0, "Bangalore"),
	            new Employee("Yuvraj", 60000.0, "Pune"),
	            new Employee("Zara", 61000.0, "Delhi"));
		
		
//		List<Employee> isEmployeeSaved = empRepo.saveAll(listOfEmps);
		
//		if(isEmployeeSaved != null)
//		{
//			  System.out.println("✅ 100 Employee records inserted successfully!");
//		}
		
		
	}
	
	

}
