package kodlamaio.hrms.adapters.concretes;

import java.rmi.RemoteException;

import kodlamaio.hrms.adapters.abstracts.CandidateCheckService;
import kodlamaio.hrms.entities.concretes.Candidate;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public abstract class MernisCheckManager implements CandidateCheckService{

	@Override
	public boolean checkIfRealPerson(Candidate candidate) {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = kpsPublic.TCKimlikNoDogrula(candidate.getIdentityNumber(), candidate.getFirstName().toUpperCase(), candidate.getLastName().toUpperCase(), candidate.getBirthYear());
			if (result) {
				System.out.println("Mernis doğrulama başarılı.");
				return true;
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Mernis doğrulama başarısız.");
		return false;
	}

}
