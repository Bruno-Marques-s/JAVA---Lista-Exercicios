package BrunoMarques;

import java.util.Scanner;

public class BMS12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS12 - Tabuada de uma número*");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		
		int i, numero;
		
		System.out.println("Digite um número para ver sua tabuada: ");
		numero = scanner.nextInt();
		
		System.out.println("Tabuada do " + numero + ":");
        for (i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
		
	}
}