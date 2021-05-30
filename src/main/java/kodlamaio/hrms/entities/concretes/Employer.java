package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="employers")
public class Employer extends User{
	
	@NotBlank(message="this field have to be filled.") 
	@Column(name="company_name") 
	private String companyName;
	
	@NotBlank(message="this field have to be filled.")
	@Column(name="web_address")
	private String webAddress;
	
	@Size(min=12, max=12, message="phone number length must be 12")
	@NotBlank(message="this field have to be filled.")
	@Column(name="phone_number")
	private String phoneNumber;
	
	
}
