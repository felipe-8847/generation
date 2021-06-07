package Arrays;

import java.util.Scanner;

public class Matriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);
		
		final int linha=3,coluna=3;
		int[][] matriz = new int[linha][coluna];
		int contM=0;
		
		for(int l = 0; l < linha; l++) {
			
			for(int c = 0; c < coluna; c++) {
				
				System.out.println("\nDigite um valor na posição: Linha: "+l+" E Coluna: "+c);
				matriz [l][c] = read.nextInt();
				
				if(matriz [l][c] > 10) {
					contM++;
				}
			}
		}
		System.out.println("\nA matriz possui: "+contM+" casas com numeros maiores que 10.");
	}

}
