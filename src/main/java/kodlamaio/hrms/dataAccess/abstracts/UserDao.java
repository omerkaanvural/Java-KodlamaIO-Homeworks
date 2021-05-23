package kodlamaio.hrms.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.User;


// entity annotasyonu ile süslenmiş user için pk alanında ne olduğunu veriyoruz (Integer) ki intellisense ona göre çalışsın
public interface UserDao extends JpaRepository<User, Integer>{

}
