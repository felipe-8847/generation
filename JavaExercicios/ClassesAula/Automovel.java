package ClassesAula;

public class Automovel {
		
		//declaração dos atributos(variáveis de instância) da classe
		private String nomeProprietario;
		private String modelo;
		private String placa;
		private int ano;
		
		//método especial CONSTRUTOR
		public Automovel(String nomeProprietario,String modelo,String placa,int ano)
		{
			this.nomeProprietario = nomeProprietario;
			this.modelo = modelo;
			this.placa = placa;
			this.ano = ano;
			
		}
		public Automovel(String nomeProprietario,int ano)
		{
			this.nomeProprietario = nomeProprietario;
			this.ano = ano;
		}
		
		//declaração dos demais métodos da classe
		public void imprimirInfo()
		{
			System.out.println(nomeProprietario+"possui um(a)"+modelo
					+"com placa: "+placa+" e ano: "+ano);
		}

		public String getNomeProprietario() {
			return nomeProprietario;
		}

		public void setNomeProprietario(String nomeProprietario) {
			this.nomeProprietario = nomeProprietario;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getPlaca() {
			return placa;
		}

		public void setPlaca(String placa) {
			this.placa = placa;
		}

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}
		
		
	}




	/*
	public class TesteAutomovel {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//instanciando um objeto da classe Automovel
			Automovel auto1 = new Automovel("Mara Jozicleia","BMW","XL92",2022);
			
			//troca de mensagens(chamada ao método imprimirInfo())
			auto1.imprimirInfo();
			System.out.println("\n*****Transferência de Proprietaria(o)*****");
			auto1.setNomeProprietario("Bruno Constantino");
			auto1.imprimirInfo();
			
			Automovel auto2 = new Automovel("Denise Mignoli","Toyota","KY85",2021);
			auto2.imprimirInfo();
			System.out.println("\n*****Mudança de Placa*****");
			auto2.setPlaca("AC27");
			auto2.imprimirInfo();
		}

	}

}*/
