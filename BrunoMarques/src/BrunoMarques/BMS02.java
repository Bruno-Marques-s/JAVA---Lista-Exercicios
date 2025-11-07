package BrunoMarques;

import java.util.Scanner;

public class BMS02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS02 - Par o ímpar.*");
		System.out.println("************************************");
		
	     Scanner scanner = new Scanner(System.in);
	      
	     String continuar;
	     
	     do {
	     
	        System.out.println("Digite um número: ");
	        int numero = scanner.nextInt();

	      
	        if (numero % 2 == 0) {
	            System.out.println("O número " + numero + " é PAR.");
	        } else {
	            System.out.println("O número " + numero + " é ÍMPAR.");
	        }

	        System.out.println("Deseja verificar outro número? (s/n): ");
	        continuar = scanner.next();
	        
	     } while (continuar.equalsIgnoreCase("s"));
	       
	        scanner.close();
	     
	     System.out.println("Programa encerrado.");
		
	}

}
