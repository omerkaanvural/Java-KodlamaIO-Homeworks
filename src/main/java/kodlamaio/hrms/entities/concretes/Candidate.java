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
public class Candidate extends User{
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="identity_number")
	private int identityNumber;
	
	@Column(name="birth_year")
	private int birthYear;
	
	public Candidate(int id, String email, String password, String firstName, String lastName, int identityNumber, int birthYear) {
		super(id, email, password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthYear = birthYear;
	}
	
}