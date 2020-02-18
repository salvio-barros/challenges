package hackerrank.desafios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HourGlasses {

	  private static final Scanner scanner = new Scanner(System.in);
	 
	
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

        scanner.close();
    }

	private static int hourglassSum(int[][] arr) {
		int hourglassDimension = arr.length/2;
		
		List<List<Integer>> hourGlassList = new ArrayList<List<Integer>>();
				
		for(int row=0; row<arr.length; row++) {
			for(int column=0;column<arr.length; column++) {
				Set<Element> hourGlass = new HashSet<String,Integer>();
				for(int i=0;i<hourglassDimension; i++) {
					for(int j=0; j<hourglassDimension; j++) {
						Element element = new Element();
						element.setRow(i);
						element.setColumn(j);
						element.setValue(arr[i][j]);
						hourGlass.add(element);
						
					}
				}
				
				
			}
		}
		
		
		
		return 0;
	}
	
}
