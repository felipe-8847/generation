	/*	Operador Lógico E
		Entrada1	Entrada2		Saída
		V			V				V
		V			F				F
		F			V				F
		F			F				F
		
		Operador Lógico OU
		Entrada1	Entrada2		Saída
		V			V				V
		V			F				V
		F			V				V
		F			F				F
		*/

programa // exemplo do luiz
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		inteiro nota1,nota2,nota3,media
		cadeia nome

		escreva("\nEntre com o seu nome: ")
		leia(nome)
		escreva("\nEntre com a primeira nota: ")
		leia(nota1)
		escreva("\nEntre com a segunda nota: ")
		leia(nota2)
		escreva("\nEntre com a terceira nota: ")
		leia(nota3)

		media = (nota1+nota2+nota3)/3
		
		escreva("\nA média foi de: ",media)//MEDIA = 4.5

		se(media>=7 e media<=10)//SE A SAÍDA FOR FALSA EU NÃO EXECUTO O LAÇO
		{
			se(media==10)
			{
				escreva("\nParabéns você alcançou a maior média!!!")
			}
			senao
			{
			escreva("\nParticipante: ",nome,", foi aprovado...")
			}
		}
		senao se(media>=5 e media<7)
		{
			escreva("\nParticipante: ",nome,", ficou de EXAME...")
		}
		senao se(media>=0 e media<5)
		{
			escreva("\nParticipante: ",nome,", foi reprovado...")
		}
		senao
		{
			escreva("\nMédia fora do intervalo...")
		}
		
	}
}

programa
{
	
	funcao inicio()
	{
		real num1,num2,res=0.0
		inteiro op
		//caracter opcao
		//cadeia op
		escreva("\nDigite o primeiro número: ")
		leia(num1)
		escreva("\n\t\tMenu de opções da calculadora")
		escreva("\n 1-Soma\n 2-Diferença\n 3-Multiplicação\n 4-Divisão")
		escreva("\nDigite sua opção: ")//1
		leia(op)
		/*
		se(op<1 ou op>4)
		{
			escreva("\nOpção inválida!!!")
		}
		senao
		{
		
		*/
		escreva("\nDigite o segundo número: ")
		leia(num2)
		

		

		escolha(op)
		{
			caso 1:
			res = num1 + num2
			pare
			caso 2:
			res = num1 - num2
			pare
			caso 3:
			res = num1 * num2
			pare
			caso 4:
			res = num1 / num2
			pare
			caso contrario:
			escreva("\nOpção inválida!!!")
		}
		escreva("\nResultado: ",res)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 208; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */