package Herancas;

public class Cavalo extends Animal{

	private double altura;
	
	public Cavalo(String nome, int idade, double d) {
		
		super(nome,idade);
		this.altura = d;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void imprimir() {
		
		System.out.println("\nO cavalo se chama: "+getNome()+" e tem "+getIdade()+" anos e ele tem altura de: "+altura);
	}
	
	public void correr() {
		
		System.out.println();
	}
}
