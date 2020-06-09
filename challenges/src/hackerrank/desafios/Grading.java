package hackerrank.desafios;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Grading {

	/*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    	List<Integer> result  = new ArrayList<>();
    	
    	result = grades.stream().map(g -> adjustGrade(g)).collect(Collectors.toList());
    	    	
    	return result;
    }
    
    public static Integer adjustGrade(Integer item) {
    	Integer modGrade = item % 5;
    	Integer resultGrade = item/5;
    	Integer multipleForResult = 0;
    	
    	Integer modInternalResult = 0;
    	
    	if(modGrade.compareTo(0) > 0) {
    		int i = 0;
    		boolean findMultiple = false;
    		while (!findMultiple) {
    			i++;
    			resultGrade = resultGrade+i;
    			
    			modInternalResult = item % resultGrade;
    			
    			if(modInternalResult == 0) {
    				findMultiple = true;
    			}
    		}
       	}
    	multipleForResult = resultGrade * 5;
    	
    	Integer diffGrade = item - multipleForResult;
    	
    	if(diffGrade.compareTo(3) < 0 && modGrade.compareTo(0) == 0) {
    		return multipleForResult + modGrade;
       	} else {
    		if (item > 38) {
    			return multipleForResult+modGrade;
    		} else {
    			return resultGrade;
    		}
    	}
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Grading.gradingStudents(grades);

        System.out.println(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

    }
	
}
