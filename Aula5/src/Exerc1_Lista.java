import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Exerc1_Lista {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ArrayList <String> cores = new ArrayList<String>();
		
		String cor;

		for(int contador = 0; contador <= 4; contador ++) {
			System.out.println("Digite a cor: ");
			cor = leia.nextLine();
			cores.add(cor);
		
		}
		
		System.out.println("Listar todas as cores: ");
		cores.forEach(System.out::println); //System.out::println é usado para imprimir
		
		Collections.sort(cores);
		System.out.println("Ordenar as cores: ");
		cores.forEach(System.out::println);
	
	
	}

}
