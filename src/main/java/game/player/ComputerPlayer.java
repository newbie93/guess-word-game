package game.player;

import java.net.InetAddress;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import utils.WordUtils;

public class ComputerPlayer extends Player {


	private static final Logger logger = LoggerFactory.getLogger(ComputerPlayer.class);
	private String secretWord;
	private WordUtils wordUtils;

	public ComputerPlayer(String name) {
		super(name);
	}
	
	private void setSecretWord() {
		this.secretWord=wordUtils.getRandomWordFromWordList();
	}

	public String guessWord() {
		return "";
	}
}
