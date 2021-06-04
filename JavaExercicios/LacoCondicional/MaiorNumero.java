package LacosDeRepeticao; // 1

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int num1,num2,num3;
		
		System.out.println("\nDigite o primeiro numero: ");
		num1 = read.nextInt();
		System.out.println("\nDigite o segundo numero: ");
		num2 = read.nextInt();
		System.out.println("\nDigite o terceiro numero: ");
		num3 = read.nextInt();
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.println("\nO maior numero é o: "+num1);
		}else if (num2 >= num1 && num2 >= num3) {
			System.out.println("\nO maior numero é o: "+num2);
		}else {
			System.out.println("\nO numero mairo é o: "+num3);
		}
	}
}
