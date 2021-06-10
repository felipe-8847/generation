package Polimorfismo;

public abstract class Animal {

	private String nome;
	private int idade;
	private String raca; 
	
	abstract public void emitirSom(String som);
	abstract public void correr();
	
	public Animal(String raca) {
		
		this.raca = raca;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
	
	
}
