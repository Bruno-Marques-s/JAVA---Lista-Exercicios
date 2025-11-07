package BrunoMarques;

import java.util.Scanner;

public class BMS06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS06 - Múltiplo de 3 e 5.*");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um número: ");
        numero = scanner.nextInt();

      
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("O número é múltiplo de 3 e 5.");
        } else if (numero % 3 == 0) {
            System.out.println("O número é múltiplo de 3.");
        } else if (numero % 5 == 0) {
            System.out.println("O número é múltiplo de 5.");
        } else {
            System.out.println("O número não é múltiplo de 3 nem de 5.");
        }

        
        scanner.close();
	}

}
