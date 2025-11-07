package BrunoMarques;

import java.util.Scanner;

public class BMS07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS07 - Triângulo válido.*");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.print("Digite o comprimento do primeiro lado: ");
        a = scanner.nextDouble();

        System.out.print("Digite o comprimento do segundo lado: ");
        b = scanner.nextDouble();

        System.out.print("Digite o comprimento do terceiro lado: ");
        c = scanner.nextDouble();

       
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Os lados formam um triângulo válido.");
        } else {
            System.out.println("Os lados não formam um triângulo válido.");
        }

    
        scanner.close();

}
}