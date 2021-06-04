package ExerciciosExtra;

import java.util.Scanner;

public class Menu2 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
	
		int caso,num1,num2;
		
		System.out.println("\nMenu");
		System.out.println("\n1 - PROGRAMA AGENDA DE TELEFONES  "+"\n2 - CADASTRAR  "+"\n3 - PESQUISAR "+"\n4 - ALTERAR    "+"\n5 - CLASSIFICAR "+"\n6 - LISTAR"+"\n7 - SAIR");
		System.out.println("\nESCOLHA UMA OPÇÃO: ");
		caso = read.nextInt();
		
		
		switch (caso) {
				
			 	case 1:
			 		System.out.println("\nCaso 1");
			 		System.out.println("\nAgenda: ");
			 		break;
				
			 	case 2:
			 		System.out.println("\nCaso 2");
			 		System.out.println("\nCadastro: ");
					//agenda = read.nextLine();	
					break;
				
				case 3:
			 		System.out.println("\nCaso 3");
			 		System.out.println("\nPesquisa: ");
					num1 = read.nextInt();
			 		break;
				
			 	case 4:
			 		System.out.println("\nCaso 4");
			 		System.out.println("\nAlterar: ");
					num2 = read.nextInt();	
					break;
				
				case 5:
			 		System.out.println("\nCaso 5");
			 		System.out.println("\nClassificar: ");
					num1 = read.nextInt();
			 		break;
				
			 	case 6:
			 		System.out.println("\nCaso 6");
			 		System.out.println("\nListar: ");
					num2 = read.nextInt();	
					break;
			
				case 7:
			 		System.out.println("\nCaso 7");
			 		System.out.println("\nSair: ");
					num1 = read.nextInt();
			 		break;
			 		
			 		default:
				 		System.out.println("\nNumero invalido: ");
			}
	}
}
