package BrunoMarques;

import java.util.Scanner;

public class BMS26 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS26 - Número primo com while*");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		
		 System.out.print("Digite um número para verificar se é primo: ");
	        int numero = scanner.nextInt();

	        int i = 2; 
	        boolean primo = true;  

	        while (i <= numero / 2) {  
	            if (numero % i == 0) {  
	                primo = false;
	                break;  
	            }
	            i++;  
	        }

	        if (primo && numero > 1) {
	            System.out.println(numero + " é um número primo.");
	        } else {
	            System.out.println(numero + " não é um número primo.");
	        }

	}
}
