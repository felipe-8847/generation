package Herancas;

import java.util.Scanner;

public class HerancaClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int numero;

		System.out.println("\nDigite o numero da sua escolha \n1 - Cachorro \n2 - Cavalo \n3 - Preguiça ");
		numero = read.nextInt();
		
		if(numero > 0 && numero < 4) {
			
			switch (numero) {
			
			case 1:
			Cachorro pet = new Cachorro("dog",12,"marrom");
			//System.out.println("\nDigite o nome do cachorro");
			//pet.setNome(read.nextLine());
			
			pet.imprimir();
			
			pet.correr();
			
			break;
			case 2:
						
				Cavalo cavalo1 = new Cavalo("porshe",20,1.90);
				
				cavalo1.imprimir();
				
				cavalo1.correr();
				
				break;
			case 3:
						
				Preguica dorme = new Preguica("Só dorme",25,0.30);
				
				dorme.imprimir();
				
				dorme.subir();
				
				break;
				
				default:
		
			}
		}else {
			System.out.println("\nValor errado.");
		}

	
		
	}

}
