package project.Concrete;

import project.Entity.Campaign;
import project.Entity.Customer;
import project.Entity.Game;

public class SaleManager {
	public SaleManager() {}
	public void sale(Customer customer, Campaign campaign, Game game) {
		System.out.println(game.getName() + " is sold to " + customer.getName().toUpperCase() + " with '" + 
		campaign.getCampaignName() + "' (%" + campaign.getDiscountRate() + " discount)");
	}
}
