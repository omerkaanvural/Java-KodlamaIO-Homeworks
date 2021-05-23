package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity // you are a database object bro
@Data
@Table(name="users")
public abstract class User {
	
	@Id // islemleri id'ye gore yapmasi gerektigini belirtiyoruz
	@GeneratedValue(strategy=GenerationType.IDENTITY) // otomatik artirildigini belirttik
	@Column(name="id")
	private int id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	public User() {}
	
	public User(int id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}
}
