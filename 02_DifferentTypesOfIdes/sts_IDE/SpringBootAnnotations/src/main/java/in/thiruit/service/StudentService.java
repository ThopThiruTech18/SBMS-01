package in.thiruit.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class StudentService {
	
	
	public StudentService() {
		System.out.println("StudentService :: Constructor");
	}

}
