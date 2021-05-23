package kodlamaio.hrms.business.concretes;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.adapters.abstracts.CandidateCheckService;
import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidate;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class CandidateManager implements CandidateService{
	
	@Autowired
	private CandidateDao candidateDao;
	private CandidateCheckService candidateCheckService;
	
	
	public CandidateManager(CandidateCheckService candidateCheckService) {
		this.candidateCheckService = candidateCheckService;
	}

	@Override
	public void register(Candidate candidate) {
		List<Integer> tcNoList = getTcNos();
		List<String> emailList = getEmails();
		
		if(candidateCheckService.checkIfRealPerson(candidate)) {
			
			if(tcNoList.contains(candidate.getIdentityNumber()) || emailList.contains(candidate.getEmail())) {
				System.out.println("Kayit basarisiz. Tc no veya email zaten kullanımda!");
			}
			else {
				this.candidateDao.save(candidate);
				System.out.println("kayit basarili.");
				sendVerificationEmail();
			}
			
						
		}
		else System.out.println(candidate.getFirstName() + "'nın Mernis doğrulaması başarısız.");
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
	
	public List<Integer> getTcNos() {
		 List<Candidate> list = new ArrayList<>();
		 List<Integer> tcNoList = new ArrayList<>();
		 list = this.candidateDao.findAll();
		 for(Candidate candidate : list) {
			 tcNoList.add(candidate.getIdentityNumber());
		 }
		 return tcNoList;
	}
	
	public void sendVerificationEmail() {
		System.out.println("Dogrulama epostası gönderildi.");
	}

}
