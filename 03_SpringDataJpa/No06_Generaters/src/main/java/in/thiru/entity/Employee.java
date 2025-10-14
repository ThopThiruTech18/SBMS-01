package in.thiru.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString

@Entity
@Table(name = "employee_table1")
public class Employee {

	@Id
	private Integer empId; // emp_id

	@Column(name = "empName")
	private String empNam; // emp_name employeeName

	private Double empSalary;// emp_salary

	public Employee(Integer empId, String empNam, Double empSalary) {

		this.empId = empId;
		this.empNam = empNam;
		this.empSalary = empSalary;
	}

	@CreationTimestamp
	@Column(name = "created_date", updatable = false)
	private LocalDateTime createdDate;

	
	@UpdateTimestamp
	@Column(name = "updated_date", insertable = false)
	private LocalDateTime updatedDate;

}
