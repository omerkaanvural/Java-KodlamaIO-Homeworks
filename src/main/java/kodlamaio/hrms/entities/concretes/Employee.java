package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper=false)
@Entity
@Data
@NoArgsConstructor
@Table(name="employees")
public class Employee extends User{
	
	@NotBlank(message="this field have to be filled.")
	@Column(name="first_name", nullable=false)
	private String firstName;
	
	@NotBlank(message="this field have to be filled.")
	@Column(name="last_name", nullable=false)
	private String lastName;
	
	public Employee(int id, String email, String password, String firstName, String lastName) {
		super(id, email, password);
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
}
