package hackerrank.desafios;

import java.util.Scanner;

public class Palindrom {
	
	public static void main(String[] args) {
	        
	      Scanner sc=new Scanner(System.in);
	      String A=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	      System.out.println(checkPalindrom(A));
	        
	}

	public static String checkPalindrom(String value){

	   boolean palindrom = true;
	   
	   int j = value.length();
	   for(int i=0; i<value.length(); i++) {
		   if(value.charAt(i) != value.charAt(j-1)) {
			   palindrom = false;
		   }
		   j--;
	   }
	   if(palindrom) {
		   return "Yes";
	   } else {
		   return "No";
	   }

	}
}
