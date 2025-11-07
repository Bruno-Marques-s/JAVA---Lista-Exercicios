package BrunoMarques;

import java.util.Scanner;

public class BMS35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS35 - Número positivo obrigatório*");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;  
		
        do {
            System.out.print("Digite um número positivo: ");
            numero = scanner.nextInt();  
            
            if (numero <= 0) {
                System.out.println("Número inválido! O número deve ser positivo.");
            }
        } while (numero <= 0);  
        
        System.out.println("Você digitou o número positivo: " + numero);

        scanner.close();
	}

}
