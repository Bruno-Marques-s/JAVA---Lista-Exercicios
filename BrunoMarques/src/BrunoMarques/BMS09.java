package BrunoMarques;

import java.util.Scanner;

public class BMS09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS09 - Ordem crescente 3 num.*");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2, num3;
	
		System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        num3 = scanner.nextInt();

        if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                System.out.println("Ordem crescente: " + num1 + ", " + num2 + ", " + num3);
            } else {
                System.out.println("Ordem crescente: " + num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                System.out.println("Ordem crescente: " + num2 + ", " + num1 + ", " + num3);
            } else {
                System.out.println("Ordem crescente: " + num2 + ", " + num3 + ", " + num1);
            }
        } else {
            if (num1 <= num2) {
                System.out.println("Ordem crescente: " + num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println("Ordem crescente: " + num3 + ", " + num2 + ", " + num1);
            }
        }

        scanner.close();
	}

}
