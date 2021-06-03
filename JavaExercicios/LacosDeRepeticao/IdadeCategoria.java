package LacosDeRepeticao; // 3

import java.util.Scanner;

public class IdadeCategoria {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int idade;
		System.out.println("\nDigite a sua idade: ");
		idade = read.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("\nCategoria infantil");

		}else if (idade >= 15 && idade <= 17) {
			System.out.println("\nCategoria juvenil");

		}else if (idade >= 18 && idade <= 25) {
			System.out.println("\nCategoria adulto");

		}else {
			System.out.println("\nValor não encomtrado na categoria");
		}
	}
}
