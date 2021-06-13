package kodlamaio.hrms.business.concretes;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.adapters.abstracts.CandidateCheckService;
import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.utilites.result.DataResult;
import kodlamaio.hrms.core.utilites.result.ErrorResult;
import kodlamaio.hrms.core.utilites.result.Result;
import kodlamaio.hrms.core.utilites.result.SuccessDataResult;
import kodlamaio.hrms.core.utilites.result.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidate;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
public class CandidateManager implements CandidateService{
	
	
	private CandidateDao candidateDao;
	private CandidateCheckService candidateCheckService;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao, @Qualifier("FakeMernis") CandidateCheckService candidateCheckService) {
		this.candidateDao = candidateDao;
		this.candidateCheckService = candidateCheckService;
	}

	@Override
	public Result register(Candidate candidate) {
		List<String> tcNoList = getTcNos();
		List<String> emailList = getEmails();
		
		if(candidateCheckService.checkIfRealPerson(candidate).isSuccess()) {
			
			if(tcNoList.contains(candidate.getIdentityNumber()) || emailList.contains(candidate.getEmail())) {
				return new ErrorResult("Candidate could not be added. He/She is already in db.");
			}
			else {
				this.candidateDao.save(candidate);
				sendVerificationEmail();
				return new SuccessResult("candidate is added.");
			}
						
		}
		return  new ErrorResult("Mernis validation failed.");
	}
	
	
	
	public List<String> getEmails() {
		 List<Candidate> list = new ArrayList<>();
		 List<String> emailList = new ArrayList<>();
		 list = this.candidateDao.findAll();
		 for(Candidate candidate : list) {
			 emailList.add(candidate.getEmail());
		 }
		 return emailList;
	}
	
	public List<String> getTcNos() {
		 List<Candidate> list = new ArrayList<>();
		 List<String> tcNoList = new ArrayList<>();
		 list = this.candidateDao.findAll();
		 for(Candidate candidate : list) {
			 tcNoList.add(candidate.getIdentityNumber());
		 }
		 return tcNoList;
	}
	
	public void sendVerificationEmail() {
		System.out.println("Dogrulama epostası gönderildi.");
	}

	@Override
	public DataResult<List<Candidate>> getCandidates() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(), "data is listed");
			
	}

}
