programa // pergunta 4
{
	
	funcao inicio()
	{
		inteiro numero = 0

		escreva("\nDigite um numero: ")
		leia(numero)

		se(numero% 2 == 0){
			escreva("\nEste numero: ",numero," é Par")
		}senao{
			escreva("\nEste numero: ",numero," é Impar")
	   }
	   	se(numero >= 0){
			escreva("\nEste numero: ",numero," é positivo")
		}senao{
			escreva("\nEste numero: ",numero," é negativo")
	   }
   }
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 123; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */