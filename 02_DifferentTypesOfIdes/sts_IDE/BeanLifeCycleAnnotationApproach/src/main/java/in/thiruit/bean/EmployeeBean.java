package in.thiruit.bean;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//@Component
public class EmployeeBean {
	
	
	public EmployeeBean() {
		System.out.println("EmployeeBean  :: Constructor");
	}
	
	public void printName1(String name)
	{
		System.out.println("Your name is  :"+name);
	}
	
	public void printWelcome(String name)
	{
		System.out.println("Welecom  :"+name);
	}
	
	
	
	@PreDestroy
	public void destroyObject()
	{
		System.out.println("Object is destroy  for:: EmployeeBean ");
	}
	
	
	@PostConstruct
	public void createObject()
	{
		System.out.println("Object is created  for:: EmployeeBean ");
	}
	
	
	


}
