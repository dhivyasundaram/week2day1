package week2day1assignment;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		if (text1.length()==text2.length()) {
			System.out.println("The length is equal");
		}
		else {
			System.out.println("The length is not equal");
		}
		char[]chartext1=text1.toCharArray();
		char[]chartext2=text2.toCharArray();
		Arrays.sort(chartext1);
		Arrays.sort(chartext2);
		
		
		boolean result = Arrays.equals(chartext1,chartext2);
		
		if(result) {
			System.out.println(text1+" , "+text2+" is an anagram");
		}
		else {
			System.out.println(text1+" , "+text2+" is not an  anagram");
		
		}
		
		
		
		
		
	}

}
