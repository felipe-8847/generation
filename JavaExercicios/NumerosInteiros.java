package turma24; // 4

import java.util.Scanner;

public class NumerosInteiros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a,b,c,d,s,r;
		
		Scanner leia = new Scanner(System.in);

		
		System.out.println("\nDidite o primeiro numero positivo maior que 0: ");
		a = leia.nextFloat();
		System.out.println("\nDidite o primeiro numero positivo maior que 0: ");
		b = leia.nextFloat();
		System.out.println("\nDidite o primeiro numero positivo maior que 0: ");
		c = leia.nextFloat();
		
		s = Math.sqrt(a + b);
		
		r = Math.pow(a,3);
		
		d = (r + s )/ 2;
		
		System.out.printf("\n","d = (r+s) / 2 = ",d);
	}

}
