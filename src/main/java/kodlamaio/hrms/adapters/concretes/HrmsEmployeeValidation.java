package kodlamaio.hrms.adapters.concretes;

import kodlamaio.hrms.adapters.abstracts.EmployerCheckService;
import kodlamaio.hrms.entities.concretes.Employer;

public class HrmsEmployeeValidation implements EmployerCheckService{

	@Override
	public boolean checkEmployer(Employer employer) {
		// assuming
		System.out.println("HRMS calisaninin onayi alindi");
		return true;
	}

}
