package kodlamaio.hrms.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.utilites.result.DataResult;
import kodlamaio.hrms.entities.concretes.Candidate;

@RestController
@RequestMapping("api/candidates")
public class CandidatesController {
	private CandidateService candidateService;
	
	@Autowired
	public CandidatesController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
		
	}
	
	@GetMapping("/getcandidates")
	public DataResult<List<Candidate>> getAll(){
		return this.candidateService.getCandidates();
	}
	
	@PostMapping("/addcandidate")
	public void add(@Valid @RequestBody Candidate candidate) {
		this.candidateService.register(candidate);
	}

}
