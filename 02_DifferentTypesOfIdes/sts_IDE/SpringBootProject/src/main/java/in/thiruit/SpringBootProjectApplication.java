package in.thiruit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootProjectApplication.class, args);
		
		
		
		int beanDefinitionCount = run.getBeanDefinitionCount();
		System.out.println("Total classes loding in to the JVM by IOC : "+beanDefinitionCount);
		
//		String[] beanDefinitionNames = run.getBeanDefinitionNames();
//		
//		int num=1;
//		
//		for (String beanNames : beanDefinitionNames) {
//			
//			System.out.println(num+" : "+beanNames);
//			
//			num++;
//			
//		}
		
		
		
	}
	
	
	
	
	

}
