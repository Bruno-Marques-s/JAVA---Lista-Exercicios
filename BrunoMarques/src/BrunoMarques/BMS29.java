package BrunoMarques;

import java.util.Scanner;

public class BMS29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS29 - Contar dígitos de um número*");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor, digite um número positivo.");
        } else {
            int contador = 0;  

            while (numero > 0) {
                numero /= 10;  
                contador++; 
            }

            System.out.println("O número tem " + contador + " dígitos.");
        }
	}

}
