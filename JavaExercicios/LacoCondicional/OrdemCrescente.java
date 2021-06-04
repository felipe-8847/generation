package LacosDeRepeticao; // 2

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int num1,num2,num3,r1,r2,r3;
		
		System.out.println("\nDigite o primeiro numero: ");
		num1 = read.nextInt();
		System.out.println("\nDigite o segundo numero: ");
		num2 = read.nextInt();
		System.out.println("\nDigite o terceiro numero: ");
		num3 = read.nextInt();
		
		
		
		if(num1 < num2 && num2 < num3) {
			System.out.println("\nA ordem é: "+num1+" "+num2+" "+num3);
		}else if (num2 < num1 && num1 < num3) {
			System.out.println("\nO ordem é: "+num2+" "+num1+" "+num3);
		}else {
			System.out.println("\nO ordem é: "+num3+" "+num2+" "+num1);
		}
		
	}
}
