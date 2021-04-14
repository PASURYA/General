package org.cts;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int a= 151,i=0,j=0,temp=a;
		while(a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		if(j==temp) {
			System.out.println("the given number is palindrome: "+j);
		}
		else {
			System.out.println("the given number is not palindrome:"+j);
		}
		
		//System.out.println(j);
		
	}

}

