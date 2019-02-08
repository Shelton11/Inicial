package exercicios;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.*;

public class Media_Com_Array {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int[] valores = new int[7];
		
		for(int num = 0; num < 7; num++){
		    System.out.printf("Digite o numero da posição [%d]: ", num+1);
		    valores[num] = in.nextInt();
		    		
		}
		int soma = 0;
		for(int x = 0; x < 7; x++){
			soma += valores[x];
		}
//		System.out.println(Arrays.toString(valores));
	}

}
