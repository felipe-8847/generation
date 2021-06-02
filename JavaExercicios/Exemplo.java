package turma24;
import java.util.Scanner;

public class Exemplo {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			double n1,n2,n3,media;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			
			media = (n1+n2+n3)/3;
			
			System.out.println("\nMédia aritmética: "+media);
			System.out.printf("\nMédia aritmética arredondada: %2.2f",media);
			
			n1 = Math.sqrt(Math.sqrt(n2));
			n3 = Math.pow(n1,3);
			media = n1 % n2;
			
			
		}

	}

