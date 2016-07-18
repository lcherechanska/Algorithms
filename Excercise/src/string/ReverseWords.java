package string;

public class ReverseWords {

	/*
	 * Given an input string, reverse the string word by word. A word is defined
	 * as a sequence of non-space characters.
	 * 
	 * The input string does not contain leading or trailing spaces and the
	 * words are always separated by a single space.
	 * 
	 * For example, Given s = "the sky is blue", return "blue is sky the".
	 * 
	 */

	public static String reverseWords(String inputMessage){
		
		if (inputMessage == null || inputMessage.length() == 0) {
			return "";
		}
		
		String output = "";
		
		char [] input = inputMessage.toCharArray();
		
		int spacePosition = 0;
		
		for (int i = 0; i < input.length; i++) {
			if(input[i] == ' '){
				String word = inputMessage.substring(spacePosition, i);
				spacePosition = i+1;
				output = createOutput(word,output);
			}
		}
		
		output = createOutput(inputMessage.substring(spacePosition),output);
		
		return output;
	}

	private static String createOutput(String word, String ouput) {

		ouput = word + " " + ouput;

		return ouput.trim();
	}

}
