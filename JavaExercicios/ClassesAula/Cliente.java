package ClassesAula;

public class Cliente {

	private String nomeCliente;
	private int idade;
	private boolean conta;
	
	public Cliente (String nomeCliente, int idade, boolean conta) {
		
		this.nomeCliente = nomeCliente;
		this.idade = idade;
		this.conta = conta;
		
	}
	
	public void imprimirDados() {
		
		System.out.println("\nDados do cliente: "+nomeCliente+" idade: "+idade+" anos e conta e igual a: "+conta);
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isConta() {
		return conta;
	}

	public void setConta(boolean conta) {
		this.conta = conta;
	}
	
}
