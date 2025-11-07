package BrunoMarques;

import java.util.Scanner;

public class BMS15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS15 - Fatorial de um número*");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		int numero, fatorial, i;
		
		System.out.print("Digite um número para calcular seu fatorial: ");
        numero = scanner.nextInt();

        
        fatorial = 1;

      
        if (numero < 0) {
            System.out.println("Não existe fatorial de número negativo.");
        } else {
    
            for (i = 1; i <= numero; i++) {
                fatorial *= i; 
            }

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
		
	}

}
