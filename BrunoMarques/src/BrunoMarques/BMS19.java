package BrunoMarques;

import java.util.Scanner;

public class BMS19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS19 - Verificar se um número é primo*");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número para verificar se é primo: ");
        int numero = scanner.nextInt();

       
        if (numero <= 1) {
            System.out.println(numero + " não é um número primo.");
        } else {
            boolean primo = true;  

        
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;  
                    break; 
            }

            if (primo) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
            }
          }
           
        }
	}

}
