package hackerrank.desafios;

import static java.util.stream.Collectors.toList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;


class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

	 public int diagonalDifference(List<List<Integer>> arr) {
		    // Write your code here
		    	List<Integer> firstDiagonal = new ArrayList<Integer>();
		    	List<Integer> secondDiagonal = new ArrayList<Integer>();
		    	Integer resultFirstDiagonal = 0;
		    	Integer resultSecondDiagonal = 0;
		    	
		    	Integer result = 0;
		    	
		    	//i = from first diagonalList
		    	int i = 0;
		    	
		    	// Get first diagonal;
		    	for (List<Integer> list : arr) {
					firstDiagonal.add(list.get(i));
					i++;
				}
		    	
		    	int j = i-1;
		    	
		    	for (List<Integer> list : arr) {
					if(j<0) {
						break;
					}
					secondDiagonal.add(list.get(j));
					j--;
				}
		    	
		    	for (Integer value : firstDiagonal) {
		    		resultFirstDiagonal+=value;
				}
		    	for (Integer value : secondDiagonal) {
		    		resultSecondDiagonal+=value;
				}
		    	
		    	result = Math.abs(resultFirstDiagonal-resultSecondDiagonal);
		    	return result;
		    }

}

public class DiagonalDifference {

	/*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
	
    public static void main(String[] args) throws IOException {

    	Scanner sc=new Scanner(System.in);
    	
        int n = Integer.parseInt(sc.nextLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            arr.add(
			    Stream.of(sc.nextLine().replaceAll("\\s+$", "").split(" "))
			        .map(Integer::parseInt)
			        .collect(toList())
			);
        });

        Result teste = new Result();
        int result = teste.diagonalDifference(arr);
        System.out.println(result);

    }
}
