package kodlamaio.hrms.business.concretes;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.adapters.abstracts.CommonCheckService;
import kodlamaio.hrms.adapters.abstracts.EmployerCheckService;
import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	
	private EmployerDao employerDao;
	private EmployerCheckService employerCheckService;
	private CommonCheckService commonCheckService;
	
	@Override
	public void register(Employer employer) {
		// TODO Auto-generated method stub
		List<String> emailList = getEmails();
		if(employerCheckService.checkEmployer(employer) && commonCheckService.sendVerificationEmail(employer) && !emailList.contains(employer.getEmail())) {
			this.employerDao.save(employer);
			System.out.println("employer kaydedildi.");
		}
		else {
			System.out.println("hata olustu!");
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

}
