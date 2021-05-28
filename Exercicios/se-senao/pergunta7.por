programa // pergunta 7
{
	
	funcao inicio()
	{
		real base,altura,area
		
		escreva("\nDigite a altura do triangulo: ")
		leia(altura)
		escreva("\nDigite a base do triangulo: ")
		leia(base)

		se (altura > 0 e base > 0){
			area = (base * altura) / 2
			escreva("\nValor da area é: ", area)
		}senao {
			escreva("\nValores invalidos")
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 297; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */