package exercicios;

import java.util.Scanner;

public class Calc_Idade {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		final int iddJovem, iddIdosa;
		int idd;
		iddJovem = 30;
		iddIdosa = 60;
		
		System.out.println("Digite sua idade:");
		idd = in.nextInt();
		
		if(idd <= iddJovem){
			System.out.println("Sua idade é de uma pessoa jovem!");
		}else{
			if(idd >= iddIdosa){
				System.out.println("Sua idade é de uma pessoa idosa!");
			}else{
				if((idd > iddJovem) && (idd < iddIdosa)){
					System.out.println("Você tem meia idade!");
				}
			}
			
		}
		
	}

}
