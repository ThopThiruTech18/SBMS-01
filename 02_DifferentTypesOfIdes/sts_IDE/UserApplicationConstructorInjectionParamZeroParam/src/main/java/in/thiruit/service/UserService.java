package in.thiruit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.thiruit.repo.IUserRepository;

@Service
public class UserService {

	IUserRepository userRepo;

	// alt + shift + sr
	// alt + shift + so->co

//	@Autowired
//	public void setUserRepo(IUserRepository userRepo) {
//		this.userRepo = userRepo;
//	}
 
	@Autowired
	public UserService(IUserRepository userRepo) {
		System.out.println("PARAM");
		this.userRepo = userRepo;
	}
	
	public UserService() {
		System.out.println("O-PARAM");
	}

	public void getNameById(Integer id) {
		String userName = userRepo.findNameById(id);

		System.out.println("Name of the user : " + userName);
	}

}
