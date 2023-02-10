import java.util.Scanner;

public class LacosFor1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n1, n2;
		System.out.println("Digite o primeiro número do intervalo: ");
		n1 = sc.nextInt();
		
		System.out.println("Digite o ultimo número do intervalo: ");
		n2 = sc.nextInt();
		
		if (n1 > n2) {
			System.out.println("Intervalo inválido:    "
								+ "\n\nFechando programa....");
			
			System.exit(0);
		}
		
		for (int A = n1; A < n2; A++) {
			
			if(A % 3 == 0 && A % 5 == 0) {
			System.out.println(A + " É multiplo de 5 e 3");
			}
			
			
			}
		}
	}


