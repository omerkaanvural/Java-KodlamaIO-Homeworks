package kodlamaio.hrms.business.concretes;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.adapters.abstracts.CommonCheckService;
import kodlamaio.hrms.adapters.abstracts.EmployerCheckService;
import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilites.result.DataResult;
import kodlamaio.hrms.core.utilites.result.ErrorResult;
import kodlamaio.hrms.core.utilites.result.Result;
import kodlamaio.hrms.core.utilites.result.SuccessDataResult;
import kodlamaio.hrms.core.utilites.result.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
public class EmployerManager implements EmployerService{
	
	@Autowired
	private EmployerDao employerDao;
	private EmployerCheckService employerCheckService;
	private CommonCheckService commonCheckService;
	
	
	public EmployerManager(EmployerDao employerDao, @Qualifier("EmployeeOnay") EmployerCheckService employerCheckService, @Qualifier("EmailValidation") CommonCheckService commonCheckService) {
		super();
		this.employerDao = employerDao;
		this.employerCheckService = employerCheckService;
		this.commonCheckService = commonCheckService;
	}
	
	
	@Override
	public Result register(Employer employer) {
		// TODO Auto-generated method stub
		List<String> emailList = getEmails();
		if(employerCheckService.checkEmployer(employer) && commonCheckService.sendVerificationEmail(employer) && !emailList.contains(employer.getEmail())) {
			this.employerDao.save(employer);
			return new SuccessResult("employer kaydedildi.");
		}
		else {
			return new ErrorResult("employer kaydedilemedi");
		}
	}
	
	public List<String> getEmails() {
		 List<Employer> list = new ArrayList<>();
		 List<String> emailList = new ArrayList<>();
		 list = this.employerDao.findAll();
		 for(Employer employer: list) {
			 emailList.add(employer.getEmail());
		 }
		 return emailList;
	}

	@Override
	public DataResult<List<Employer>> getEmployers() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "data is listed");
	}

	

}
