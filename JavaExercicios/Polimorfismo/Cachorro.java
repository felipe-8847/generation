package Polimorfismo;

public class Cachorro extends Animal{

	private  String cor;

	public Cachorro()
	{
		super("Pitbill");

	}
	
	@Override
	public void emitirSom(String som)
	{
	
		System.out.println("Latindo...");
	}
	
	@Override
	public void correr()
	{
		System.out.println("Estou correndo");
	}
}
