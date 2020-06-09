package hackerrank.desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;


public class Triplets {

	public static void main(String[] args) {
        
	      Scanner sc=new Scanner(System.in);
	     	      	      
	      List<Integer> triplet1 =Stream.of(sc.nextLine().replaceAll("\\s+$", "").split(" "))
	              .map(Integer::parseInt).collect(toList());

	      List<Integer> triplet2 = Stream.of(sc.nextLine().replaceAll("\\s+$", "").split(" "))
	              .map(Integer::parseInt)
	              .collect(toList());
	    
//	      List<Integer> triplet1 = prepareTripletFromString(string1);
//	      List<Integer> triplet2 = prepareTripletFromString(string2);
	      
	      List<Integer> result = compareTriplets(triplet1, triplet2);
	      System.out.println(result.get(0)+" "+result.get(1));
	        
	}
	
	static List<Integer> prepareTripletFromString(String string){
		
		char[] characters = string.toCharArray();
		List<Integer> arrayIntegers = new ArrayList<Integer>();
		int i = 0;
		for (char c : characters) {
			if(c !=' ') {
				String valueStringCharacter = Character.toString(c);
				Integer value = Integer.parseInt(valueStringCharacter);
				arrayIntegers.add(value);
			} 
			i++;
		}
		return arrayIntegers;
	}
	
	// Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

    	List<Integer> scores = new ArrayList<Integer>();
    	int scoreA = 0;
    	int scoreB = 0;
    	
    	for(int i=0; i<a.size(); i++) {
    		
    		if(a.get(i).compareTo(b.get(i)) > 0) {
    			scoreA = scoreA+=1;
    		} else if(a.get(i).compareTo(b.get(i)) < 0) {
    			scoreB = scoreB+=1;
    		}
    	}
    	scores.add(scoreA);
    	scores.add(scoreB);
    	
    	return scores;
    }
}
