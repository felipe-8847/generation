package ClassesAula;

public class Patinete {

	private String marca;
	private String cor;
	private int velocidade;
	private boolean eletrico;
	
	public Patinete(String marca, String cor, int velocidade, boolean eletrico) {
		
		this.marca = marca;
		this.cor = cor;
		this.velocidade = velocidade;
		this.eletrico = eletrico;
	}
	
	public void imprimirDados() {
		
		System.out.println("\nDados do patinete: "+"\nMarca: "+marca+"\nCor: "+cor+"\nVelocidade: "+velocidade+" km por hora\nEletrico: "+eletrico);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public boolean isEletrico() {
		return eletrico;
	}

	public void setEletrico(boolean eletrico) {
		this.eletrico = eletrico;
	}
	
	
}
