package ClassesAula;

public class Paciente {

	private String nome;
	private int codigoIdentificador;
	private String estado;
	
	
	public Paciente (String nome, int codigoIdentificador, String estado) {
		
		this.nome = nome;
		this.codigoIdentificador = codigoIdentificador;
		this.estado = estado;
	}
	
	public void imprimirDados () {
		System.out.println("\nDados do paciente  \nnome: "+nome+"\nCodigo: "+codigoIdentificador+" \nEstado: "+estado);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigoIdentificador() {
		return codigoIdentificador;
	}

	public void setCodigoIdentificador(int codigoIdentificador) {
		this.codigoIdentificador = codigoIdentificador;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
