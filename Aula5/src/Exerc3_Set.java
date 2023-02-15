import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exerc3_Set {

    public static void main(String[] args) {
    	Scanner leia = new Scanner(System.in);
    	
      Set<Integer> numeros = new HashSet<Integer>();
      
      int numero;
      
      System.out.println("Digite um número: ");
      
      for(int contador = 0; contador <= 9; contador++) {
    	  numero = leia.nextInt();
    	  numeros.add(numero);
      }
      
      Iterator<Integer> nuIte = numeros.iterator();
      System.out.println("Listar dados Set: ");
	while(nuIte.hasNext()) {
    	  System.out.println(nuIte.next());
      }
      
    }
}
