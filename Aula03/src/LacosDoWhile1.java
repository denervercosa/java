import java.util.Scanner;

public class LacosDoWhile1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0, somaPositivos = 0;
		
		do {
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		if(numero>0)
		{
			somaPositivos += numero;
		}
		}while(numero != 0);
		System.out.println("A soma dos números positivos é: " + somaPositivos);
	}
}