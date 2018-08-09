package game.player;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Player {
	
	private static final Logger logger = LoggerFactory.getLogger(Player.class);
	protected String name;
	
	public Player(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract String guessWord();
	
	public abstract void evaluateGuessWord(String guessWord, int matches);
	
	public abstract boolean isSecretWord(String str);
	
	public abstract int numOfMatchedChars(String str);

}
