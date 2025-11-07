package BrunoMarques;

import java.util.Scanner;

public class BMS32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS32 - Tabuada de um número*");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
        
        do {
            System.out.print("Digite um número para ver sua tabuada: ");
            numero = scanner.nextInt();
            
            if (numero <= 0) {
                System.out.println("Por favor, digite um número positivo.");
            }
        } while (numero <= 0);  
        
        int i = 1;  
        
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;  
        }
	}

}
