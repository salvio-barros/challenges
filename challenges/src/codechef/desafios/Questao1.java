package codechef.desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao1 {

	static class Node {
		String value;
		boolean spam;
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		public boolean isSpam() {
			return spam;
		}
		public void setSpam(boolean spam) {
			this.spam = spam;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer cenarios = sc.nextInt();
		
		List<Node> nodes = new ArrayList<>();
		for(int i=1; i <= cenarios; i++) {
			System.out.println("Entrada " + i);
			String valor = sc.next();
			int spam = sc.nextInt();
			
			Node no = new Node();
			no.setValue(valor);
			no.setSpam(spam == 1 ? true : false);
			
			nodes.add(no);
		}
		
		int quantidade = obterQuantidadeMaximaEntradas(nodes);
		System.out.println(quantidade);
	}

	private static int obterQuantidadeMaximaEntradas(List<Node> nodes) {
				
		List<String> valores = new ArrayList<>();
		List<Boolean> spams = new ArrayList<>();
				
		for (Node node : nodes) {
			
			if(valores.isEmpty() && spams.isEmpty()) {
				valores.add(node.getValue());
				spams.add(node.isSpam());
			} else {
				
				if(valores.contains(node.getValue()) && 
						(spams.contains(!node.isSpam()))) {
					spams.add(node.isSpam());
				}
				
			}
		}
		return spams.size();
	}
}
