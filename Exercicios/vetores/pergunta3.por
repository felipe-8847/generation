programa
{
	
	funcao inicio()
	{
		real n1 [4][6],n2 [4][6],m1 [4][6],m2 [4][6]
		
		inteiro linha,coluna

		para (linha = 0; linha < 4; linha++){
			para(coluna = 0; coluna < 6; coluna++){

				escreva("\nDigite o numero da N1: ")
				leia(n1 [linha][coluna])
			}
			
		}
			para (linha = 0; linha < 4; linha++){
			  para(coluna = 0; coluna < 6; coluna++){

				escreva("\nDigite o numero da N2: ")
				leia(n2 [linha][coluna])
			}
		}

			para (linha = 0; linha < 4; linha++){
			  para(coluna = 0; coluna < 6; coluna++){

 				m1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna]
				
			}
			
		}

			para (linha = 0; linha < 4; linha++){
			     para(coluna = 0; coluna < 6; coluna++){

 				m2[linha][coluna] = n1[linha][coluna] - n2[linha][coluna]
				
			}
			
		}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 749; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 6, 7, 2}-{n2, 6, 17, 2}-{m1, 6, 27, 2}-{m2, 6, 37, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */