package in.thiru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.thiru.entity.Employee;
import in.thiru.entity.EmployeePK;
import in.thiru.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo empRepo;

	public void saveEmployee()
	{

		
		EmployeePK empPk=new EmployeePK();
		empPk.setEmpId(1001);
		empPk.setEmpName("Chiru");
		
		
		Employee emp=new Employee();
		emp.setEmpSal(100000.0);
		
		emp.setEmpPk(empPk);
		
		
		Employee save = empRepo.save(emp);
		
		if(save != null)
		{
			System.out.println("Employee Data Inserted Successfully");
		}
		else
		{
			System.out.println("Failed to insert the Employee Data");
		}
		
	}

}
