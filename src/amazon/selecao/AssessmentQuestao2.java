package amazon.selecao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AssessmentQuestao2 {

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
		
		AssessmentQuestao2 solution = new AssessmentQuestao2();
		int number = solution.minimumHours(rows, columns, grid);
		System.out.println(number);
	}

	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	int minimumHours(int rows, int columns, List<List<Integer> > grid)
	{
		int minimumHours = 0;
		
		Integer[][] matrix = new Integer[rows][columns];
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				matrix[i][j] = grid.get(i).get(j);
			}
			
		}
		
		for (int i = 0; i < rows; i++) {
			
			for(int j=0; j<columns; j++) {
				
				if((j-1< 0) || (j+1>columns) || (i-1<0) || (j+1 > rows)){
					break;
				}
				if((matrix[i][j] == 1)
					|| (matrix[i][j+1] ==0)
					|| (matrix[i+1][j] == 0)
					|| (matrix[i-1][j] == 0)
					|| (matrix[i][j-1] == 0)){
						
					matrix[i][j+1]=1;
					matrix[i+1][j]=1;
					matrix[i-1][j]=1;
					matrix[i][j-1]=1;
					minimumHours++;
				}
			}
		}
		return minimumHours;
	}
}
