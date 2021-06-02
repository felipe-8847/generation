package turma24; // 6

import java.util.Scanner;

public class Distancia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pontox1,pontoy1,pontox2,pontoy2,distanciaEntreEles = 0.0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nPrimeiro ponto x: ");
		pontox1 = leia.nextDouble();
		
		System.out.println("\nPrimeiro ponto y: ");
		pontoy1 = leia.nextDouble();
		
		System.out.println("\nSegundo ponto x: ");
		pontox2 = leia.nextDouble();
		
		System.out.println("\nSegundo ponto y: ");
		pontoy2 = leia.nextDouble();
		


		distanciaEntreEles =  Math.pow(pontox1 - pontox2, 2.0) - Math.pow(pontoy1 - pontoy2, 2.0);

		double resultado = Math.sqrt(distanciaEntreEles);
		
		System.out.println("\nDistancia entre pontos: "+resultado);

	}

}
