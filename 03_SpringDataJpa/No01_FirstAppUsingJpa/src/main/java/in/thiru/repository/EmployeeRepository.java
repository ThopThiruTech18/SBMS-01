package in.thiru.repository;

import org.springframework.data.repository.CrudRepository;

import in.thiru.entity.Employee;

public interface EmployeeRepository  extends CrudRepository<Employee, Integer>{

}
