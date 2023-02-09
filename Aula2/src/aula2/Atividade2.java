package aula2;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a;
		System.out.println("Digite um numero: ");
		a = sc.nextInt();

		if (a % 2 == 0 && a >= 0) {
			System.out.println("O número " + a + " é par e positivo!");

		} else if (a % 2 == 0 && a < 0) {
			System.out.println("O número " + a + " é par e negativo!");

		} else if (a % 2 != 0 && a > 0) {
			System.out.println("O número " + a + " é impar e positivo!");

		} else {
			System.out.println("O número " + a + " é impar e negativo!");
		}
	sc.close();
	}
}
