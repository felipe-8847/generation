package Polimorfismo;

public class Preguica extends Animal {

	private double guarras;
	
		public Preguica()
		{
			super("Brazuca");
	
		}
	
	
		@Override
		public void emitirSom(String som)
		{
		
			System.out.println("Zzzzzz  Zzzzz...");
		}
		
		@Override
		public void correr()
		{
		
		}
		
		public void SubirEmArvores()
		{
			System.out.println("Subindo...");
		}

}

