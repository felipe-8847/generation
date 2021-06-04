package ExerciciosExtra;

import java.util.Scanner;

public class Menu1 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int caso,num1,num2,soma;
		double r;
		
		System.out.println("\nMenu");
		System.out.println("\n1 - Soma"+"\n2 - Raiz quadrada"+"\n3 - Finalizar");
		System.out.println("\nEscolha um caso: ");
		caso = read.nextInt();
		
		switch (caso) {
			
		 	case 1:
		 		System.out.println("\nCaso 1");
		 		System.out.println("\nDigite o primeiro numero: ");
				num1 = read.nextInt();
				System.out.println("\nDigite o segundo numero: ");
				num2 = read.nextInt();
				soma = num1 + num2;
				System.out.println("\nA soma dos numeros é de: "+soma);

		 		break;
			
		 	case 2:
		 		System.out.println("\nCaso 2");
		 		System.out.println("\nDigite o numero: ");
				r = read.nextInt();
				r = Math.sqrt(r);
		 		System.out.println("\na raiz quadrada do seu numero é: "+r);
		 		break;
		 	case 3:
		 		System.out.println("\nSistema finalizado");
		 		break;
		 		
		 		default:
			 		System.out.println("\nInvalido");

		}
		
		
	}
}
