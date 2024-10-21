package FinalTest;

import java.util.Scanner;

public class LargestWord {
	/**
	 * Have the function LongestWord(sen) take the sen parameter being passed and return the largest word in the string.
	 * If there are two or more words that are the same length, return the first word from the string with that length.
	 * Ignore punctuation and assume sen will not be empty.
	 */


 
		public static String longestWord (String sen) {
			String[] words = sen.toLowerCase()
					.replaceAll("[^a-zA-Z0-9 ]", "")
					.split(" ");
			String longest = words[0];
			for (String word : words)
				if (word.length() > longest.length()) longest = word;

			return longest;
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter any Scentence");
			System.out.println(longestWord(sc.nextLine()));
		}
	}

