programa // pergunta 2
{
	
	funcao inicio()
	{
		cadeia nome = ""
		real codigo,numero = 0.0,extra = 0.0

		escreva("\nDigite o nome do funcionario: ")
		leia(nome)
		escreva("\nDigite o as horas total de trabalho do funcionario: ")
		leia(numero)

		se (numero > 50){
			codigo = numero - 50
			extra = codigo * 20
			numero = 50.0 * 10

			escreva("\nSalario: R$: ",numero)
			escreva("\nSalario total: R$: ",extra + numero)
			
		}senao{
			escreva("\nSalario total: R$: ",numero * 10)	
		}		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 369; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */