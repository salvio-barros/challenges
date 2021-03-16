package hackerrank.desafios;

import java.util.Scanner;

public class StairCase {

	// Complete the staircase function below.
    static void staircase(int n) {

    	String[] array = new String[n];
    	
    	for(int i=array.length-1; i>=0; i--){
    		array[i] = "#";
    	}
    	StringBuilder builder = new StringBuilder();
    	
    	int padding = array.length;
    	for(int i=array.length-1; i>=0; i--){
    		builder.append(array[i]);
    		for(int j=0;j<=padding; j++) {
    			builder.append(" ");
    		}
    		
    		System.out.println(builder.toString());
    	}

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
	
}
