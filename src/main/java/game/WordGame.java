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

	public void playTurns() {
		String guessedWord=turn.guessWord();
		if(nextTurn().isSecretWord(guessedWord))
			setWinner(turn);//player turn wins
		int matches=nextTurn().numOfMatchedChars(guessedWord);
		turn.evaluateGuessWord(guessedWord, matches);
		turn=nextTurn();
	}

	private void setWinner(Player player) {
		if(player==player1)
			wordGameState=WordGameState.PLAYER_1_WON;
		else
			wordGameState=WordGameState.PLAYER_2_WON;
	}

	private Player nextTurn() {
		if(turn==player1)
			return player2;
		return player1;
	}

	public Player getPlayer1() {
		return player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public WordGameLevel getWordGameLevel() {
		return wordGameLevel;
	}

	public WordGameState getWordGameState() {
		return wordGameState;
	}
}
