package Controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String nome = "shelton";
		String nomeDigi;
		
		System.out.println("Digite seu nome: ");
		nomeDigi = in.nextLine();
		
		if(nome.equals(nomeDigi)){
			System.out.println("Seu nome esta correto!");
		}else{
			System.out.println("Seu nome esta errado!");
		}
		
	}

}
