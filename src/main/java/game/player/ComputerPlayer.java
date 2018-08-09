package game.player;


import java.util.ArrayList;
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
	}
	
	public boolean isSecretWord(String str) {
		return str.equals(this.secretWord.toUpperCase());
	}
	
	public int numOfMatchedChars(String str) {
		return DictWord.matchingChars(this.secretWord, str.toUpperCase());
	}

	public String guessWord() {
		if(guessWordSet.size()==0) {
			logger.info("No word found!");
			return null;
		}
		Random random=new Random();
		Object[]objectArr=guessWordSet.toArray();
		return (String)objectArr[random.nextInt(objectArr.length)];
	}
	
	public void evaluateGuessWord(String guessWord, int matches) {
		ArrayList<String>temp=new ArrayList<String>();
		for(Object obj:((guessWordSet.toArray()))) {
			if(DictWord.matchingChars((String)obj, guessWord)==matches && !guessWord.equals((String)obj))
				temp.add((String)obj);
		}
		guessWordSet=new HashSet(temp);
	}
	
}
