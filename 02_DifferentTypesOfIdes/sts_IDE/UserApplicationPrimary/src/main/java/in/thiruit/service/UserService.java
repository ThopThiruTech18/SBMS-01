package in.thiruit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.thiruit.repo.IUserRepository;

@Service
public class UserService {

	IUserRepository userRepo;

	// alt + shift + sr

	@Autowired
	public void setUserRepo(IUserRepository userRepo) {
		System.out.println(userRepo.getClass().getName());
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
