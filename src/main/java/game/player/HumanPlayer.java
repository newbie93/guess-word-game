package game.player;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HumanPlayer extends Player {
	
	private static final Logger logger = LoggerFactory.getLogger(HumanPlayer.class);
	
	public HumanPlayer(String name) {
		super(name);
	}
	
	public boolean isSecretWord(String str) {
		return false;
	}
	
	public int numOfMatchedChars(String str) {
		return 0;
	}
	
	public String guessWord() {
		return "";
	}
	
	public void evaluateGuessWord(String guessWord, int matches) {
		
	}

}
