package Arrays;

import java.util.Scanner;

public class Matriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		final int linha=2,coluna=2;
		int[][] matriz1 = new int[linha][coluna],matriz2 = new int[linha][coluna],soma = new int[linha][coluna],subtrair = new int[linha][coluna];
		int numero;
		
		for(int l = 0; l < linha; l++) {
			
			for(int c = 0; c < coluna; c++) {
				System.out.println("\nPrimeira matriz");
				System.out.println("\nDigite um valor na posição: Linha: "+l+" E Coluna: "+c);
				matriz1 [l][c] = read.nextInt();
			
			}
		}
		
		for(int l = 0; l < linha; l++) {
			
			for(int c = 0; c < coluna; c++) {
				System.out.println("\nSegunda matriz");
				System.out.println("\nDigite um valor na posição: Linha: "+l+" E Coluna: "+c);
				matriz2 [l][c] = read.nextInt();
			
			}
		}
		
		System.out.println("\nEscolha uma das opçoes abaixo: ");
		System.out.println("\n1 - somar as duas matrizes \n2 - subtrair a primeira matriz da segunda \n3 - adicionar uma constante as duas matrizes \n4 - imprimir as matrizes");
		numero = read.nextInt();
		
		
		switch(numero) {
		
		case 1:	
			for(int l = 0; l < linha; l++) {
				
				for(int c = 0; c < coluna; c++) {
					soma [l][c] = matriz1 [l][c] + matriz2 [l][c];		
				}
			}
			for(int l = 0; l < linha; l++) {
				for(int c = 0; c < coluna; c++) {
					
					System.out.println("\nMatriz 3 soma: "+soma [l][c]);
		
			}
			}
			break;
	
		case 2:
			for(int l = 0; l < linha; l++) {
				
				for(int c = 0; c < coluna; c++) {
					subtrair [l][c] = matriz1 [l][c] + matriz2 [l][c];			
				}
			}
			for(int l = 0; l < linha; l++) {
				for(int c = 0; c < coluna; c++) {
			
					System.out.println("\nMatriz 4 subtrair: "+subtrair [l][c]);
			}
		}		
			break;
		
		case 3:

			System.out.println("\nEscolha um valor para a constante da primeira matriz: ");
			matriz1 [1][2] = read.nextInt();
			
			System.out.println("\nEscolha um valor para a constante da segunda matriz: ");
			matriz1 [2][1] = read.nextInt();
			
			break;
			
		case 4:
			
			
			for(int l = 0; l < linha; l++) {
				
				for(int c = 0; c < coluna; c++) {
					System.out.println("\nMatriz 1: "+matriz1 [l][c]);
		
			}
			}
			for(int l = 0; l < linha; l++) {
				for(int c = 0; c < coluna; c++) {
				
					System.out.println("\nMatriz 2: "+matriz2 [l][c]);
					
			}
			}
			for(int l = 0; l < linha; l++) {
				for(int c = 0; c < coluna; c++) {
					
					System.out.println("\nMatriz 3 soma: "+soma [l][c]);
		
			}
			}
			for(int l = 0; l < linha; l++) {
				for(int c = 0; c < coluna; c++) {
			
					System.out.println("\nMatriz 4 subtrair: "+subtrair [l][c]);
			}
		}			
     }
   }
}
