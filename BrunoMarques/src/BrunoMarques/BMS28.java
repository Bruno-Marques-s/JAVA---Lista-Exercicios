package BrunoMarques;

public class BMS28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS28 - Soma dos pares entre 1 e 100*");
		System.out.println("************************************");
		
		
		 int soma = 0;  
	        int numero = 2;  

	        while (numero <= 100) {
	            soma += numero;  
	            numero += 2;  
	        }

	        System.out.println("A soma dos números pares entre 1 e 100 é: " + soma);
	}

}
