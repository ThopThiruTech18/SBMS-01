package in.thiru.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
public class Employee {

	@Id
	private Integer empId;  //emp_id
	
	@Column(name="empName")
	private String empNam;  //emp_name employeeName
	
	
	private Double empSalary;//emp_salary

}
