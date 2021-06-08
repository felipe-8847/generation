package ClassesAula;

public class ProdutoEletronicoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProdutoEletronico som = new ProdutoEletronico("Power", "800-WM", 100, 2550.50);
	
		som.mostrarDados();
		
		ProdutoEletronico som1 = new ProdutoEletronico("Super", "1100-WM", 80, 50.50);
		
		som1.mostrarDados();
		
		ProdutoEletronico som2 = new ProdutoEletronico("Testa ia", "900-WM", 150, 950.50);
		
		som2.mostrarDados();
		
		ProdutoEletronico som3 = new ProdutoEletronico("Já testei", "70-WM", 200, 300.50);
		
		som3.mostrarDados();
		
		ProdutoEletronico som4 = new ProdutoEletronico("Nozes", "80-WM", 90, 458.88);
		
		som4.mostrarDados();
	}

}
