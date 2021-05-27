programa // para 2
{
	
	funcao inicio()
	{
		inteiro somarI = 0,i

		para (i = 1;i <= 500; i++){
			se(i%2 != 0){
				somarI = somarI + i
				escreva("\nProxima soma: ",somarI)
			}senao {
				escreva("\n")
			}

		}
		escreva("\nSoma dos numeros inpares e multiplos de 3 é: ",somarI)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 111; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {somarI, 6, 10, 6}-{i, 6, 21, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */