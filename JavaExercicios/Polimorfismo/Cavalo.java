package Polimorfismo;

public class Cavalo extends Animal{

	public Cavalo()
	{
		super("Aquela-lá");

	}


	@Override
	public void emitirSom(String som)
	{
	
		System.out.println("Sei la o som dele...");
	}
	
	@Override
	public void correr()
	{
		System.out.println("Estou cavalgando");
	}
}

