import java.util.Scanner;

public class Atividade1Matrizes {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int vetorInteiros[]= new int [10];
		float soma =0, media;
		
		for(int contador =0; contador <vetorInteiros.length; contador ++) {
			System.out.println("Digite um número: ");
			int numero = leia.nextInt();
			
			vetorInteiros[contador] = numero;
		}
		
		for (int contador = 0; contador <vetorInteiros.length; contador ++) {
			if(vetorInteiros[contador] % 2 == 0) {
				System.out.println("Elementos pares: " + vetorInteiros[contador]);
			}
		}
		
		for(int contador =0; contador <vetorInteiros.length; contador ++) {
			soma = vetorInteiros[contador] + soma;
		}
		
		System.out.println("Soma: " + soma);
		
		media = soma / vetorInteiros.length;
		
		System.out.println("Média: " + media);
		
	}
}

