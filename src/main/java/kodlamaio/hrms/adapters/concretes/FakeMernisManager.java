package kodlamaio.hrms.adapters.concretes;

import org.springframework.stereotype.Component;

import kodlamaio.hrms.adapters.abstracts.CandidateCheckService;
import kodlamaio.hrms.core.utilites.result.Result;
import kodlamaio.hrms.core.utilites.result.SuccessResult;
import kodlamaio.hrms.entities.concretes.Candidate;

@Component("FakeMernis")
public class FakeMernisManager implements CandidateCheckService{

	@Override
	public Result checkIfRealPerson(Candidate candidate) {
		// TODO Auto-generated method stub
		return new SuccessResult("fake mernis gecisi tamamlandi.");
	}

}
