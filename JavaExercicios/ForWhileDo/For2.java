package ForWhileDo; // 2

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner read = new Scanner(System.in);
			int num,contPar = 0,contImpar = 0;
			
			for (int i = 1; i<= 10; i++) {
				System.out.println("\nDigite o numero: ");
				num = read.nextInt();
				
				if(num% 2 == 0) {
					contPar++;
				}else {
					contImpar++;
				}
			}
			System.out.printf("\nquantidade de numeros pares: %d",contPar);
			System.out.printf("\nquantidade de numeros impares: %d",contImpar);

	}

}
