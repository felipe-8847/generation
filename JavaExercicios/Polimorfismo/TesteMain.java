package Polimorfismo;

public class TesteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro dog = new Cachorro();
		
		Cavalo pow = new Cavalo();
		
		Preguica soDorme = new Preguica();
		
		dog.correr();
		dog.emitirSom(null);
		System.out.println("\n");
		
		pow.correr();
		pow.emitirSom(null);
		System.out.println("\n");

		
		
		soDorme.SubirEmArvores();
		soDorme.emitirSom(null);
		
		
		
		
	}

}
