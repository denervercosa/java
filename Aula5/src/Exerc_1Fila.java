import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;

public class Exerc_1Fila {

public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	Queue <String> nomes = new LinkedList<String>();
	
	int opcao = 6;
	String nome;
	
	do {
		System.out.println("1- Adicionar cliente na fila");
		System.out.println("2- Listar todos os clientes");
		System.out.println("3- Retirar cliente da fila");
		System.out.println("0 - Sair");
		System.out.println("Entre com a opção desejada: ");
		opcao = leia.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Digite o nome: ");
			leia.skip("\\R?");
			nome = leia.nextLine();
			nomes.add(nome);
			System.out.println("Fila: ");
			System.out.println("Cliente adicionado!");
			break;
			
		case 2:
			System.out.println("Lista de clientes na Fila: ");
			nomes.forEach(System.out::println);
			break;
		case 3:
			System.out.println("Fila: ");
			nomes.poll();
			System.out.println("O cliente foi chamado!");
			break;
			default:
			System.out.println("Programa finalizado!!!");
		}
		
	}while(opcao != 0);
	
}

}
	

