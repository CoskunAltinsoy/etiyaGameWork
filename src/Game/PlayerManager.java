package Game;

import java.util.ArrayList;
import java.util.List;


public class PlayerManager implements PlayerService{
	
	List<Player> players;
	PlayerCheckService playerCheckService;
	public PlayerManager(List<Player> players, PlayerCheckService playerCheckService) {
		this.players = players;
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void add(Player player) {
		if (checkIfCourseDescriptionNull(player.getFirstName()) 
				&& playerCheckService.checkIfRealPerson(player)) {
			players.add(player);
		} else {
			System.out.println("Açıklama alanı boş geçilemez");
		}
		
	}

	@Override
	public void delete(Player player) {
		players.remove(getById(player.getId()));
		
	}

	@Override
	public void update(Player player) {
		Player playerToUpdate = getById(player.getId());
		playerToUpdate.setFirstName(player.getFirstName());
		playerToUpdate.setLastName(player.getLastName());
		playerToUpdate.setIdentity(player.getIdentity());
		
	}
	
	@Override
	public List<Player> getAll() {
	
		return players;
	}
	
	private boolean checkIfCourseDescriptionNull(String playerFirstName)
	{
		boolean isNull = false;
		if(playerFirstName != null) {
			isNull = true;
		}
		return isNull;
	}
	
	private Player getById(int id) {
		Player getToPlayer = null;
		for (Player item : players) {
			if(item.getId()==id) {
				getToPlayer = item;
			}
		}
		return getToPlayer;
	}

}
