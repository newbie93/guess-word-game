package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserInputUtils {

	private static final Logger logger = LoggerFactory.getLogger(UserInputUtils.class);
	private static BufferedReader inputReader;

	static {
		inputReader=new BufferedReader(new InputStreamReader(System.in));
	}
	
	public static String fetchFromKeyboard() {
		try {
			return inputReader.readLine();
		}
		catch(Exception e) {
			logger.error(e.getMessage());
		}
		return "";
	}

}
