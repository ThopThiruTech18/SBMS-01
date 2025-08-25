package in.thiruit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.thiruit.repo.IUserRepository;

@Service
public class UserService {

	
	IUserRepository userRepo;
	
	public UserService(@Qualifier("mysql")  IUserRepository userRepo) {
		this.userRepo = userRepo;
	}

	public UserService() {
		System.out.println("UserService  : Constructor");
	}

	public void getNameById(Integer id) {
		String userName = userRepo.findNameById(id);

		System.out.println("Name of the user : " + userName);
	}

}
