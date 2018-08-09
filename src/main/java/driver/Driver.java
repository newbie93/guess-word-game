package driver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import game.WordGame;
import game.WordGameState;

public class Driver {
	
	private static Logger logger=LoggerFactory.getLogger(Driver.class);
	private WordGame wordGame;
	
	public Driver(WordGame wordGame) {
		this.wordGame=wordGame;
		this.playGame();
	}
	
	public void playGame() {
		while(wordGame.getWordGameState()==WordGameState.IN_PROGRESS) {
			wordGame.playTurns();
		}
	}

}
