package amazon.selecao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer rows = sc.nextInt();
		Integer columns = sc.nextInt();
		
		int[][] matrix = new int[rows][columns];
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				int element = sc.nextInt();
				matrix[i][j] = element;
			}
			
		}
		
		List<List<Integer>> grid = new ArrayList<>();
		for (int[] is : matrix) {
			List<Integer> linha = new ArrayList<>();
			for(int i=0; i<is.length; i++) {
				linha.add(is[i]);
			}
			grid.add(linha);
		}
		
		Solution solution = new Solution();
		int number = solution.numberAmazonTreasureTrucks(rows, columns, grid);
		System.out.println(number);
			
	}
	
	public int numberAmazonTreasureTrucks(int rows, int columns,
			List<List<Integer>> grid)
	{
		int numberAmazonTreasure = 0;
		Boolean[][] visitedItens = new Boolean[rows][columns];
		
		int i = 0,j=0;
		for (List<Integer> list : grid) {
			if(i<rows) {
				for (Integer item : list) {
					
					if(j<columns) {
						int element = item;
										
						if((visitedItens[i][j] == null) 
								&&	(element == 1) ) {
							visitedItens[i][j] = true;
							numberAmazonTreasure++;
						}
					}
					j++;
				}
			}
			i++;
		}
		return numberAmazonTreasure;
	}
}
