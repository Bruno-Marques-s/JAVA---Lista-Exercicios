package BrunoMarques;

import java.util.Scanner;

public class BMS03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS03 - Maior de dois números.*");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		
		String continuar;
		  do {
		
		int num1, num2;
		
		
		
		System.out.println("Digite o primerio número: ");
		num1 = scanner.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = scanner.nextInt();
		
		 if (num1 > num2) {
	            System.out.println("O maior número é: " + num1);
	        } else if (num2 > num1) {
	            System.out.println("O maior número é: " + num2);
	        } else {
	            System.out.println("Os dois números são iguais.");
	        }
		 
		 System.out.println("Deseja verificar outro número? (s/n): ");
	        continuar = scanner.next();
	        
	     } while (continuar.equalsIgnoreCase("s"));
	       
	        scanner.close();
	     
	     System.out.println("Programa encerrado.");

		 
	        scanner.close();
	}
}