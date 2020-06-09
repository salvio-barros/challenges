package amazon.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TesteAmazon {
	
	static class Entrada {
		int[] celulas;
		int dias;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		String celulas = input.substring(0,8);
		String dias = input.substring(8);
		
		System.out.println(celulas);
		System.out.println(dias);
		
		Entrada entry = new Entrada();
		entry.celulas = prepararCelulas(celulas);
		entry.dias = Integer.parseInt(dias);
		List<Integer> result = cellCompete(entry.celulas, entry.dias);
		
		for (Integer integer : result) {
			System.out.println(integer);
		}
	}
	
	public static int[] prepararCelulas(String celulas) {
		int[] array = new int[celulas.length()];
		
		for (int i : array) {
			array[i] = celulas.charAt(i);
		} 
		
		return array;
	}
	
	public static List<Integer> cellCompete(int[] states, int days)
	 {
		List<Integer> result = new ArrayList<>();
		
		int z = 0;
		boolean stateVerify;
		
		while(z<days) {
			for(int i=0; i<=states.length-1; i++) {
				
				if (i>=states.length+1) {
					break;
				}
				if(i==0) {
					stateVerify = states[i+1] == 0 || states[i+1] == 1;
				} else {
					stateVerify = (states[i-1] == 0 && states[i+1] == 0) ||
					 (states[i-1] == 1 && states[i+1] == 1);
				}
				
				if(stateVerify) {
					states[i] = 0;
				} else {
					states[i] = 1;
				}
				result.add(states[i]);
			}
			z++;
		}
		return result;
	    // WRITE YOUR CODE HERE
	 }
	
}
