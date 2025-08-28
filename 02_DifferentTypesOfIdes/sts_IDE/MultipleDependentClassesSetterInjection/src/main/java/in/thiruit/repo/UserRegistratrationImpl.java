package in.thiruit.repo;

import org.springframework.stereotype.Repository;

@Repository
public class UserRegistratrationImpl implements IUserRepository{

	@Override
	public boolean register(String email, String password, String name) {
		System.out.println("register() started");
		boolean isRegister=true;
		System.out.println("register() started");
		
		return isRegister;
	}

	

}
