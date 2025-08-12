package in.thiruit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatasourceConfig {

	public DatasourceConfig() {
		System.out.println("DatasourceConfig :: Constructor");
	}
	
	

	@Bean
	public DatasourceConfig getDatasourceConfig()
	{
		//CUSTOM LOGIC
		System.out.println("getDatasourceConfig() :: Method");
		
		DatasourceConfig dataConfig=new DatasourceConfig();
		
		return dataConfig;
	}

}
