programa // pergunta 5
{
	
	funcao inicio()
	{
		real indice
		escreva("\nDigite o indice atual de poluição de ambiente: ")
		leia(indice)

		se (indice == 0.3){
			escreva("\nAs indústrias do 1º grupo estãosendo intimadas a suspenderem suas atividades, Valor: ",indice)
		}senao se (indice == 0.4){
			escreva("\nAs indústrias do 1º e 2º grupo estãosendo intimadas a suspenderem suas atividades, Valor: ",indice)
		}senao se (indice >= 0.5){
			escreva("\nAs indústrias do 1º, 2º e 3º estãosendo intimadas a suspenderem suas atividades, Valor: ",indice)
		}senao se (indice >= 0.05 e indice <= 0.25){
			escreva("\nValor aceitável, Valor: ",indice)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 665; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */