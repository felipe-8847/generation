programa // pergunta 1
{
	
	funcao inicio()
	{
		real peso = 0.0,multa,excesso = 0.0

		escreva("\nDigite valor do peso do tomate: ")
		leia(peso)

		se (peso > 50){
			excesso = peso - 50
		}senao {
			escreva("\nPeso do tomate: ", peso)
		}
		multa = excesso * 4.0

		escreva("\nValor da multa por excesso: R$:",multa)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 317; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */