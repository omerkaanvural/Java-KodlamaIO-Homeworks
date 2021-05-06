package project.Concrete;
import java.rmi.RemoteException;

import project.Abstract.CustomerCheckService;
import project.Entity.Customer;
import tr.gov.nvi.tckimlik.WS.*;


public class MernisCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = kpsPublic.TCKimlikNoDogrula(customer.getTcNo(), customer.getName().toUpperCase(), customer.getSurname().toUpperCase(), customer.getBirthYear());
			if (result) {
				System.out.println("Mernis doðrulama baþarýlý.");
				return true;
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Mernis doðrulama baþarýsýz.");
		return false;
	}

}
