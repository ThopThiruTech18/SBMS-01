package in.thiru.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Employee_Composite_Table")
@Setter
@Getter
public class Employee {

	private Double empSal;

	@EmbeddedId
	private EmployeePK empPk;
}
