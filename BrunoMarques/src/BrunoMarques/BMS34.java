package BrunoMarques;

import java.util.Scanner;

public class BMS34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS34 - Pedir senha até acertar*");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		
		int senha;  
		
        do {
            System.out.print("Digite a senha: ");
            senha = scanner.nextInt();  
            if (senha != 1111) {
                System.out.println("Senha incorreta! Tente novamente.");
            }
        } while (senha != 1111);  
        
        System.out.println("Acesso liberado!");
	}

}
