package Arrays;

import java.util.Scanner;

public class Vetor1 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		final int y = 6;
		int [] array1 = {1,0,5,-2,-5,7};
		int soma;
		
		int [] a = new int[y];
		
		for (int i = 0; i < y; i++) {
			
			System.out.println("\nDigite o valor: ");
			a [i] = read.nextInt();
		
		}
		soma = a[0] + a[1] + a[5];
		System.out.println("\nValor da soma: "+soma);
		
		System.out.println("\nDigite o valor 100: ");
		a [4] = read.nextInt();
		
		for(int i = 0; i < y; i++) {
			System.out.println("\nValor de cada posição: "+a[i]);
		}
	
		
		
	}

}
