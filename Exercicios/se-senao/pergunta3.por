programa // pergunta 3
{

	inclua biblioteca Matematica-->Mat
	
	funcao inicio()
	{
		real num1,num2,num3,num4

		escreva("\nDigite o primeiro numero: ")
		leia(num1)
		escreva("\nDigite o segundo numero: ")
		leia(num2)
		escreva("\nDigite o terceiro numero: ")
		leia(num3)
		escreva("\nDigite o quarto numero: ")
		leia(num4)

		num1 = Mat.potencia(num1, 2.0)
		num2 = Mat.potencia(num2, 2.0)
		num3 = Mat.potencia(num3, 2.0)
		num4 = Mat.potencia(num4, 2.0)

		se (num3 >= 1000){
			escreva("\nTeceiro numero ao quadrado é: ",num3)
		}senao{
			escreva("\nAbaixo temos numeros ao quadrado")
			escreva("\nPrimeiro: ",num1)
			escreva("\nSegundo: ",num2)
			escreva("\nTerceiro: ",num3)
			escreva("\nQuarto: ",num4)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 573; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */