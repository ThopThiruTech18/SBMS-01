package in.thiru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.thiru.entity.Employee;
import in.thiru.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;

	public void saveEmployee() {
		Employee emp = new Employee();

		emp.setName("Sunny");
		emp.setSalary(1000.00);

		empRepo.save(emp);
	}

}
