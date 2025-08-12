package in.thiruit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.thiruit.config.KafkaConfig;
import in.thiruit.config.RabbitMqConfig;

@Configuration
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig :: Constructor");
	}
	
	
    @Bean
	KafkaConfig getKafkaConfig()
	{
    	System.out.println("getKafkaConfig ::  method");
    	
		KafkaConfig kconfig=new KafkaConfig();
		
		return kconfig;
	}
	
	
   @Bean
	RabbitMqConfig getRabbitMqConfig()
	{
	   
	   System.out.println("getRabbitMqConfig ::  method");
		RabbitMqConfig rconfig=new RabbitMqConfig();
		
		return rconfig;
	}
	
	
	
	

}
