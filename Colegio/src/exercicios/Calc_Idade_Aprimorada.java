package exercicios;

import java.util.Scanner;

public class Calc_Idade_Aprimorada {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		final double iddRn, iddCri, iddAdole, iddAdul, iddCabra, iddCoro, iddSr, iddGuerre;
		double idd;
		iddRn = 0.9;iddCri = 13;iddAdole = 14;iddAdul = 20;iddCabra = 30;iddCoro = 40;iddSr = 60;iddGuerre = 80;
		
		do{
		
		System.out.println("Digite sua idade (Mês / Ano) ou 0 para sair:");
		idd = in.nextDouble();
		
		if(idd == 0){
			System.out.println("Até a próxima!");
		}else{
			
		}
		
		if((idd <= iddRn) && (idd > 0)){
			System.out.println("Você é um recém nascido!");
		}else{
			if((idd > iddRn) && (idd <= iddCri)){
				System.out.println("Você é uma criança!");
			}else{
				if((idd >= iddAdole) && (idd < iddAdul)){
					System.out.println("Você é um adolescente!");
				}else{
					if((idd >= iddAdul) && (idd < iddCabra)){
						System.out.println("Você é um adulto!");
					}else{
						if((idd >= iddCabra) && (idd < iddCoro)){
							System.out.println("Você é um cabra vei!");
						}else{
							if((idd >= iddCoro) && (idd < iddSr)){
								System.out.println("Você é um coroa!");
							}else{
								if((idd >= iddSr) && (idd < iddGuerre)){
									System.out.println("Você é um senhor de idade!");
								}else{
									if(idd >= iddGuerre){
										System.out.println("Você é um guerreiro.. Parabéns!!!");
									}
								}
							}
						}
					}
				}
			}
		
		}
		System.out.println();
		System.out.println();
	}while(idd != 0);
		System.out.println();
		System.out.println();
 }
	
}
