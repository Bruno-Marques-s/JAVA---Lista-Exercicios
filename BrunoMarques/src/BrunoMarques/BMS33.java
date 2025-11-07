package BrunoMarques;

import java.util.Scanner;

public class BMS33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS33 - Menu com opção de sair*");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		
		int opcao = 0;  
		
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Mensagem");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();  
            if (opcao == 1) {
                System.out.println("Você escolheu a mensagem!");
            } else if (opcao == 2) {
                System.out.println("Você escolheu sair. Programa encerrado.");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
            
        } while (opcao != 2); 
		
	}

}
