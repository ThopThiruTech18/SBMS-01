package in.thiruit.repo;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepo {
	
	public StudentRepo() {
		System.out.println("StudentRepo :: Constructor");
	}

}
