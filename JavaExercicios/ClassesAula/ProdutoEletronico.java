package ClassesAula;

public class ProdutoEletronico {

	private String marca;
	private String potencia;
	private int volume;
	private double preco;
	
	public ProdutoEletronico(String marca, String potencia, int volume, double preco) {
		
		this.marca = marca;
		this.potencia = potencia;
		this.volume = volume;
		this.preco = preco;
		
	}
	
	public void mostrarDados() {
		
		System.out.println("\nDados do produto: \nMarca: "+marca+"\nPotencia: "+potencia+"\nVolume: "+volume+"\nPreço: "+preco);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
