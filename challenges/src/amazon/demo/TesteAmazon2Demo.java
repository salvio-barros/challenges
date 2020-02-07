package amazon.demo;

import java.util.Scanner;

public class TesteAmazon2Demo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		String listOfNumbers = sc.next();
		
		int[] positiveNumbers = prepararCelulas(listOfNumbers);
		
		int result = generalizedGCD(number, positiveNumbers);
		
		System.out.println(result);
	}
	
	
	public static int[] prepararCelulas(String celulas) {

		int[] array = new int[celulas.length()];
		
		for (int i =0; i<celulas.length(); i++) {
			array[i] = Integer.parseInt(celulas.substring(i,i+1));
		} 
		
		return array;
	}
	
	 // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public static int generalizedGCD(int num, int[] arr)
    {
       int[] gdc = new int[arr.length];
       int[] result = arr;
       boolean foundGDC=false;
    	
       int number = 2;
       
       boolean hasMod1=false;
       
       
       while(!foundGDC) {
    	    for(int i = 0; i<result.length; i++) {
	    	   
    	    	gdc[i] = Math.floorMod(result[i], number);
    	    	result[i]= Math.abs(result[i]/number);
	    	}
	    	for (int j : gdc) {
				if(j!=0) {
					hasMod1 = true;
				}
			}
	    	if(hasMod1){
	    		 number++;
	    	} else {
	    		return number;
	    	}
	    
       }
       return 0;
    }
    // METHOD SIGNATURE ENDS
}
