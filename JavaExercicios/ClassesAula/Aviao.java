package ClassesAula;

public class Aviao {

	private String modelo;
	private int quantidadeDePassageiros;
	
	
	public Aviao (String modelo, int quantidadeDePassageiros) {
		
		this.modelo = modelo;
		this.quantidadeDePassageiros = quantidadeDePassageiros;	
	}
	
	public void imprimirDados() {
		
		System.out.println("\nDados do avião e modelo: "+modelo+" quantidade de passageiros: "+quantidadeDePassageiros+" passageiros");
	}


	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getQuantidadeDePassageiros() {
		return quantidadeDePassageiros;
	}

	public void setQuantidadeDePassageiros(int quantidadeDePassageiros) {
		this.quantidadeDePassageiros = quantidadeDePassageiros;
	}
	
	
}
