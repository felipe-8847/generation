package turma24; // 5

import java.util.Scanner;

public class NotaDeAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      	Scanner leia = new Scanner(System.in);

				float nota1,nota2,nota3,mediaFinal;
				int peso1 = 2,peso2 = 3, peso3 = 5;

				int somaDosPesos = peso1 + peso2 + peso3;

				System.out.println("\nDigite a sua nota nota 1: ");
				nota1 = leia.nextFloat();
				
				System.out.println("\nDigite a sua nota nota 2: ");
				nota2 = leia.nextFloat();
				
				System.out.println("\nDigite a sua nota nota 3: ");
				nota3 = leia.nextFloat();
				
				
				nota1 = nota1 * peso1;
				nota2 = nota2 * peso2;
				nota3 = nota3 * peso3;

				mediaFinal = (nota1 + nota2 + nota3) / somaDosPesos;

				System.out.println("\nMedia  do aluno "+mediaFinal);
	}

}
