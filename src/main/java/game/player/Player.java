package game.player;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Player {
	
	private static final Logger logger = LoggerFactory.getLogger(Player.class);
	private String name;
	
	public Player(String name) {
		this.name=name;
	}
	
	public abstract String guessWord();

}
