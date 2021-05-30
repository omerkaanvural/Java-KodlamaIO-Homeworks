package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="users")
public abstract class User {
	
	@Id // islemleri id'ye gore yapmasi gerektigini belirtiyoruz
	@GeneratedValue(strategy=GenerationType.IDENTITY) // otomatik artirildigini belirttik
	@Column(name="id")
	private int id;
	
	@Email(message="email is not valid")
	@NotBlank(message="this field have to be filled.")
	@Column(name="email")
	private String email;
	
	@Size(min=5)
	@NotBlank(message="this field have to be filled.")
	@Column(name="password")
	private String password;
	
	@Transient
	private String passwordAgain;
	
	public User(int id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}
}
