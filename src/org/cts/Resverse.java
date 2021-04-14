package org.cts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Resverse {

	public static void main(String[] args) {
    String string = "SURYA";
    String s="";
   char[] charArray = string.toCharArray();
    List<Character> li = new ArrayList<>();
   for(int i=0;i<charArray.length;i++) {
	   li.add(charArray[i]);
	   
   }
   System.out.println(li);
   Collections.reverse(li);
    System.out.println(li);
    
    for(int i=0; i<li.size();i++) {
   s=  s+li.get(i);
    }
    System.out.println(s);
    
      
    
    
     
		
	}

}
