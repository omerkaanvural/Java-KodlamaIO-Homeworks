package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@Entity
@Data
@Table(name="employees")
public class Employee extends User{
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	public Employee(int id, String email, String password, String firstName, String lastName) {
		super(id, email, password);
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
}
