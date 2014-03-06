package yanovski.lol.api.demo;

import com.squareup.otto.Subscribe;

import yanovski.lol.api.messages.EventBusManager;
import yanovski.lol.api.messages.ResponseNotification;
import yanovski.lol.api.models.Summoner;
import yanovski.lol.api.responses.SummonerResponseNotification;
import yanovski.lol.api.responses.TeamsResponseNotification;
import yanovski.lol.api.services.LoLServices;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		LoLServices.init(this);
		
//		LoLServices.getLeaguesBySummnerId("eune", 20998488);
//		LoLServices.getMasteriesBySummnerId("eune", 20998488);
//		LoLServices.getRandkedStatsBySummnerId("eune", 20998488);
//		LoLServices.getRecentGamesBySummnerId("eune", 20998488);
//		LoLServices.getStatsBySummnerId("eune", 20998488, "SEASON3");
//		LoLServices.getSummonerByName("eune", "mid inhibitor");
//		LoLServices.getSummonerBySummnerId("eune", 20998488);
		LoLServices.getSummonerNamesBySummnerId("eune", "20998488");
//		LoLServices.getRunesBySummnerId("eune", 20998488);
//		LoLServices.getChampions("eune", false);
//		LoLServices.getTeamsBySummnerId("eune", 20998488);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		EventBusManager.register(this);
	}

	@Subscribe
	public void processResponseNotification(ResponseNotification rn) {
		
	}
}
