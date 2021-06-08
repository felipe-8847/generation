package ClassesAula;

public class PacienteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paciente pessoa = new Paciente("Fulano", 4848, "Alta");
		
		pessoa.imprimirDados();
		
		Paciente pessoa1 = new Paciente("Fulano de tal", 4849, "Internado");
		
		pessoa1.imprimirDados();
	}

}
