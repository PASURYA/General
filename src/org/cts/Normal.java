package org.cts;

public class Normal {

	public static void main(String[] args) {
		
		String s="malayalam";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s)) {
			System.out.println("the given String is Palindrome");
		}
		else {
			System.out.println("the given string is not palindrome");
		}
		
	}
	
	
	
}
