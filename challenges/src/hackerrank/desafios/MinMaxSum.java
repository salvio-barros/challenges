package hackerrank.desafios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

    	List<Long> listSum = new ArrayList<>();
    	
    	int next=0; 
    	for (int i=0; i<=arr.length-1;i++) {
    		if(i==next) {
    			long total = 0;
    			for(int j=0; j<=arr.length-1; j++) {
    				if(j!= next) {
    					total+=arr[j];
    				}
    			}
    			next++;
    			listSum.add(total);
    		}
    	}
    	long minResult = Collections.min(listSum);
    	long maxResult = Collections.max(listSum);
    	
    	System.out.println(minResult + " " + maxResult);
    	
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}

