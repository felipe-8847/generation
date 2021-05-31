programa
{
	
	funcao inicio()
	{
		real notas[5],maior = 0.0
		inteiro i

		para (i = 0 ; i < 5 ; i++){
			escreva("\ndigite a nota: ")
			leia(notas[i])

			limpa()
			se (maior <= notas[i]){
				maior = notas[i]
			}
		}
		escreva("\nMaior pontuação: ",maior)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 169; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */