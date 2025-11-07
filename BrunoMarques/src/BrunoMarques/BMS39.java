package BrunoMarques;

import java.util.Scanner;

public class BMS39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS39 - Validar número entre 1 e 5*");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;

        do {
            System.out.print("Digite um número entre 1 e 5: ");
            numero = scanner.nextInt();
        } while (numero < 1 || numero > 5);

        System.out.println("Número válido: " + numero);

        scanner.close();
	}

}
