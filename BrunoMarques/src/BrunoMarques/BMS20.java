package BrunoMarques;

import java.util.Scanner;

public class BMS20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS20 - Números de Fibonacci*");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		
		
		 System.out.print("Digite a quantidade de termos da sequência de Fibonacci: ");
	        int n = scanner.nextInt();

	        if (n <= 0) {
	            System.out.println("Por favor, insira um número maior que zero.");
	        } else {
	            int a = 0, b = 1;

	            System.out.println("Sequência de Fibonacci de " + n + " termos:");

	            for (int i = 1; i <= n; i++) {
	                System.out.print(a + " "); 

	                int temp = a;
	                a = b;
	                b = temp + b;  
	            }
	        }

	}

}
