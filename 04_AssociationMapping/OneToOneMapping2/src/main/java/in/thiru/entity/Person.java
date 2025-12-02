package in.thiru.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer personId;
	private String name;
	private double age;

	@OneToOne(mappedBy = "person")
	private Adhar adhar;

	public Person(Integer personId, String name, double age, Adhar adhar) {
		super();
		this.personId = personId;
		this.name = name;
		this.age = age;
		this.adhar = adhar;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public Adhar getAdhar() {
		return adhar;
	}

	public void setAdhar(Adhar adhar) {
		this.adhar = adhar;
	}

}
