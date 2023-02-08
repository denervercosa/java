package aula_01;

import java.util.Scanner;

public class Nota1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float nota1,nota2,nota3,nota4,mediaFinal;
		
		System.out.println("Digite Nota 1");
		nota1 = sc.nextFloat();
		System.out.println("Digite Nota 2");
		nota2 = sc.nextFloat();
		System.out.println("Digite Nota 3");
		nota3 = sc.nextFloat();
		System.out.println("Digite Nota 4");
		nota4 = sc.nextFloat();
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("A média final é: "+mediaFinal);
		
		
	
		
		// TODO Auto-generated method stub

	}

}