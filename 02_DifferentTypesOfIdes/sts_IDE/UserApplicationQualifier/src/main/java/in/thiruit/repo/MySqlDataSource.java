package in.thiruit.repo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("mysql")
public class MySqlDataSource implements IUserRepository {
	
	public MySqlDataSource() {
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
