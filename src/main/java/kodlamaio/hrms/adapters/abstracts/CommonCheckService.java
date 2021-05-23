package kodlamaio.hrms.adapters.abstracts;

import kodlamaio.hrms.entities.concretes.User;

public interface CommonCheckService {
	boolean sendVerificationEmail(User user);
}