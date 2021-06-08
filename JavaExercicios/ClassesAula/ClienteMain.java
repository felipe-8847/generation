package ClassesAula;

public class ClienteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente fulano1 = new Cliente("felipe",27,true);
		
		fulano1.imprimirDados();
		
		Cliente fulano2 = new Cliente("fulano",20,false);
		
		fulano2.imprimirDados();
	}

}
