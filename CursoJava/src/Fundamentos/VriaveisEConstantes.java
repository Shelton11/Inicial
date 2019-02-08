package Fundamentos;

public class VriaveisEConstantes {

	public static void main(String[] args) {

		/*
		 * Padrões de nomenclatura: em uma "variavel" o nome da mesma começa com
		 * a letra menuscula e as iniciais das proximas palavras vai começa com
		 * letras maiusculas. Ja no caso das "constantes", todas as palavras tem
		 * que ser maiusculas e separadas por underline como o exemplo abaixo
		 * mostra,
		 */

		/**
		 * Uma variavel é preciso ter um "tipo", "indentificador" e uma
		 * "atribuição". Não necessariamente a "atribuição" tem que ser
		 * atribuida no ato da declaração da variavel.
		 */

		double raio = 4.5;
		final double PI = 3.1416;
		double area = PI * raio * raio;

		// Comando "println" imprime e quebra a linha. "print" imprime sem
		// quebrar a linha.
		System.out.println("A área é = " + area + "m2.");
		/**
		 * Comando "printf" substitue o "%f" pelo o valor contido na variavel
		 * "area", assim formatando a impressão. Ja o comando "\n" é para
		 * quebrar a linha de impressão.
		 */
		System.out.printf("A área é = %f m2. \n", area);
		/**
		 * Comando "printf" substitue o "%f" pelo o valor contido na variavel
		 * "area", assim formatando a impressão. E nesse caso não tem o comando
		 * "\n" ! Assim ele não vai quebarar a linha de impressão, tornando o
		 * cursor na mesma linha e as outras impressões tambem caso tivesse. Mas
		 * tem o comando "%.2f" que alem de substituir esse comando pela
		 * variavel "aera", ele tambem formata a quantidade de casas decimais
		 * que sera imprimido. Nesse exemplo eu limitei a quantidade de duas
		 * casas decimais depois da virgula.
		 */
		System.out.printf("A área é = %.2f m2.", area);
	}
}
