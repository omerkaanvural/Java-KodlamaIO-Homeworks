package kodlamaio.hrms.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilites.result.DataResult;
import kodlamaio.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("api/employers")
public class EmployersController {
	
	private EmployerService employerService;
	
	@Autowired
	public EmployersController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@GetMapping("/getemployers")
	public DataResult<List<Employer>> getAll(){
		return this.employerService.getEmployers();
	}
	
	@PostMapping("/addemployer")
	public void add(@Valid @RequestBody Employer employer) {
		this.employerService.register(employer);
	}

}