package Fundamentos;

public class VriaveisEConstantes {

	public static void main(String[] args) {

		/*
		 * Padr�es de nomenclatura: em uma "variavel" o nome da mesma come�a com
		 * a letra menuscula e as iniciais das proximas palavras vai come�a com
		 * letras maiusculas. Ja no caso das "constantes", todas as palavras tem
		 * que ser maiusculas e separadas por underline como o exemplo abaixo
		 * mostra,
		 */

		/**
		 * Uma variavel � preciso ter um "tipo", "indentificador" e uma
		 * "atribui��o". N�o necessariamente a "atribui��o" tem que ser
		 * atribuida no ato da declara��o da variavel.
		 */

		double raio = 4.5;
		final double PI = 3.1416;
		double area = PI * raio * raio;

		// Comando "println" imprime e quebra a linha. "print" imprime sem
		// quebrar a linha.
		System.out.println("A �rea � = " + area + "m2.");
		/**
		 * Comando "printf" substitue o "%f" pelo o valor contido na variavel
		 * "area", assim formatando a impress�o. Ja o comando "\n" � para
		 * quebrar a linha de impress�o.
		 */
		System.out.printf("A �rea � = %f m2. \n", area);
		/**
		 * Comando "printf" substitue o "%f" pelo o valor contido na variavel
		 * "area", assim formatando a impress�o. E nesse caso n�o tem o comando
		 * "\n" ! Assim ele n�o vai quebarar a linha de impress�o, tornando o
		 * cursor na mesma linha e as outras impress�es tambem caso tivesse. Mas
		 * tem o comando "%.2f" que alem de substituir esse comando pela
		 * variavel "aera", ele tambem formata a quantidade de casas decimais
		 * que sera imprimido. Nesse exemplo eu limitei a quantidade de duas
		 * casas decimais depois da virgula.
		 */
		System.out.printf("A �rea � = %.2f m2.", area);
	}
}
