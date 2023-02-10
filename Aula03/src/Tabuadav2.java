import java.util.Scanner;

public class Tabuadav2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		boolean ok = false;
		String continua;
		
		do {
			do {
				
				System.out.println("Digite a Tabuada que vocÃª deseja calcular: ");
				numero = leia.nextInt();
				
				if(numero < 1 || numero > 10)
					System.out.println("Digite um numero entre 1 e 10");
				else
					ok = true;
				
			}while(ok == false);
			
			int contador = 1;
			
			while(contador <= 10) {
				System.out.println("\n" + numero + " x " + contador + " = " + (numero * contador));
				contador ++;
			}
			
			ok = false;
			
			System.out.println("Deseja continuar(S/N)?: ");
			leia.skip("\\R?");
			continua = leia.nextLine();
		
		}while(continua.equalsIgnoreCase("S"));
		
		leia.close();

	}

}
