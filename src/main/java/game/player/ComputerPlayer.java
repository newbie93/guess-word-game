package game.player;


import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import word.DictWord;

public class ComputerPlayer extends Player {


	private static final Logger logger = LoggerFactory.getLogger(ComputerPlayer.class);
	private String secretWord;
	private DictWord dictWord;
	
	private Set<String>guessWordSet;

	public ComputerPlayer(String name, DictWord dictWord) {
		super(name);
		this.dictWord=dictWord;
		this.secretWord=dictWord.getRandomWordFromWordList();
		guessWordSet=new HashSet<String>();
		guessWordSet.addAll(dictWord.getAllWords());
		//currentGuessWord="";
	}
	
	public boolean isSecretWord(String str) {
		return str.equals(this.secretWord.toUpperCase());
	}
	
	public int numOfMatchedChars(String str) {
		return DictWord.matchingChars(this.secretWord, str.toUpperCase());
	}

	public String guessWord() {
		Random random=new Random();
		Object[]objectArr;
		return ((String[])(objectArr=guessWordSet.toArray()))[random.nextInt(objectArr.length)];
	}
	
	public void evaluateGuessWord(String guessWord, int matches) {
		Set<String>temp=new HashSet<String>();
		for(String str:((String[])(guessWordSet.toArray()))) {
			if(DictWord.matchingChars(str, guessWord)==matches)
				temp.add(str);
		}
		guessWordSet.removeAll(temp.toArray());
	}
	
}
