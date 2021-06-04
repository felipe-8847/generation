package ForWhileDo; // 6

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		float numero,cont=0,soma=0,media=0;
		
		System.out.println("\nDigite um numero: ");
		numero = read.nextInt();
		if(numero != 0) {
			
			do {
				if(numero% 3 == 0 && numero !=  0) {
					soma += numero;
					cont++;
				}
				
				System.out.println("\nDigite um numero: ");
				numero = read.nextInt();
				
				
			}while(numero != 0);
			
			media = soma / cont;
			
			System.out.printf("\nMedia dos numero: %2.2f ",media);
		}else {
			System.out.println("\nDigite um numero maior que 0 ");
		}
		
		
		
		
	}
}
