package turma24; // 7
import java.util.Scanner;
 
public class Limeares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		float a,b,c,d,e,f,x,y;
		
		System.out.println("\nValor de a: ");
		a = leia.nextFloat();
		
		System.out.println("\nValor de b: ");
		b = leia.nextFloat();
		
		System.out.println("\nValor de c: ");
		c = leia.nextFloat();
		
		System.out.println("\nValor de d: ");
		d = leia.nextFloat();
		
		System.out.println("\nValor de e: ");
		e = leia.nextFloat();
		
		System.out.println("\nValor de f: ");
		f = leia.nextFloat();
		
		x = (c*e)-(b*f) / (a*e)-(b*d);
		
		y = (a*f)-(c-d) / (a*e) - (b*d);
		
		System.out.println("\nValor de x: "+x);
		System.out.println("\nValor de y: "+y);


	}

}
