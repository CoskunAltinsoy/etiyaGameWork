package Game;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Player player1 = new Player(1, "Mücahit Coşkun", "Altınsoy", "12345678912",1996);
		PlayerManager playerManager = new PlayerManager(new ArrayList<Player>(),new MernisServiceAdapter());
		playerManager.add(player1);
		
		for (Player player : playerManager.getAll()) {
			System.out.println(player.getId()+" "+player.getFirstName()+" "+player.getLastName()+" "+player.getIdentity());
		}
		
		Game game1 = new Game(1, "Fifa2020", 200);
		
		Campaign campaign1 = new Campaign(1, "Yılbaşı indirimi", 30);
		CampaignManager campaignManager = new CampaignManager(new ArrayList<Campaign>());
		campaignManager.add(campaign1);
		campaignManager.delete(campaign1);
		
		for (Campaign campaign : campaignManager.getAll()) {
			System.out.println(campaign.getId()+" "+ campaign.getName()+" "+campaign.getDiscount());
		}
		
		SaleManager saleManager = new SaleManager();
		saleManager.buy(game1, player1, campaign1);
		saleManager.buyWithoutCampaign(game1, player1);

	}

}
