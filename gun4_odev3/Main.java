package project;

import project.Abstract.CampaignService;
import project.Concrete.CampaignManager;
import project.Concrete.CustomerManager;
import project.Concrete.MernisCheckManager;
import project.Concrete.SaleManager;
import project.Concrete.SimpleCheckManager;
import project.Entity.Campaign;
import project.Entity.Customer;
import project.Entity.Game;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer("ömer kaan", "vural", 29932364738L, 1999);
		Customer customer2 = new Customer("engin", "demirog", 12345678901L, 1986);
		
		CustomerManager customerManager1 = new CustomerManager(new MernisCheckManager());
		CustomerManager customerManager2 = new CustomerManager(new SimpleCheckManager());
		
 		customerManager1.save(customer);
		customerManager1.save(customer2);
		
		customerManager2.save(customer2);
		customerManager2.save(customer);
		
		
		Game game1 = new Game("1", "Cyberpunk", 200);
        Game game2 = new Game("2", "Red Dead Redemption 2", 150);
        Game game3 = new Game("3", "Detroit: Become Human", 100);
        
        Campaign campaign1 = new Campaign("Super Campaign",10, 10);
        Campaign campaign2 = new Campaign("Mega Campaign", 20, 8);
        Campaign campaign3 = new Campaign("Mini Campaign", 5, 3);
		
		CampaignService campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.add(campaign2);
		campaignManager.add(campaign3);
		
		campaignManager.delete(campaign2);
		
		campaignManager.update(campaign1);
		
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(customer, campaign2, game3);
		saleManager.sale(customer2, campaign1, game1);
		
	}

}
