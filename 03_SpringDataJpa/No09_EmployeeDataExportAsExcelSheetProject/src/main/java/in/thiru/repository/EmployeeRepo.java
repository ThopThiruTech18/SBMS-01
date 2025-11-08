package in.thiru.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.thiru.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	@Query("From Employee")
	public List<Employee> getAllEmployeeHQL();

	@Query(value = "SELECT * FROM emp_excel_table;", nativeQuery = true)
	public List<Employee> getAllEmployeeSQL();

	@Query(value = "Select * from emp_excel_table WHERE emp_id = :id", nativeQuery = true)
	public Employee getEmployeeSQL(Integer id);

}
