package turma24; // 8

import java.util.Scanner;

public class Consumidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      	Scanner leia = new Scanner(System.in);


		double pImposto = 45.0,pDistribuidor = 28.0,custoDeFabrica = 0.0,valorTotal = 0.0;
				
		  System.out.println("\nDigite o valor de fabricação do veiculo:  ");
			custoDeFabrica = leia.nextDouble();

			double contaImposto = (custoDeFabrica / 100) * pImposto;

			double contadistribuicao = (custoDeFabrica / 100) * pDistribuidor;

			double valorFinal = custoDeFabrica + contaImposto + contadistribuicao;

				System.out.println("\nValor final para o cliente é de: "+valorFinal);
	

	}

}
