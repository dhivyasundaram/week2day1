package week2day1assignment;

public class Palindrome {
	public static void main(String[] args) {
		String a = "madam";
		char[] array = a.toCharArray();
		String rev = "";
		for (int i = array.length-1;i>=0; i--) {
			rev = rev+(array[i]);
			}
		if(a.equals(rev)) {
			System.out.println("It is a palindrome");
		}
		
		else {
			System.out.println("It is not a palindrome");
		}
	}

}
