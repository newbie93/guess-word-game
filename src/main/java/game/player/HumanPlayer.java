package game.player;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import utils.DisplayUtils;
import utils.UserInputUtils;

public class HumanPlayer extends Player {
	
	private static final Logger logger = LoggerFactory.getLogger(HumanPlayer.class);
	
	public HumanPlayer(String name) {
		super(name);
	}
	
	public boolean isSecretWord(String str) {
		//System.out.print(this.name+" : ");
		//DisplayUtils.displayIsSecret(this,str);
		String inp=UserInputUtils.fetchFromKeyboard();
		return (inp.equals("y"));
	}
	
	public int numOfMatchedChars(String str) {
		//System.out.print(this.name+" : ");
		//DisplayUtils.displayHowManyMatches(this,str);
		return Integer.parseInt(UserInputUtils.fetchFromKeyboard());
	}
	
	public String guessWord() {
		//System.out.print(this.name+" : ");
		//DisplayUtils.displayAskForWord();
		return UserInputUtils.fetchFromKeyboard();
	}
	
	public void evaluateGuessWord(String guessWord, int matches) {
		//System.out.print(this.name+" : ");
		//DisplayUtils.displayCharFreqFeedback(matches);
	}

}
