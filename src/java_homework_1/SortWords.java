package java_homework_1;

import java.util.regex.*;
import java.util.ArrayList;

public class SortWords {
	private static String patternStr = "[A-Z]*[a-z]+";
	
	public static void main(String args[]) {
		String text = "To be or not to be, that is the question;"
				+ "Whether `tis nobler in the mind to suffer" 
				+ " the slings and arrows of outrageous fortune,"
				+ " or to take arms against a sea of troubles,"
				+ " and by opposing end them?";
		
		ArrayList<String> wordsList = new ArrayList<>();
		Pattern pattern = Pattern.compile(patternStr);
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			wordsList.add(matcher.group());
		}
		
		
		for(int i = 1; i < wordsList.size(); i++) {
			boolean flag = true;
			
			for(int j = 0; j < wordsList.size() - i; j++) {
				String words1 = wordsList.get(j);
				String words2 = wordsList.get(j + 1);
				int pointer = 0;
				
				while(pointer < words1.length() && pointer < words2.length()) {
					char letter1 = words1.toLowerCase().charAt(pointer);
					char letter2 = words2.toLowerCase().charAt(pointer);
					
					if(letter1 > letter2) {
						wordsList.set(j, words2);
						wordsList.set(j + 1, words1);
						flag = false;
						break;
					}
					
					if(letter1 < letter2) {
						break;
					}
					
					pointer++;
				}
				
				if(pointer == words1.length() || pointer == words2.length()) {
					if(words1.length() > words2.length()) {
						wordsList.set(j, words2);
						wordsList.set(j + 1, words1);
					}
				}
			}
			
			if(flag) {
				break;
			}
		}
		
		System.out.println(wordsList);
	}
}
