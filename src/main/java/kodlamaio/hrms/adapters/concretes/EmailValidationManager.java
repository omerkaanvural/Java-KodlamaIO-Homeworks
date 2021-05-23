package kodlamaio.hrms.adapters.concretes;

import kodlamaio.hrms.adapters.abstracts.CommonCheckService;
import kodlamaio.hrms.entities.concretes.User;

public class EmailValidationManager implements CommonCheckService{

	@Override
	public boolean sendVerificationEmail(User user) {
		System.out.println(user.getEmail() + "adresine dogrulama epostasi gönderildi.");
		System.out.println(user.getEmail() + "adresine sahip kullanici, hesabini dogruladi.");
		return true;
	}

}
