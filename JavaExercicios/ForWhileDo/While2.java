package ForWhileDo; // 4

import java.util.Scanner;

public class While2 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int idade,sexo,outras,cont = 0,contC=0,contMn=0,contHa=0,contOc=0,contPcMais=0,contPcMenos=0;
		
		System.out.println("\nDigite a sua idade: ");
		idade = read.nextInt();
		
		System.out.println("\nEscolha um numero referente ou seu sexo: "+"\n1 - Feminino"+"\n2 - Masculino"+"\n3 - Outros");
		sexo = read.nextInt();
		
		System.out.println("\nEscolha um numero referente  ou que mais se enquadra com voçe: "+"\n1 - se a pessoa era calma"+"\n2 - se a pessoa era nervosa"+"\n3 - se a pessoa era agressiva");
		outras = read.nextInt();
		
		while(cont < 1) {
			if(outras == 1) {
				contC++;
			}
			if(sexo == 1 && outras == 2) {
				contMn++;
			}
			if(sexo == 2 && outras == 3) {
				contHa++;
			}
			if(sexo == 3 && outras == 1) {
				contOc++;
			}
			if(idade > 40 && outras == 2) {
				contPcMais++;
			}
			if(idade < 18 && outras == 1) {
				contPcMenos++;
			}
			cont++;
			System.out.println("\nDigite a sua idade: ");
			idade = read.nextInt();
			
			System.out.println("\nEscolha um numero referente ou seu sexo: "+"\n1 - Feminino"+"\n2 - Masculino"+"\n3 - Outros");
			sexo = read.nextInt();
			
			System.out.println("\nEscolha um numero referente  ou que mais se enquadra com voçe: "+"\n1 - se a pessoa era calma;"+"\n2 - se a pessoa era nervosa"+"\n3 - se a pessoa era agressiva");
			outras = read.nextInt();
			
		}
		
		System.out.println("\nO número de pessoas calmas: "+contC);
		
		System.out.println("\nO número de mulheres nervosas: "+contMn);

		System.out.println("\nO número de homens agressivos: "+contHa);

		System.out.println("\nO número de outros calmos: "+contOc);

		System.out.println("\nO número de pessoas nervosas com mais de 40 anos: "+contPcMais);
		
		System.out.println("\nO número de pessoas calmas com menos de 18 anos: "+contPcMenos);

		
	}

}
