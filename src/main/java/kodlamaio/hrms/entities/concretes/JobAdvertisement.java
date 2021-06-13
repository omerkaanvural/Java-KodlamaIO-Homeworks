package kodlamaio.hrms.entities.concretes;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper=false)
@Entity
@Data
@Table(name="job_advertisements")
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="job_advertisement_id")
	private int jobAdvertisementId;
	
	@NotBlank(message="description field have to be filled.")
	@Column(name="description")
	private String description;

	@Column(name="min_salary")
	private int minSalary;
	
	@Column(name="max_salary")
	private int maxSalary;
	
	@Range(min = 1, message= "salary may not be empty or null")
	@Column(name="number_of_available_pos")
	private int numberOfAvailablePos;
	
	@Column(name="application_deadline")
	private Date applicationDeadline;
	
	@Column(name="is_active")
	private boolean isActive = false;
	
	@ManyToOne()
	@JoinColumn(name = "job_position_id")
	private Job job;
	
	@NotBlank(message="city field have to be filled.")
	@ManyToOne()
	@JoinColumn(name = "job_city_id")
	private City city;
	
	@ManyToOne()
	@JoinColumn(name = "job_employer_id")
	private Employer employer;
	
	
}
