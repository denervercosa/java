package aula_01;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Salario Bruto");
		salarioBruto = sc.nextFloat();
		System.out.println("Adicional Noturno");
		adicionalNoturno = sc.nextFloat();
		System.out.println("Horas Extras");
		horasExtras = sc.nextFloat();
		System.out.println("Descontos");
		descontos = sc.nextFloat();
		
		salarioLiquido = (salarioBruto + adicionalNoturno + (horasExtras *5)) - descontos;
		System.out.println("Salario Liquido: "+salarioLiquido);
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
