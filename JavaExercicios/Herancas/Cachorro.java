package Herancas;

public class Cachorro extends Animal{

	private String cor;
	
	public Cachorro(String nome, int idade, String cor) {
		
		super(nome,idade);
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void imprimir() {
		
		System.out.println("\nO cachorro se chama: "+getNome()+" e tem "+getIdade()+" anos e ele é da cor: "+cor);
	}
	
	public void correr () {
		System.out.println("\nCorrendo");
	}
}
