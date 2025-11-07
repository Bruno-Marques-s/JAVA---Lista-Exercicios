package BrunoMarques;

public class BMS13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS13 - Soma dos 100 primeiros números naturais*");
		System.out.println("************************************");
		
		int soma = 0;
		int i;
		
		for(i = 1; i <= 100; i++) {
			soma += i;
			
		}
		
		System.out.println("A soma dos 100 primeiros números naturais é: " + soma);
	}

}
