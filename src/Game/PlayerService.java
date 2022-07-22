package Game;

import java.util.List;

public interface PlayerService {
	void add(Player player);
	void delete(Player player);
	void update(Player player);
	List<Player> getAll();

}
