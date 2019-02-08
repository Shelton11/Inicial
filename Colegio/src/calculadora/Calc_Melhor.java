package calculadora;

import java.util.Scanner;

public class Calc_Melhor {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double num1 = 0, num2 = 0, resultado = 0;
		int x = 0;

		do {

			System.out.println("Digite o Codigo da Operação:");
			System.out.println("1) Somar");
			System.out.println("2) Subtrair");
			System.out.println("3) Multiplicar");
			System.out.println("4) Dividir");
			System.out.println("0) Sair");
			x = in.nextInt();

			if (x != 0) {

				System.out.println("Digite o Primeiro Numero:");
				num1 = in.nextDouble();

				System.out.println("Digite o Segundo Numero:");
				num2 = in.nextDouble();

				if (x == 1) {
					resultado = num1 + num2;
				} else {
					if (x == 2) {
						resultado = num1 - num2;
					} else {
						if (x == 3) {
							resultado = num1 * num2;
						} else {
							if (x == 4) {
								resultado = num1 / num2;
							}
						}
					}
				}
				System.out.println();
				System.out.println();
				System.out.println("O Resultado é: " + resultado);
				System.out.println();
				System.out.println();
			}

		} while (x != 0);
	}

}
