package calculadora;

import java.util.Scanner;

public class Calc_Simples {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner (System.in);
		double num1, num2, soma, divi, mult, sub;
		
		System.out.println("CALCULADORA");
		
		System.out.println("Digite o Primeiro Numero:");
		num1 = in.nextDouble();
		
		System.out.println("Digite o Segundo Numero:");
		num2 = in.nextDouble();
		
		soma = num1+num2;
		System.out.println("O resultado da Soma �: "+ soma);
		
		divi = num1/num2;
		System.out.println("O Resultado da Divis�o �: "+ divi);
		
		mult = num1*num2;
		System.out.println("O Resultado da Multiplica��o �: "+ mult);
		
		sub = num1-num2;
		System.out.println("O Resultado da Subtra��o � "+ sub);
	}

}
