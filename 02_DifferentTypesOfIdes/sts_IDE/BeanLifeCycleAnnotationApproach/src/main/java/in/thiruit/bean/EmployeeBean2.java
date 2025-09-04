package in.thiruit.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class EmployeeBean2 implements DisposableBean,InitializingBean{

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Object is created  for:: EmployeeBean ");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Object is destroy  for:: EmployeeBean ");
		
	}
	
	public void printName1(String name)
	{
		System.out.println("Your name is  :"+name);
	}
	
	public void printWelcome(String name)
	{
		System.out.println("Welecom  :"+name);
	}
	
	
	

}
