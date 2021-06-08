package ClassesAula;

public class Funcionario {

	private String nome;
	private int codigoDeRegistro;
	private double salario;
	private String cargo;
	
	public Funcionario (String nome, int codigoDeRegistro, double salario, String cargo) {
		
		this.nome = nome;
		this.codigoDeRegistro = codigoDeRegistro;
		this.salario = salario;
		this.cargo =cargo;
	}
	
	public void imprimirDados() {
		// ganbiarra no salario
		
		System.out.printf("\nDados do funcionario: "+nome+"\nRegistro: "+codigoDeRegistro+"\nCargo: "+cargo+"\nSalario: "+salario+"00 reais \n");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigoDeRegistro() {
		return codigoDeRegistro;
	}

	public void setCodigoDeRegistro(int codigoDeRegistro) {
		this.codigoDeRegistro = codigoDeRegistro;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
}
