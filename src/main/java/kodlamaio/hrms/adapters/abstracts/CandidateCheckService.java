package kodlamaio.hrms.adapters.abstracts;

import kodlamaio.hrms.core.utilites.result.Result;
import kodlamaio.hrms.entities.concretes.Candidate;

public interface CandidateCheckService {
	Result checkIfRealPerson(Candidate candidate);
}