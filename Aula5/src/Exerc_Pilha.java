import java.util.Stack;

public class Exerc_Pilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		
		
		pilha.push("Dener");
		pilha.push("Jaine");
		pilha.push("Fabio");
		pilha.push("Lia");
		pilha.push("Andreza");
		pilha.push("Raphael");
	
		for(var elemento : pilha)
			System.out.println(elemento);
		
		System.out.println("Remover 1 elemento da fila");
		
		pilha.pop();
		
		for(var elemento : pilha) 
				System.out.println(elemento);
			
		System.out.println("Topo da pilha: " + pilha.peek());
	
	

}
}