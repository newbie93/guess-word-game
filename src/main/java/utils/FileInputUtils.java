package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileInputUtils {
	

	private static final String DIC_PATH="";
	private static Logger logger=LoggerFactory.getLogger(FileInputUtils.class);
	//private static BufferedReader fileReader;
	
	
	public static ArrayList<String> fetchFromDicFile() {
		try {
			BufferedReader fileReader = new BufferedReader(new FileReader(new File(DIC_PATH)));
			ArrayList<String>list=new ArrayList<String>();
			String str;
			while((str=fileReader.readLine())!=null)
				list.add(str);
			return list;
		}
		catch(Exception e) {
			logger.error(e.getMessage());
		}
		return null;
	}

}
