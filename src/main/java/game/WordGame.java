package game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import game.player.Player;
import utils.DisplayUtils;

public class WordGame {

	private static final Logger logger = LoggerFactory.getLogger(WordGame.class);

	private Player player1;
	private Player player2;
	private WordGameLevel wordGameLevel;
	private WordGameState wordGameState;
	private Player currentPlayer;

	public WordGame(Player player1, Player player2, WordGameLevel wordGameLevel) {
		this.player1=player1;
		this.player2=player2;
		this.wordGameLevel=wordGameLevel;
		this.wordGameState=WordGameState.IN_PROGRESS;
		this.currentPlayer=player1;
	}

	public void playTurns() {
		DisplayUtils.displayAskForWord(currentPlayer, nextPlayer());
		String guessedWord=currentPlayer.guessWord();	
		DisplayUtils.displayIsSecret(nextPlayer(), guessedWord);
		
		if(nextPlayer().isSecretWord(guessedWord)) {
			setWinner(currentPlayer);//player turn wins
			DisplayUtils.displayWin(currentPlayer);
			return;
		}
		
		DisplayUtils.displayAskForMatchingCharacters(nextPlayer(), currentPlayer, guessedWord);
		int matches=nextPlayer().numOfMatchedChars(guessedWord);
		DisplayUtils.displayCharFreqFeedback(matches);
		currentPlayer.evaluateGuessWord(guessedWord, matches);
		currentPlayer=nextPlayer();
	}

	private void setWinner(Player player) {
		if(player==player1)
			wordGameState=WordGameState.PLAYER_1_WON;
		else
			wordGameState=WordGameState.PLAYER_2_WON;
	}

	private Player nextPlayer() {
		if(currentPlayer==player1)
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
