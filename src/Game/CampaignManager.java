package Game;

import java.util.List;

public class CampaignManager implements CampaignService{

	List<Campaign> campaigns;
	
	public CampaignManager(List<Campaign> campaigns) {
		this.campaigns = campaigns;
	}

	@Override
	public void add(Campaign campaign) {
		campaigns.add(campaign);		
	}

	@Override
	public void delete(Campaign campaign) {
		campaigns.remove(getById(campaign.getId()));
	}

	@Override
	public void update(Campaign campaign) {
		Campaign campaignToUpdate = getById(campaign.getId());
		campaignToUpdate.setName(campaign.getName());
		campaignToUpdate.setDiscount(campaign.getDiscount());
		
	}

	@Override
	public List<Campaign> getAll() {
		return campaigns;
	}
	
	private Campaign getById(int id) {
		Campaign getToCampaign = null;
		for (Campaign item : campaigns) {
			if(item.getId()==id) {
				getToCampaign = item;
			}
		}
		return getToCampaign;
	}

	
	
}
