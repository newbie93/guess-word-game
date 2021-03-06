package main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import driver.Driver;
import game.WordGame;
import game.WordGameLevel;
import game.player.ComputerPlayer;
import game.player.HumanPlayer;
import word.DictWord;

public class Main {
	
	private static Logger logger=LoggerFactory.getLogger(Main.class);
	
	public static void main(String a[]) {
		if(a.length<1)
			System.exit(1);
		int diff=Integer.parseInt(a[0]);
		DictWord dictWord=new DictWord(WordGameLevel.EASY.getValue());
		Driver driver=new Driver(new WordGame(new ComputerPlayer("anir",dictWord), 
				new ComputerPlayer("riju",dictWord), 
				WordGameLevel.EASY));
	}

}
