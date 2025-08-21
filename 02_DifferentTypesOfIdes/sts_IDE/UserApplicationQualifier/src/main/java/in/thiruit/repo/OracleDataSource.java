package in.thiruit.repo;

import org.springframework.stereotype.Component;

@Component("oracle")
public class OracleDataSource implements IUserRepository {
	
	public OracleDataSource() {
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
