package kodlamaio.hrms.adapters.concretes;

import org.springframework.stereotype.Component;

import kodlamaio.hrms.adapters.abstracts.CommonCheckService;
import kodlamaio.hrms.entities.concretes.User;

@Component("EmailValidation")
public class EmailValidationManager implements CommonCheckService{

	@Override
	public boolean sendVerificationEmail(User user) {
		System.out.println(user.getEmail() + "adresine dogrulama epostasi gönderildi.");
		System.out.println(user.getEmail() + "adresine sahip kullanici, hesabini dogruladi.");
		return true;
	}

}
