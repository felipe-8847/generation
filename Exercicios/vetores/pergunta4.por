programa
{
	
	funcao inicio()
	{
		real matriz [3][3],soma = 0.0,somaD = 0.0
		inteiro linha,coluna
		
		para (linha = 0; linha < 3; linha++){
			para (coluna = 0; coluna < 3; coluna++){

				escreva("\nDigite o numero: ")
	          	leia(matriz[linha] [coluna])

	          	soma = soma + matriz[linha] [coluna]

	          	se (linha == coluna){

	          		somaD = somaD + matriz[linha] [coluna]
	          	}

		}
		}
		    escreva("\nSoma dos valores: ",soma)
		    escreva("\nSoma da diagonal: ",somaD)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 525; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 6, 7, 6}-{soma, 6, 21, 4}-{somaD, 6, 32, 5}-{coluna, 7, 16, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */