package org.cts;

public class Armstrong {

	public static void main(String[] args) {
  
		int a= 153, i=0,j=0,temp=a;
		while(a>0) {
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
		}
		if(j==temp) {
			System.out.println("the given number is armstrong: "+j);
		}
		else {
			System.out.println("the given number is not armstrong");
		}
		
		
		
		
		
	}

}
