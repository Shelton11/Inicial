package Controle;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String nome = "shelton";
		String nomeComp = "shelton luis fernandes lima";
		String nomeDigi;

		System.out.println("Digite seu primeiro nome ou o nome completo: ");
		nomeDigi = in.nextLine();

		if (nomeDigi.equals(nome)) {
			System.out.println("Seu primeiro nome esta correto!");
		} else {
			if (nomeDigi.equals(nomeComp)) {
				System.out.println("Seu nome completo esta correto!");
			} else {
				System.out.println("Seu nome esta errado!");
			}
		}
	}
}
