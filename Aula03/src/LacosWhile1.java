import java.util.Scanner;

public class LacosWhile1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade = 1, soma_menor = 0, soma_maior = 0;
		while(idade >=0) {
			System.out.println("Digite uma idade: ");
			idade = sc.nextInt();
			
			if(idade < 0) {
				System.out.println("> Fim <\n");
			}else {
				if(idade < 21 && idade != 0) {
					soma_menor += 1;
				}else if(idade > 50) {
					soma_maior += 1;
				}
			}
		}
		System.out.println("Total de pessoas com menos de 21 anos: " + soma_menor);
		System.out.println("Total de pessoas com menos de 21 anos: " + soma_maior);
		

	}

}
