package game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import game.player.Player;

public class WordGame {

	private static final Logger logger = LoggerFactory.getLogger(WordGame.class);
	
	private Player player1;
	private Player player2;
	private WordGameLevel wordGameLevel;
	private WordGameState wordGameState;
	private Player turn;
	
	public WordGame(Player player1, Player player2, WordGameLevel wordGameLevel) {
		this.player1=player1;
		this.player2=player2;
		this.wordGameLevel=wordGameLevel;
		this.wordGameState=WordGameState.IN_PROGRESS;
		this.turn=player1;
	}
	
	public void play() {
		String guessedWord=turn.guessWord();
		nextTurn().
	}
	
	public Player nextTurn() {
		if(turn==player1)
			return player2;
		return player1;
	}
	
}