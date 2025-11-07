package BrunoMarques;

import java.util.Scanner;

public class BMS08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("*ALuno: Bruno Marques - RA: 0023647*");
		System.out.println("*Classe BMS08 - Login simples.*");
		System.out.println("************************************");
		
		Scanner scanner = new Scanner(System.in);
		
		   String usuarioCorreto = "usuario123";
	       String senhaCorreta = "senha@123";
	       String usuario;
	       String senha;
	       
	        
	        System.out.print("Digite seu usuário: ");
	        usuario = scanner.nextLine();

	     
	        System.out.print("Digite sua senha: ");
	        senha = scanner.nextLine();

	        
	        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
	            System.out.println("Login realizado com sucesso!");
	        } else {
	            System.out.println("Usuário ou senha incorretos. Tente novamente.");
	        }

	        
	        scanner.close();
	}

}
