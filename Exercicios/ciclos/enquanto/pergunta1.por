programa // enquanto 1
{
	
	funcao inicio()
	{

		real num,soma = 0.0,media,totalV = 0.0
		
		escreva("\nDigite um valor: ")
		leia(num)

		enquanto(num > 0 ){
			totalV++
			soma = soma + num

			media = soma / totalV 
		escreva("\nValor total da soma: ",soma)
		escreva("\nValor da media: ",media)
		escreva("\nValor total de entradas: ",totalV)
		escreva("\n==================================")
		escreva("\nDegite um valor: ")
		leia(num)
		
		
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 395; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {num, 7, 7, 3}-{soma, 7, 11, 4}-{media, 7, 22, 5}-{totalV, 7, 28, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */