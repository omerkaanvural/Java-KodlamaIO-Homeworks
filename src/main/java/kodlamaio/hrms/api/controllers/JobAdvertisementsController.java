package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilites.result.DataResult;
import kodlamaio.hrms.core.utilites.result.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("api/jobadvertisements")
public class JobAdvertisementsController {
	
	@Autowired
	private JobAdvertisementService jobAdvertisementService;
	
	@GetMapping("api/getjobadvertisement")
	public DataResult<List<JobAdvertisement>> getAll() {
		return this.jobAdvertisementService.getAll();
	}
	
	@PostMapping("api/addjobadvertisement")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	
	@GetMapping("getByCity")
	public DataResult<JobAdvertisement> getByCity(@RequestParam int cityId){
		return null;
	}
	
	@GetMapping("getAllByPage")
	public DataResult<List<JobAdvertisement>> getAll(int pageNo, int pageSize){
		return this.jobAdvertisementService.getAll(pageNo, pageSize);
	}
}
