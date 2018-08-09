package word;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import utils.FileInputUtils;

public class DictWord {

	private static Logger logger=LoggerFactory.getLogger(DictWord.class);

	private ArrayList<String>allWords;
	private ArrayList<String>validWords;
	int length;

	public DictWord(int length) {
		this.length=length;
		this.allWords=new ArrayList<String>();
		this.validWords=new ArrayList<String>();
		loadDic();
		//for(String str:validWords)
		//	System.out.println(str);
	}

	private void loadDic() {
		ArrayList<String>list=FileInputUtils.fetchFromDicFile();
		for(String str:list) {
			if(str.length()==this.length) {
				allWords.add(str);
				if(containsOnlyUnique(str))
					validWords.add(str);
			}
		}
	}

	
	public static boolean containsOnlyUnique(String word) {
		String arr[] = word.split("");
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i].equals(arr[i+1]))
				return false;
		}
		return true;
	}


	public static int matchingChars(String word1, String word2) {
		boolean arr1[]=new boolean[26];
		boolean arr2[]=new boolean[26];
		int matches=0;
		for(int i=0;i<26;i++)
			arr1[i]=arr2[i]=false;
		for(char c:word1.toCharArray())
			arr1[c-'A']=true;
		for(char c:word2.toCharArray())
			arr2[c-'A']=true;
		for(int i=0;i<26;i++) {
			if(arr1[i]&&arr2[i])
				matches++;
		}
		return matches;
	}

	public String getRandomWordFromWordList() {
		// TODO Auto-generated method stub
		Random generator = new Random();
		return validWords.get(generator.nextInt(validWords.size()));
	}
	
	public ArrayList<String> getAllWords() {
		return allWords;
	}

	public ArrayList<String> getValidWords() {
		return validWords;
	}

}

