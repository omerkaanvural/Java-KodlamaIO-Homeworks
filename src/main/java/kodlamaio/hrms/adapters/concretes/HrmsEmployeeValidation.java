package kodlamaio.hrms.adapters.concretes;

import org.springframework.stereotype.Component;

import kodlamaio.hrms.adapters.abstracts.EmployerCheckService;
import kodlamaio.hrms.entities.concretes.Employer;

@Component("EmployeeOnay")
public class HrmsEmployeeValidation implements EmployerCheckService{

	@Override
	public boolean checkEmployer(Employer employer) {
		// assuming
		System.out.println("HRMS calisaninin onayi alindi");
		return true;
	}

}
