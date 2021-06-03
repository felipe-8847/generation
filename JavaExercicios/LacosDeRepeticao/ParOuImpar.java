package LacosDeRepeticao; // 4

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		 
		Scanner read = new Scanner(System.in);
		
		double num;
		
		System.out.println("Digite um numero: ");
		num = read.nextDouble();
		
		if(num% 2 == 0) {
			num = Math.sqrt(num);
			System.out.println("\nValor: "+num);

		}else {
			num = Math.pow(num, 2.0);
			System.out.println("\nValor: "+num);
		}
	}
}
