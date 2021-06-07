package Arrays;

public class Exemplo1 {

	import java.util.Scanner;

	public class ExemploArray1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			final int y=4;
			float [] notas = new float[y];
			float somanotas=0,media;
			
			Scanner leia = new Scanner(System.in);
			
			for(int x=0;x<notas.length;x++)
			{
				System.out.println("\nEntre com a sua nota: ");
				notas[x] = leia.nextFloat();
				
				somanotas += notas[x]; // somanotas = somanota + notas[x]
			}
			media = somanotas / notas.length;
			
			System.out.printf("\nMédia das notas: %2.2f",media);
		}
}



/*

	package Turma24;

	import java.util.Scanner;

	public class exemploArray2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			final int linha=3,coluna=3;
			int[][] numeros = new int[linha][coluna];
			int somapar=0,somaimpar = 0,somaqualquercoisa=0,l,c,valor;
			
			Scanner leia = new Scanner(System.in);
			for(l=0;l<linha;l++)
			{
				for(c=0;c<coluna;c++)
				{
					System.out.println("\nEntre com um número: ");
					numeros[l][c] = leia.nextInt();
					
					if(l%2==0 && c%2==0)
					{
						somapar = somapar + numeros[l][c];
					}
					else if(l%2==1 && c%2==1)
					{
						somaimpar = somaimpar + numeros[l][c];
					}
					else
					{
						somaqualquercoisa += numeros[l][c];		
					}
					
				}
			}
		
			System.out.println("\nentre com a linha que deseja colocar um valor: ");
			l = leia.nextInt();//1
			System.out.println("\nentre com a coluna que deseja colocar um valor: ");
			c = leia.nextInt();//0
			System.out.println("\nentre com a linha que deseja colocar um valor: ");
			valor = leia.nextInt();
			numeros[l][c]=valor;
		
			System.out.println("\nSomatório dos pares: "+somapar);
			System.out.println("\nSomatório dos ímpares: "+somaimpar);
			System.out.println("\nSomatório de qualquer coisa: "+somaqualquercoisa);
		}

	}

}
*/
