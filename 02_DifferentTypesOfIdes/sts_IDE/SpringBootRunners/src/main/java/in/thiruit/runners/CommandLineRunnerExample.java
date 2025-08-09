package in.thiruit.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerExample implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Load the data from the database :: CommandLineRunner");
		
	}

}
