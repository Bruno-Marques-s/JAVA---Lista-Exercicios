package BrunoMarques;

import java.util.Scanner;

public class BMS40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS40 - Ler números e mostrar o maior (até digitar negativo)*");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		
		 int numero, maiorNumero = Integer.MIN_VALUE;

	        do {
	            System.out.print("Digite um número (negativo para sair): ");
	            numero = scanner.nextInt();

	            if (numero >= 0 && numero > maiorNumero) {
	                maiorNumero = numero;
	            }
	        } while (numero >= 0);

	        System.out.println("O maior número positivo digitado foi: " + maiorNumero);

	        scanner.close();
	}

}
