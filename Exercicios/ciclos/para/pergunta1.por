programa // para 1
{

		inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real sp,ms = 0.0,totalS = 0.0,mediaS = 0.0
		inteiro i,totalF = 0,nf,mediaF,pps = 0,p,percentoP = 0
		cadeia nome = ""

		escreva("\nDigite o numero de pessoas: ")
		leia(p)

		para(i = 1; i <= p; i++){
			//escreva("\nDigite o  seu nome: ")
			//4455leia(nome)
			escreva("\nDigite o  seu salario: ")
			leia(sp)
			totalS = totalS + sp
			escreva("\nDigite o  numero de filhos: ")
			leia(nf)
			totalF = totalF + nf 

			se (ms <= sp){
				ms = sp
			}senao{
				escreva("\n")
			}

			se (sp <= 100){
				pps = pps + 1
			}senao {
				escreva("\n")
			}
			
		}
		percentoP = (100 / p) * pps 
		mediaS = totalS / p
		mediaF = totalF / p

		escreva("\nMédia do salário da população: ",mediaS)
		escreva("\nMédia do número de filhos: ",mediaF)
		escreva("\nMaior salario: ",ms)
		escreva("\nPercentual de pessoas com salário até R$100,00: ",percentoP,"%")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 80; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {ms, 8, 10, 2}-{mediaS, 8, 32, 6}-{pps, 9, 33, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */