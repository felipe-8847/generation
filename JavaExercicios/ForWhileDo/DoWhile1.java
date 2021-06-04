package ForWhileDo; // 5

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int numero,soma=0;
		
		System.out.println("\nDigite um numero: ");
		numero = read.nextInt();
		
		do{
			if(numero != 0) {
				System.out.println("\nNumero: "+numero);
				soma += numero;
			}
			System.out.println("\nDigite um numero: ");
			numero = read.nextInt();
			
		}while(numero != 0);
		
		System.out.println("\nSoma dos numeros digitados: "+soma);
	}
}
