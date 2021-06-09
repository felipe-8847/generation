package Herancas;

public class Preguica extends Animal {

	private double guarras;
	
	public Preguica(String nome, int idade, double d) {
		
		super(nome,idade);
		this.guarras = d;
	}

	public double getGuarras() {
		return guarras;
	}

	public void setGuarras(double guarras) {
		this.guarras = guarras;
	}
	
	public void imprimir() {
		
		System.out.println("\nO bicho preguiça se chama: "+getNome()+" e tem "+getIdade()+" anos e tem guarras de: "+guarras);
	}
	
	
	public void subir() {
		
		System.out.println("\nEstou subindo");
	}

}

