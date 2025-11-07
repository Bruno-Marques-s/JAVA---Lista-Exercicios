package BrunoMarques;

import java.util.Scanner;

public class BMS27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS27 - Quantidade de números ímpares digitados*");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		
		int contadorImpares = 0;  
        int numero;
        int i = 1;  
        while (i <= 10) {
            System.out.print("Digite o " + i + "º número: ");
            numero = scanner.nextInt();

            if (numero % 2 != 0) {
                contadorImpares++;  
            }

            i++;  
        }

        System.out.println("Você digitou " + contadorImpares + " número(s) ímpar(es).");

		
	}

}
