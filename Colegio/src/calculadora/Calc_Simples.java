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
		System.out.println("O resultado da Soma é: "+ soma);
		
		divi = num1/num2;
		System.out.println("O Resultado da Divisão é: "+ divi);
		
		mult = num1*num2;
		System.out.println("O Resultado da Multiplicação é: "+ mult);
		
		sub = num1-num2;
		System.out.println("O Resultado da Subtração é "+ sub);
	}

}
