package codechef.desafios;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class Questao2 {

	static class EntradaUm{
		int digitos;
		int numero;
	}
	
	static class EntradaDois {
		Set<Integer> numeros = new LinkedHashSet<Integer>();
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer cenarios = sc.nextInt();
		
		for(int i=1; i <= cenarios; i++) {
			
			for(int j=1; j<=2; i++) {

				if(j==1) {
					System.out.println("Entrada "+j+" do cenário " + i);
					String entrada1 = sc.next();
					obterEntradaUm(entrada1); 
				}
				if(j==2){
					System.out.println("Entrada "+j+" do cenário " + i);
					String entrada2 = sc.next();
					EntradaDois obj = obterEntradaDois(entrada2); 
					exibirItens(obj.numeros);
				}
				
			}
			
			
		}
	}
	
	private static void exibirItens(Set<Integer> numeros) {
		for (Integer integer : numeros) {
			System.out.println(integer);
		}
	}

	public static EntradaUm obterEntradaUm(String entrada1) {
		String numeroDigitos = entrada1.substring(0,entrada1.indexOf(""));
		System.out.println(numeroDigitos);
		String numero = entrada1.substring(entrada1.indexOf("")+1);
		System.out.println(numero);
		
		EntradaUm entrada = new EntradaUm();
		entrada.digitos = Integer.parseInt(numeroDigitos);
		entrada.numero = Integer.parseInt(numero);
		return entrada;
	}
	
	public static EntradaDois obterEntradaDois(String entrada2) {
		EntradaDois entradaDois = new EntradaDois();
		for(int i = 0; i<=entrada2.length();i++) {
			if(entrada2.indexOf("") == 1) {
				entradaDois.numeros.add(Integer.parseInt(
						entrada2.substring(0,entrada2.indexOf(""))));
			}
		}
		return entradaDois;
	}
}
