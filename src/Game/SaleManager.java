package Game;

import java.util.ArrayList;
import java.util.List;

public class SaleManager implements SaleService{

	@Override
	public void buy(Game game, Player player, Campaign campaign) {
		System.out.println(game.getName()+":"+ player.getFirstName()+"adlı kullanıcıya"
				+ campaign.getDiscount()+"indirim ile"+ game.getPrice() +"fiyat yerine"
				+ (game.getPrice()-(campaign.getDiscount()*(game.getPrice()/100)))+"Tl ye satılmıştır.");		
	}

	@Override
	public void buyWithoutCampaign(Game game, Player player) {
		System.out.println(game.getName()+":"+player.getFirstName()+"adlı kullanıcıya"
				+game.getPrice()+"Tlye satılmıştır");
		
	}

	

}
