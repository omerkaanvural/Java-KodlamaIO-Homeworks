package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilites.result.DataResult;
import kodlamaio.hrms.core.utilites.result.Result;
import kodlamaio.hrms.entities.concretes.Candidate;

public interface CandidateService {
	Result register(Candidate candidate);
	DataResult<List<Candidate>> getCandidates();
}
