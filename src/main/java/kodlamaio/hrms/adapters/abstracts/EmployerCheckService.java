package kodlamaio.hrms.adapters.abstracts;

import kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerCheckService {
	boolean checkEmployer(Employer employer);
}
