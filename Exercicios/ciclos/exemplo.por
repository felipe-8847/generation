programa
{
	
	funcao inicio()
	{
		inteiro tab,res,x=1

		escreva("\nQual a tabuada que deseja visualizar?")
		leia(tab)

		faca
		{
			res = tab * x
			escreva("\n",tab," X ",x," = ",res)
			x++
			enquanto(x==10)
			{
				se(x==10)
				{
				escreva("\nQual a tabuada que deseja visualizar?")
				leia(tab)	
				x=1
				}
			}
		}
		enquanto(x<=10)
	}
}

programa
{
	
	funcao inicio()
	{
		inteiro num,somapar=0,contimpar=0,y=1

		escreva("\nEntre com um número: ")
		leia(num) // 8
		//num=1
		enquanto(num!=0)// enquanto(palavra == "S"
		{
			se(num%2==0)
			{
				somapar = somapar + num
			}
			senao
			{
				contimpar++ // contimpar = contimpar + 1
			}
			escreva("\nEntre com um número: ")
			leia(num)
			//num = num + 3
			se( y==5)
			{
				num=0
			}
			y++
		}

		escreva("\nSomatório dos números pares: ",somapar)
		escreva("\nQuantidade de números ímpares: ",contimpar)
	}
}

programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real n1,n2,n3,media,somamedia=0.0,mediageral,maiormedia=0.0
		inteiro x,num
		cadeia nome
		escreva("\nEntre com o número total de alunes: ")
		leia(num)
		para(x=1;x<=num;x++) //x++ é exatamente igual a x = x + 1
		{
			escreva("\nEntre com o nome do alune: ")
			leia(nome)
			escreva("\nEntre com a primeira nota: ")
			leia(n1)
			escreva("\nEntre com a segunda nota: ")
			leia(n2)
			escreva("\nEntre com a terceira nota: ")
			leia(n3)

			media = (n1+n2+n3)/3 //7.5 8.5 5.5 4.5 8.2
			limpa()
			escreva("\nMédia do aluno(a) ",nome," foi de: ",mat.arredondar(media,2))
			
			se(maiormedia<media)
			{
				maiormedia = media
			}

			somamedia = somamedia + media
			
		}
		mediageral = somamedia / num
		limpa()
		escreva("\nMédia geral da turma: ",mat.arredondar(mediageral,2))
		escreva("\nMaior média da turma: ",maiormedia)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 332; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */