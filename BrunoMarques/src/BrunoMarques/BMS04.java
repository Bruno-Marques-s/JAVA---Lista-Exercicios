package BrunoMarques;

import java.util.Scanner;

public class BMS04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS04 - Pode votar?.*");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);

		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = scanner.nextInt();
		
		if (idade >= 16) {
			System.out.println("Você pode votar!");
		} else {
			System.out.println("Você não pode votar.");
		}
		
		scanner.close();
	}

}
