package in.thiru.repository;

import org.springframework.data.repository.CrudRepository;

import in.thiru.entity.Employee;
import java.util.List;


public interface EmployeeRepository  extends CrudRepository<Employee, Integer>{


	
	List<Employee> findByEmpNam(String empName);
	
  


}
