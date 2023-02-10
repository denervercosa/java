import java.util.Scanner;

public class LacosFor2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, numero = 0, impar = 0, par = 0;
		for(i=0;i<10;i++)
		{
			System.out.println("Digite um número ");
			numero = sc.nextInt();
			if(numero % 2 == 0)
			{
				par++;
			}
		else
		{
			impar++;
		}
		}
		System.out.println("Total de números pares: " + par);
		System.out.println("Total de números ímpares " + impar);
	}
}

