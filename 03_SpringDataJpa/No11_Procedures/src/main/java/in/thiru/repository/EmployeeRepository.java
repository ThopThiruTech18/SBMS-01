package in.thiru.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.transaction.annotation.Transactional;

import in.thiru.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Transactional(readOnly = true)
	@Procedure("get_all_employees")
	public List<Employee> getAllEmployees();

}
