package Arrays;

import java.util.Scanner;

public class Vertor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);
		
		int [] array = new int[6];
		int soma=0,contImpar=0;
		
		for(int i = 0; i < 6; i++) {
			
			System.out.println("\nDigite um valor: ");
			array[i] = read.nextInt();
			
			if(array[i] % 2 == 0) {
				System.out.println("\nNumero par: "+array[i]);
				soma += array[i];
			}
			if(array[i] % 2 == 1) {
				System.out.println("\nNumero impar: "+array[i]);
				contImpar++;
				
			}
		}
		System.out.println("\nSoma dos numeros pares: "+soma);

		System.out.println("\nQuantidade de numeros impares: "+contImpar);

	}

}
