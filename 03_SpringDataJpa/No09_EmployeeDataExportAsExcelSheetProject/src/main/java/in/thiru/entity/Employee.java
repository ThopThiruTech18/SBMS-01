package in.thiru.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@Table(name = "emp_excel_table")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empId;
	private String empName;
	private Double empSal;
	private String empLoc;
	public Employee(String empName, Double empSal, String empLoc) {
		this.empName = empName;
		this.empSal = empSal;
		this.empLoc = empLoc;
	}
	
	
	
	

}
