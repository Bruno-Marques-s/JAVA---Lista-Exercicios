package BrunoMarques;

import java.util.Scanner;

public class BMS22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS22 - Soma de números até digitar zero*");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		
	        int soma = 0;  
	        int numero;

	        do {
	            System.out.print("Digite um número (ou 0 para sair): ");
	            numero = scanner.nextInt();  
	            soma += numero;
	            
	        } while (numero != 0);  
	        System.out.println("A soma total é: " + soma);
	        scanner.close();
	}

}
