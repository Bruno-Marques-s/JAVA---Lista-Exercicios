package BrunoMarques;

import java.util.Scanner;

public class BMS10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS10 - Ano bissexto*");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		
		int ano;
		
		System.out.println("Digite um ano: ");
		ano = scanner.nextInt();
		
		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

        scanner.close();
        
		
	}

}
