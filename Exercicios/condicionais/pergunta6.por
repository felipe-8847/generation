programa // pergunta 6
{
	
	funcao inicio()
	{
		inteiro idade
		cadeia nome = ""
		
		escreva("\nDigite o nome do nadador: ")
		leia(nome)
		escreva("\nDigite a idade do nadador: ")
		leia(idade)

		se (idade >= 5 e idade <= 7){
			escreva("\nNome: ",nome)
			escreva("\nIdade: ",idade," ,Categoria infantil A")
		}senao se (idade >= 8 e idade <= 11){
			escreva("\nNome: ",nome)
			escreva("\nIdade: ",idade," ,Categoria infantil B")
		}senao se(idade == 12 ou idade == 13){
			escreva("\nNome: ",nome)
			escreva("\nIdade: ",idade," ,Categoria Juvenil A")
		}senao se(idade >= 14 e idade <= 17){
			escreva("\nNome: ",nome)
			escreva("\nIdade: ",idade," ,Categoria Juvenil B")
		}senao se(idade >= 18){
			escreva("\nNome: ",nome)
			escreva("\nIdade: ",idade," ,Categoria adulto")
		}senao{
			escreva("\nValor invalido")
		}
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 788; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */