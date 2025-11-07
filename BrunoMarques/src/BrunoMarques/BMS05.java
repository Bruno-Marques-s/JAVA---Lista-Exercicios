package BrunoMarques;

import java.util.Scanner;

public class BMS05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS05 - Notas e aprovação.*");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		
		double nota;
		
		System.out.println("Digite a nota do aluno: ");
			nota = scanner.nextDouble();
			
		if (nota >= 6.0) {
			System.out.println("Parabéns! Você foi aprovado.");
		} else if (nota >= 4.0) {
			System.out.println("Você está de recuperação. ");
		}else {
			System.out.println("Infelizmente, você foi reprovado.");
		}
		
		scanner.close();
	}

}
