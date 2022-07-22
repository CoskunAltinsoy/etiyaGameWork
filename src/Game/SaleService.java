package Game;

public interface SaleService {
	void buy(Game game, Player player, Campaign campaign);
	void buyWithoutCampaign(Game game, Player player);

}
