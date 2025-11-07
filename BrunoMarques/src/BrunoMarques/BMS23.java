package BrunoMarques;

import java.util.Scanner;

public class BMS23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS23 - Senha correta*");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		
		String senhaCorreta = "1234";  
        String senhaDigitada;

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();  
        } while (!senhaDigitada.equals(senhaCorreta));
        
        System.out.println("Senha correta! Acesso concedido.");
	}

}
