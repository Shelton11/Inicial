package media;

import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double nota1, nota2, nota3, resultado;

		System.out.println("Digite a Primeira Nota:");
		nota1 = in.nextDouble();

		System.out.println("Digite a Segunda Nota:");
		nota2 = in.nextDouble();

		System.out.println("Digite a Terceira Nota:");
		nota3 = in.nextDouble();

		resultado = (nota1 + nota2 + nota3) / 3;
		System.out.printf("O resultado é: %.2f \n", resultado);

		if (resultado >= 6) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}

	}

}
