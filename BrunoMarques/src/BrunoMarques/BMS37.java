package BrunoMarques;

import java.util.Scanner;

public class BMS37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS37 - Soma até o número ser múltiplo de 10*");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
        int soma = 0;  
        
        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt(); 
            soma += numero;  
        } while (numero % 10 != 0);  
        
        System.out.println("Soma total dos números: " + soma);

        scanner.close();
		
	}

}
