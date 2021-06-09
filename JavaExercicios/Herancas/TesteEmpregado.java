package Herancas;

public class TesteEmpregado {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empregado1 felipe = new Empregado1 ("Felipe","Rua Que Sobe e Desce,1222","99344455566",585684433,27,111,4500,15);

		felipe.validarCpf();
		felipe.imprimirInfo();
		felipe.calcularSalario();
		
		Operario joao = new Operario ("joão","Rua aquelala,2","23777566",945814433,48,25.5,5.5);
		
		joao.validarCpf();
		joao.imprimirInfo();
		
		Fornecedor maria = new Fornecedor ("maria","Rua Desce cedo,5522","23345555566",925844433,28,50.00,12.00);
		
		maria.validarCpf();
		maria.imprimirInfo();
	
	}

}
