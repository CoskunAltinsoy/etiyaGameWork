package Game;

import java.util.ArrayList;
import java.util.List;

public interface CampaignService {
	
	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);
	List<Campaign> getAll();

}
