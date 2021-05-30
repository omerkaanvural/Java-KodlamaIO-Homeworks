package kodlamaio.hrms.adapters.concretes;

import java.rmi.RemoteException;

import org.springframework.stereotype.Component;

import kodlamaio.hrms.adapters.abstracts.CandidateCheckService;
import kodlamaio.hrms.core.utilites.result.ErrorResult;
import kodlamaio.hrms.core.utilites.result.Result;
import kodlamaio.hrms.core.utilites.result.SuccessResult;
import kodlamaio.hrms.entities.concretes.Candidate;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Component("Mernis")
public class MernisCheckManager implements CandidateCheckService{

	@Override
	public Result checkIfRealPerson(Candidate candidate) {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(candidate.getIdentityNumber()), candidate.getFirstName().toUpperCase(), candidate.getLastName().toUpperCase(), candidate.getBirthYear());
			if (result) {
				return new SuccessResult("Mernis doğrulama başarılı.");
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ErrorResult("Mernis doğrulama başarısız.");
	}

}
