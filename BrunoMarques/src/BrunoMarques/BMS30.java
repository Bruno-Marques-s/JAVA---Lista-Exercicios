package BrunoMarques;

import java.util.Scanner;

public class BMS30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS30 - Menu até esolher sair*");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		
		 String opcao;

	        do {
	           
	            System.out.println("Menu:");
	            System.out.println("1 - Opção 1");
	            System.out.println("2 - Opção 2");
	            System.out.println("3 - Opção 3");
	            System.out.println("Digite 'sair' para encerrar.");
	            System.out.print("Escolha uma opção: ");
	            opcao = scanner.nextLine();  
	            
	            switch (opcao) {
	                case "1":
	                    System.out.println("Você escolheu a Opção 1.");
	                    break;
	                case "2":
	                    System.out.println("Você escolheu a Opção 2.");
	                    break;
	                case "3":
	                    System.out.println("Você escolheu a Opção 3.");
	                    break;
	                case "sair":
	                    System.out.println("Saindo do programa...");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }

	        } while (!opcao.equals("sair"));  
	        
	}

}
