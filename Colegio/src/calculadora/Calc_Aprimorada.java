package calculadora;

import java.util.Scanner;

public class Calc_Aprimorada {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double num1, num2, soma, divi, mult, sub;
		int operacao;

		System.out.println("Digite 1 Para Somar");
		System.out.println("Digite 2 Para Dividir");
		System.out.println("Digite 3 Para Multiplicar");
		System.out.println("Digite 4 Para Subtrair");
		operacao = in.nextInt();

		while ((operacao < 1) && (operacao > 4)) {
			System.out.println("Operação invalida, reinicie o aplicativo!");
			break;
		}
		System.out.println("Digite o Primeiro Numero:");
		num1 = in.nextDouble();
		System.out.println("Digite o Segndo Numero:");
		num2 = in.nextDouble();

		switch (operacao) {
		case 1:
			System.out.println("O resultado da soma é:" + (num1 + num2));
			break;
		case 2:
			System.out.println("O resultado da divisão é:" + (num1 / num2));
			break;
		case 3:
			System.out.println("O resultado da multiplicação é:"
					+ (num1 * num2));
			break;
		case 4:
			System.out.println("O resultado da subtração é:" + (num1 - num2));

		}
	}
}

// }

