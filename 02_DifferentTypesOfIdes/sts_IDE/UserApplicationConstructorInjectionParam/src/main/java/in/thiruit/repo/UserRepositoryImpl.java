package in.thiruit.repo;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements IUserRepository {
	
	public UserRepositoryImpl() {
	System.out.println("UserRepositoryImpl ; Constructor");
	}

	@Override
	public String findNameById(Integer id) {

		if (id.equals(100)) {
			return "Thiru";
		} else if (id.equals(200)) {
			return "Hari";
		} else {

			return "Please provide the valid input";
		}
	}

}
