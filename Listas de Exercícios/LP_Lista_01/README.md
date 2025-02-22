![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
   
    flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
    ```
   
2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
   ```mermaid
   flowchart TD
      start(( inico )) --> input1[\Digite sua nota\]
      input1 --> input2[\Digite sua frequencia\]
      input2 --> test{Nota >= 50 \n AND \nfrequencia >= 75%?}
      test --> |Não| answer1[/Reprovado/]
      test --> |Sim| answer2[/Aprovado/]
      answer1 -->  fim([fim])
      answer2 -->  fim([fim])
   ```
   
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD
     inicio((incio)) --> input1[\Digite o n1\]
     input1 --> input2[\Digite o n2\]
     input2 --> soma[n1 + n2 = resultado]
     soma --> saida[/resultado/]
     saida --> fim([fim])
      
   ```
   
4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
   ```mermaid
   flowchart TD
      inicio((inicio)) --> numero[\Digite um numero\]
      numero --> teste{numero > 0}
      teste --> |sim| saida[/numero positivo/]
      teste --> |nao| saida1[/numero negativo/]
      saida --> fim([fim])
      saida1 --> fim
   ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
      inicio((inicio)) --> idade[\Digite a sua idade\]
      idade --> teste0{idade < 16}
      teste0 --> |sim| resptest0[/Nao pode votar/]
      teste0 --> |nao| teste1{idade >= 16 \nAND \nidade < 18}
      teste1 --> |sim| resptest1[/Pode votar --Facultativo--/]
      teste1 --> |nao| teste2{idade >= 18 \nAND\nidade < 70}
      teste2 --> |sim| resptest2[/Pode votar/]
      teste2 --> |nao| resp2test2[/Pode votar --Facultativo--/]
      resptest0 --> fim([fim])
      resptest1 --> fim
      resptest2 --> fim
      resp2test2 --> fim
   ```
   
6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
     inicio((incio)) --> input1[\Digite o n1\]
     input1 --> input2[\Digite o n2\]
     input2 --> teste{n1 < n2}
     teste --> |sim| resp0[/O n2 e maior/]
     teste --> |nao| resp1[/O n1 e maior/]
     resp0 --> fim([fim])
     resp1 --> fim
   ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
     inicio((incio)) --> input1[\Digite o n1\]
     input1 --> input2[\Digite o n2\]
     input2 --> input3[\Digite o n3\]
     input3 --> teste0{n1 == n2 == n3}
     teste0 --> |sim| respteste0[/Os numeros sao iguais/]
     teste0 --> |nao| teste1{n1 == n2 \nAND \nn1 > n3}
     teste1 --> |sim| respteste1[/n1 e n2 sao iguas \ne maiores que o n3/]
     teste1 --> |nao| teste2{n1 == n2 \nAND\n n1 < n3}
     teste2 --> |sim| respteste2[/O n3 e maior/]
     teste2 --> |nao| teste3{n1 == n3 \nAND\n n1 > n2}
     teste3 --> |sim| respteste3[/n1 e n3 sao iguais \ne maiores que o n2/]
     teste3 --> |nao| teste4{n1 == n3 \nAND\n n1 < n2}
     teste4 --> |sim| respteste4[/O n2 e maior/]
     teste4 --> |nao| teste5{n2 == n3 \nAND\ n2 > n1}
     teste5 --> |sim| respteste5[/n2 e n3 sao iguais \ne maiores que o n1/]
     teste5 --> |nao| teste6{n2 == n3 \nAND\ n2 < n1}
     teste6 --> |sim| respteste6[/O n1 e maior/]
     teste6 --> |nao| teste7{n1 > n2 \nAND\nn1 > n3}
     teste7 --> |sim| respteste7[/n1 e maior/]
     teste7 --> |nao| teste8{n2 > n1 \nAND\nn2 > n3}
     teste8 --> |sim| respteste8[/n2 e maior/]
     teste8 --> |nao| resp2teste8[/n3 e maior/]
     respteste0 --> fim([fim])
     respteste1 --> fim
     respteste2 --> fim
     respteste3 --> fim
     respteste4 --> fim
     respteste5 --> fim
     respteste6 --> fim
     respteste7 --> fim
     respteste8 --> fim
     resp2teste8 --> fim     
   ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
      inicio((inico)) --> numero[\Digite um numero\]
      numero --> teste{numero == 0 \nOU\n numero == 1}
      teste --> |sim| respteste[/fatorial = 1/]
      teste --> |nao| variaveis[fat = x\nx = x - 1]
      variaveis --> processo[fat = fat * x\nx = x - 1]
      processo --> repeticao{x > 1}
      repeticao --> |sim| processo
      processo --> |nao| fatorial[/fatorial/]
      fatorial --> fim([fim])
      respteste --> fim
   ```
   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.
   
   > Em várias linguagens de programação, o operador % retorna o resto da divisão entre dois números.    

   
   ```mermaid
   flowchart TD
      inicio((inicio)) --> input1[\digite um numero\]
      input1 --> teste{numero % 2 == 0}
      teste --> |sim| respteste[/numero par/]
      teste --> |nao| respteste2[/numero impar/]
      respteste --> fim([fim])
      respteste2 --> fim
   ```
   
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   
   ```mermaid
   flowchart TD
      inicio((inicio)) --> numero[\Digite um numero\]
      numero --> teste{n < 2}
      teste --> |sim| respteste[/Nao e primo/]
      teste --> |nao| variaveli[i = n / 2]
      variaveli --> teste2{i > 1?}
      teste2 --> |sim| teste3{n % i == 0?}
      teste3 --> |sim| respteste
      teste3 --> |nao| variaveli2[i = i - 1]
      variaveli2 --> teste2
      teste2 --> |nao| respteste2[/Primo/]
      respteste --> fim([fim])
      respteste2 --> fim
   ```