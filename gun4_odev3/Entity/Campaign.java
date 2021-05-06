package project.Entity;

public class Campaign {
	private String campaignName;
	private int discountRate;
	private int earnedPoints;
	public Campaign(String campaignName, int discountRate, int earnedPoints) {
		this.campaignName = campaignName;
		this.discountRate = discountRate;
		this.earnedPoints = earnedPoints;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public int getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	public int getEarnedPoints() {
		return earnedPoints;
	}
	public void setEarnedPoints(int earnedPoints) {
		this.earnedPoints = earnedPoints;
	}

}
