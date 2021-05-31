programa
{
	
	funcao inicio()
	{
		inteiro numeros[10],quant = 0,i,soma = 0,result = 0

		para (i = 0; i < 10; i++){

		escreva("\nDigitre o valor do dado: ")
		leia(numeros[i])

		limpa()

		soma = soma + numeros[i]

		se(quant <= numeros[i]){
			quant = numeros[i]
		}senao {
			escreva("\n")
		}
		
	  }	
	  para(i = 0; i < 10; i++){
			se(quant == numeros[i]){
				result++
			}
		}
	  escreva("\nMedia dos lançamentos: ",soma / 10)

	  escreva("\nO maior numero lançado foi O: ", quant," e foi lançado: ",result," vezes")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 355; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numeros, 6, 10, 7}-{quant, 6, 22, 5}-{result, 6, 43, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */