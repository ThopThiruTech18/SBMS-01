package in.thiruit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.thiruit.config.KafkaConfig;
import in.thiruit.config.RabbitMqConfig;
import in.thiruit.config.RedisConfig;
import in.thiruit.config.SecurityConfig;

@Configuration
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig :: Constructor");
	}

	@Bean
	KafkaConfig getKafkaConfig() {
		System.out.println("getKafkaConfig ::  method  : STARTED");

		KafkaConfig kconfig = new KafkaConfig();
		
		System.out.println("getKafkaConfig ::  method : ENDED");

		return kconfig;
	}

	@Bean
	RabbitMqConfig getRabbitMqConfig() {

		System.out.println("getRabbitMqConfig ::  method   : STARTED");
		RabbitMqConfig rconfig = new RabbitMqConfig();
		System.out.println("getRabbitMqConfig ::  method : ENDED");

		return rconfig;
	}

	@Bean
	RedisConfig getRedisConfig() {

		System.out.println("getRedisConfig ::  method   : STARTED");
		RedisConfig rconfig = new RedisConfig();
		System.out.println("getRedisConfig ::  method : ENDED");
		return rconfig;
	}

	@Bean
	SecurityConfig getSecurityConfig() {

		System.out.println("getSecurityConfig ::  method   : STARTED");
		SecurityConfig secConfig = new SecurityConfig();
		System.out.println("getSecurityConfig ::  method : ENDED");

		return secConfig;
	}

}
