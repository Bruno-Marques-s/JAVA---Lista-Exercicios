package BrunoMarques;

import java.util.Scanner;

public class BMS25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS25 - Tabuada com while*");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = scanner.nextInt();

        int i = 1; 
        
    
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;  
        }

	}

}
