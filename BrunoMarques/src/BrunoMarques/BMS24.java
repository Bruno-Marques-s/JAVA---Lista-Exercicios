package BrunoMarques;

import java.util.Scanner;

public class BMS24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS24 - Verificar se um número é positivo*");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;

        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();  
        } while (numero <= 0);  

        System.out.println("Você digitou um número positivo: " + numero);
        scanner.close();
		
	}

}
