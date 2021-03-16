package hackerrank.desafios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Element{
	 int row;
	 int column;
	 int value;
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	 
	 
}

public class HourGlasses {

	private static final Scanner scanner = new Scanner(System.in);
	 
	
	public static void main(String[] args) throws IOException {
        
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);
        System.out.println(result);

        scanner.close();
    }

	private static int hourglassSum(int[][] arr) {
		int hourglassDimension = arr.length-1;
	
		List<Integer> sumValues = new ArrayList<>();
		
		int rowLimit = 0;
		int columnLimit = 0;
		
		for(int i=0;i<=hourglassDimension; i++) {
			
			rowLimit = i+2;
			if(rowLimit <= hourglassDimension) {
			
				for(int j=0; j<=hourglassDimension; j++) {
				  	
					columnLimit = j+2;
					if(columnLimit <= hourglassDimension) {
					
						Integer result = arr[i][j] + arr[i][j+1]+ arr[i][j+2]
									 + arr[i+1][j+1]  
									 + arr[i+2][j] + arr[i+2][j+1]+ arr[i+2][j+2];
					  	sumValues.add(result);
					}
				}
			}
		}
		
		int maxValue = sumValues.stream().max(Integer::compare).get();
		return maxValue;
	}
}
