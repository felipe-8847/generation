package ExerciciosExtra;

import java.util.Scanner;

public class MesDoAno4 {

	public static void main(String[] args) {
					
			Scanner read = new Scanner(System.in);
			
		
			int mes,n1 = 30,n2 = 31,n3 =28;
			
			System.out.println("\nSelecione o numero do mes correspondente: ");
			System.out.println("\n1 - janeiro"+"\n2 - fevereiro"+"\n3 - março"+"\n4 - abril"+"\n5 - maio"+"\n6 - junho"+"\n7 - julho"+"\n8 - agosto"+"\n9 - setembro"+"\n10 - outubro"+"\n11 - novembro"+"\n12 - dezembro");
			System.out.println("\nESCOLHA UMA OPÇÃO: ");
			mes = read.nextInt();
			
			
			switch (mes) {
					
				 	case 1:
				 		System.out.println("\nJaneiro "+n2+" dias");
				 		break;
					
				 	case 2:
				 		System.out.println("\nFevereiro "+n3+" dias");
				 		break;
					
					case 3:
						System.out.println("\nMarço "+n2+" dias");
				 		break;
				 	case 4:
				 		System.out.println("\nAbril "+n1+" dias");
				 		break;
					
					case 5:
						System.out.println("\nMaio "+n2+" dias");
				 		break;
					
				 	case 6:
				 		System.out.println("\nJunho "+n1+" dias");
				 		break;
				
					case 7:
						System.out.println("\nJulho "+n2+" dias");
				 		break;
					case 8:
						System.out.println("\nAgosto "+n2+" dias");
				 		break;
					
				 	case 9:
				 		System.out.println("\nSetembro "+n1+" dias");
				 		break;
					
					case 10:
				 		System.out.println("\nOutubro "+n2+" dias");
				 		break;
					
				 	case 11:
				 		System.out.println("\nNovembro "+n1+" dias");
				 		break;
				
					case 12:
						System.out.println("\nDezembro "+n2+" dias");
				 		break;
				 		
				 		default:
					 		System.out.println("\nNumero invalido: ");
			}
	}
}
