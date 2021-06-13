package kodlamaio.hrms.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobService;
import kodlamaio.hrms.dataAccess.abstracts.JobDao;
import kodlamaio.hrms.entities.concretes.Job;

@Service
public class JobManager implements JobService {
	
	@Autowired
	private JobDao jobDao;
	
	@Override
	public List<Job> getAll() {
		// TODO Auto-generated method stub
		return jobDao.findAll();
	}

	@Override
	public void addJob(Job job) {
		// TODO Auto-generated method stub
		List<String> jobTitles = getJobs();
		if(jobTitles.contains(job.getPositionName())) {
			System.out.println("bu is dali zaten listede var!");
		}
		
		else this.jobDao.save(job);
	}
	
	public List<String> getJobs() {
		List<Job> jobList = this.jobDao.findAll();
		List<String> jobTitles = new ArrayList<>();
		
		for(Job job : jobList) {
			jobTitles.add(job.getPositionName());
		}
		return jobTitles;
	}

}
