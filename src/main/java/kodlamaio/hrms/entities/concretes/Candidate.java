package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper=false)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="candidates")
//@PrimaryKeyJoinColumn(name = "id")
public class Candidate extends User{
	
	@NotBlank(message="this field have to be filled.")
	@Column(name="first_name")
	private String firstName;
	
	@NotBlank(message="this field have to be filled.")
	@Column(name="last_name")
	private String lastName;
	
	
	@NotBlank(message="this field have to be filled.")
	@Column(name="identity_number")
	@Size(min = 11, max = 11, message="invalid length")
	private String identityNumber;
	
	@Column(name="birth_year")
	private int birthYear;
	
}