package ClassesAula;

public class ContaBancaria {

	private String nome;
	private double saldo;
	
	
	public ContaBancaria(String nome, double saldo) {
		
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public void imprimirDados() {
		System.out.println("\nDados da conta: \nCliente: "+nome+"\nSaldo: "+saldo+"00 reais");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
