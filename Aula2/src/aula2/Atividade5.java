package aula2;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int item,quantidade;
		float calculoTotal;
		System.out.printf("Qual o número do item: ");
		item = sc.nextInt();
		
		System.out.printf("Qual a quantidade do item: ");
		quantidade = sc.nextInt();
		
		switch(item) {
		case 1: 
			System.out.printf("Produto: Cachorro-Quente ");
			calculoTotal = 10.00f * quantidade;
			System.out.printf("Valor total: R$ %.2f",calculoTotal);
					
			break;
			
		case 2: 
			System.out.printf("Produto: X-Salada ");
			calculoTotal = 15.00f * quantidade;
			System.out.printf("Valor total: R$ %.2f",calculoTotal);
			break;
			
		case 3: 
			System.out.printf("Produto: X-Bacon ");
			calculoTotal = 18.00f * quantidade;
			System.out.printf("Valor total: R$ %.2f",calculoTotal);
			break;
			
		case 4: 
			System.out.printf("Produto: Bauru ");
			calculoTotal = 12.00f * quantidade;
			System.out.printf("Valor total: R$ %.2f",calculoTotal);
			break;
			
		case 5: 
			System.out.printf("Produto: Refrigerante ");
			calculoTotal = 8.00f * quantidade;
			System.out.printf("Valor total: R$ %.2f",calculoTotal);
			break;
			
		case 6: 
			System.out.printf("Produto: Suco de Laranja ");
			calculoTotal = 13.00f * quantidade;
			System.out.printf("Valor total: R$ %.2f",calculoTotal);
			break;
		}
	}

}
