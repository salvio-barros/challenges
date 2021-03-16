package hackerrank.desafios;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlusMinus {

	 private static final Scanner scanner = new Scanner(System.in);

	 public static void main(String[] args) {
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] arr = new int[n];

	        String[] arrItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int arrItem = Integer.parseInt(arrItems[i]);
	            arr[i] = arrItem;
	        }

	        plusMinus(arr);

	        scanner.close();
	    }

	private static void plusMinus(int[] arr) {
		// TODO Auto-generated method stub
		BigDecimal countPositive = BigDecimal.ZERO, 
				countNegative = BigDecimal.ZERO,
				countZeros = BigDecimal.ZERO,
				size= new BigDecimal(arr.length);
		
		List<BigDecimal> resultList = new ArrayList<BigDecimal>();
		
		for(int i = 0; i<= arr.length-1; i++) {
			if(arr[i] > 0) {
				countPositive = countPositive.add(BigDecimal.ONE);
			} else if(arr[i] == 0) {
				countZeros = countZeros.add(BigDecimal.ONE);
			} else {
				countNegative = countNegative.add(BigDecimal.ONE);
			}
		}
		BigDecimal resultPositive = countPositive.divide(size,4,BigDecimal.ROUND_HALF_UP);
		BigDecimal resultNegative = countNegative.divide(size,4,BigDecimal.ROUND_HALF_UP);
		BigDecimal resultZero = countZeros.divide(size,4, BigDecimal.ROUND_HALF_UP);
		
		resultList.add(resultPositive);
		resultList.add(resultNegative);
		resultList.add(resultZero);
		
		for (BigDecimal bigDecimal : resultList) {
			System.out.println(bigDecimal);
		}
		
	}
}
