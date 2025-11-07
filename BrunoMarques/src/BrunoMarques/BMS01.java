package BrunoMarques;

import java.util.Scanner;

public class BMS01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS01 - Número positivo ou negativo*");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double numero = scanner.nextDouble();
		
		if (numero > 0) {
			System.out.printf("O número %.0f é positivo.\n", numero);
		} else if (numero < 0) {
			System.out.printf("O número %.0f é negativo.\n", numero );		
		} else {
			System.out.println("O número é zero.");
		}
		
	scanner.close();
		
	
	}

}
