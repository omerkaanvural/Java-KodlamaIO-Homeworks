package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilites.result.DataResult;
import kodlamaio.hrms.core.utilites.result.Result;
import kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerService {
	Result register(Employer employer);
	DataResult<List<Employer>> getEmployers();
}
