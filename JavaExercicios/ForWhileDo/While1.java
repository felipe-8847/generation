package ForWhileDo; // 3

import java.util.Scanner;

public class While1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner read = new Scanner(System.in);
			int idade,a = 0,b = 0;
			System.out.println("\nDigite a sua idade: ");
			idade = read.nextInt();
			
			
			while(idade != -99) {
				
				if(idade < 21) {
					a++;
				}else if (idade > 50) {
					b++;
				}
				System.out.println("\nDigite a sua idade: ");
				idade = read.nextInt();
			}
			System.out.println("\nTotal de pessoas com menos de 21 anos: "+a);
			System.out.println("\nTotal de pessoas com mais de 50 anos: "+b);

	}
}
