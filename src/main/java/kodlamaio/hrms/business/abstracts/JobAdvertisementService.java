package kodlamaio.hrms.business.abstracts;

import java.util.List;


import kodlamaio.hrms.core.utilites.result.DataResult;
import kodlamaio.hrms.core.utilites.result.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	DataResult<List<JobAdvertisement>> getAll();
	DataResult<List<JobAdvertisement>> getAll(int pageNo, int pageSize);
	Result add(JobAdvertisement jobAdvertisement);
	DataResult<List<JobAdvertisement>> getByCity_CityId(int cityId);
}
