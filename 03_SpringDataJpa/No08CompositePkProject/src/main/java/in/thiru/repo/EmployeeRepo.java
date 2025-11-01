package in.thiru.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.thiru.entity.Employee;
import in.thiru.entity.EmployeePK;

public interface EmployeeRepo extends JpaRepository<Employee, EmployeePK>{

}
