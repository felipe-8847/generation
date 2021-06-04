package ExerciciosExtra;

import java.util.Scanner;

public class Menu3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		
		int prato,gor;
		double valor=0.0;
		
		System.out.println("\nCardapio do restuurante");
		System.out.println("\n1 - Picanha 25,00 "+"\n2 - Lasanha 20,00   "+"\n3 - Strogonoff 18,00  "+"\n4 - Bife Acebolado 15,00     "+"\n5 - Pão com ovo 5,00 ");
		System.out.println("\nESCOLHA UMA OPÇÃO: ");
		prato = read.nextInt();
		
		switch (prato) {
				
			 	case 1:
			 		System.out.println("\nPicana 25,00");
			 		valor = 25.00;
			 		break;
				
			 	case 2:
			 		System.out.println("\nLasanha 20,00 ");
			 		valor = 20.00;
			 		break;
				
				case 3:
					System.out.println("\nStrogonoff 18,00 ");
			 		valor = 18.00;
			 		break;
				
			 	case 4:
			 		System.out.println("\nAcebolado 15,00");
			 		valor = 15.00;
			 		break;
				
				case 5:
					System.out.println("\nPão com ovo 5,00");
			 		valor = 5.00;
			 		break;
			 		
			 		default:
				 		System.out.println("\nNumero invalido: ");	 	
			}
		
				System.out.println("\nDeseja adicionar uma gorgeta de 10%: "+"\n1 - Sim"+"\n2 - Não");
				gor = read.nextInt();
				
				switch(gor) {
					case 1:
						valor = ((valor/100) * 10) + valor;
					    System.out.printf("\nValor do prato: R$: %3.2f",valor," reais");

						break;
					case 2:
					    System.out.println("\nValor do prato: R$:"+valor+" reais");
						break;
						default:
						    System.out.println("\nValor do prato invalido");

							
				}

	}
}
