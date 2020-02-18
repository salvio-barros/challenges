package hackerrank.desafios;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Scanner;

public class HackerRankSort {

	static class Pair{
		String nome;
		BigDecimal score;
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public BigDecimal getScore() {
			return score;
		}
		public void setScore(BigDecimal score) {
			this.score = score;
		}
		public Pair(String nome, BigDecimal score) {
			super();
			this.nome = nome;
			this.score = score;
		}
		
		
	}
	
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 
		 int numberOfInputs= sc.nextInt();
		 		 
		 Map<Integer,Pair> scores = new HashMap<Integer,Pair>();
		 
		 List<String> entry = null;
		 int j = 0;
		 while (j<numberOfInputs) {
			 entry = new ArrayList<>();
			 for(int i=1; i<=3; i++) {
				 String a=sc.next();
				 entry.add(a);
			 }
			 int id = Integer.parseInt(entry.get(0));
			 String name = entry.get(1);
			 BigDecimal score = new BigDecimal(entry.get(2));
			 
			 scores.put(id, new Pair(name,score));
			 j++;
		 }
		 Queue queue = obterOrdenacao(scores);
		 System.out.println(queue);
	}
	
	public static Queue<String> obterOrdenacao(Map<Integer, Pair> scores){
		
		Queue<String> queueString = new LinkedList<String>();
		
		for (Entry<Integer,Pair> entry : scores.entrySet()) {
			
			Pair currentPair = entry.getValue();
			for (int i = 1; i<=scores.size(); i++) {
				Pair pairToCompare = scores.get(i);
				
				if(!queueString.contains(currentPair.getNome())){
					if(currentPair.getScore().compareTo(pairToCompare.getScore())==-1) {
						queueString.add(currentPair.getNome());
					} else if(currentPair.getNome().compareTo(pairToCompare.getNome())==-1){
						queueString.add(currentPair.getNome());
					}
				}
			}
			
		}
		
		
		return queueString;
	}
	
}
