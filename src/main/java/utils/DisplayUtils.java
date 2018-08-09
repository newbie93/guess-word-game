package utils;

import game.player.Player;

public class DisplayUtils {

	private static final String GUESS_WORD=", guess what could be the secret word of ";
	private static final String NONE_PRESENT="No charater present!";
	private static final String ONE_PRESENT="1 charater present!";
	private static final String TWO_PRESENT="2 charaters present!";
	private static final String THREE_PRESENT="3 charaters present!";
	private static final String FOUR_PRESENT="4 charaters present!";
	private static final String FIVE_PRESENT="5 charaters present!";
	private static final String SIX_PRESENT="6 charaters present!";
	private static final String WELCOME_MSG="Welcome to word Game!";
	//private static final String DIFF_LEVEL="Enter 1 for EASY, 2 for MODERATE and 3 for HARD";
	private static final String WINS=" Wins! Congratulations ";
	//private static final String CHOOSE_COMP="I CHOOSE: ";
	private static final String ASK_MATCHING_CHARACTERS=", Please tell how many matching characters are there, in ";

	public static void displayWelcome() {
		System.out.println(WELCOME_MSG);
	}
	
	public static void displayAskForMatchingCharacters(Player p1, Player p2, String guessedWord){
		System.out.println(p1.getName()+ASK_MATCHING_CHARACTERS+p2.getName()+"'s guessed word: "+guessedWord);
	}

	public static void displayAskForWord(Player p1, Player p2) {
		System.out.println(p1.getName()+GUESS_WORD+p2.getName());
	}

	public static void displayCharFreqFeedback(int n) {
		switch(n) {
		case 0:
			System.out.println(NONE_PRESENT);
			break;
		case 1:
			System.out.println(ONE_PRESENT);
			break;
		case 2:
			System.out.println(TWO_PRESENT);
			break;
		case 3:
			System.out.println(THREE_PRESENT);
			break;
		case 4:
			System.out.println(FOUR_PRESENT);
			break;
		case 5:
			System.out.println(FIVE_PRESENT);
			break;
		case 6:
			System.out.println(SIX_PRESENT);
			break;
		default: ;
		}
	}
	
	public static void displayWin(Player p) {
		System.out.println(p.getName()+WINS+p.getName());
	}
	
	public static void displayIsSecret(Player p, String str) {
		System.out.println(p.getName()+", Is \""+str+"\" the secret you are holding?\t[y/n]");
	}
	
	public static void displayHowManyMatches(Player p, String str) {
		System.out.println(p.getName()+", How many characters in \""+str+"\" matches your secret word?\t*in numbers");
	}

}
