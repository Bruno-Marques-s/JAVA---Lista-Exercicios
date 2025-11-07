package BrunoMarques;

import java.util.Scanner;

public class BMS38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS38 - Confirmar saída com 's'*");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		
		char opcao;
		
		 do {
	           
	            System.out.println("\nMenu:");
	            System.out.println("1 - Opção A");
	            System.out.println("2 - Opção B");
	            System.out.println("3 - Opção C");
	            System.out.println("S - Sair");

	            System.out.print("Deseja sair? (Digite 's' para sim ou qualquer outra tecla para continuar): ");
	            opcao = scanner.next().charAt(0);  
	            
	            if (opcao != 's' && opcao != 'S') {
	                System.out.println("Você escolheu continuar.");
	            }
	        } while (opcao != 's' && opcao != 'S'); 
		 
	        System.out.println("Saindo... Programa encerrado.");

	        scanner.close();
	}

}
