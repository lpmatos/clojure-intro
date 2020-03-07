(comment "

Multiple comment syntax clojure...

Em clojure para exibirmos uma mensagem podemos utilizar a function println que recebe alguns params, como por exemplo uma string.

Quando vamos invocar uma function, precisamos passar o nome dessa functions e todos os seus params.

Toda function invocation vamos colocar entre (...).

O que aparece depois dos (...) sempre é uma function e o resto são os params para essa function.

A operação que queremos executar semrpe vai ser o primeiro comando da sequência que está dentro do (...).

O println sempre retorna nulo após sua execução.

")

(println "Bem vindo ao sistema de estoque")

(comment "

Sintaxe Clojure:

  - (<O que você quer fazer> <definição do que você vai fazer> <params>)


Exemplo: Define variable.

(def total 15)

Na verdade, quando falamos variável, em clojure estamos falando de símbolos.

Quando criamos um símbolo, o clojure cria ele na nossa namespace padrão. Mais tarde vamos falar de namespace...

")

(def total 15)

(println total)

(comment "

A função println recebe mais de um param. O próprip println adiciona um espaço entre cada param passado para a função.

Exemplo: Imprimindo símbolo criado com uma string de mensagem.

")

(println "Total:" total)

(comment "

Podemos redefinir nossos símbolos e isso nos da uma sensação de variável... Inicialmente, podemos dizer que esses símbolos são como variáveis globais, porém, variáveis globais não são uma boa prática. Com o passar do tempo iremos melhorando essas nossas definições e evoluindo esse aspecto em Clojure.

")

(def total "Lucca")

(println "Nome:" total)

(comment "

Definindo operações matemáticas. Esses operadores costumam ser funções também, que pode receber vários params...

Podemos utilizar o resultado da invocação de uma função como parâmetro para outra função/definição...

")

(def soma (+ 3 3))
(def sub (- 4 3))
(def mult (* 3 3))
(def div (/ 9 3))

(println "Soma:" soma)
(println "Sub:" sub)
(println "Mult:" mult)
(println "Div:" div)

(comment "

Em Clojure as coisas são mais imutáveis, ou seja, mais difíceis de mudar. Para validarmos esse rigidez/imutabilidade, vamos analizar um vetor.

Observação: Em Clojure uma virgula é considerada um espaço em branco.

")

(def estoque ["Lucca", "Pessoa"])

(println "Vetor:" estoque)

(comment "

Quando colocamos um parênteses queremos dizer que queremos invocar algo, portanto, temos que ter cuidado com o primeiro elemento contido nesse parênteses. Por exemplo: se você declarar o nome de um array como o primeiro elemento desse parênteses, teremos erro, porém, dependendo da forma como você utilizar, o resultado não será o erro, mas sim algo concreto.

Exemplo: Um array até pode ser chamado como uma função.

")

(println (estoque 0))

(println (estoque 1))

(comment "

IFn -> Interface de função do Clojure.

O array implementa uma IFn, portanto ele pode ser chamado como função.

Exemplo: Contando elemento do array.

")

(println "Quantidade de elementos em estoque:" (count estoque) "elementos")

(comment "

Exemplo: Adicionando novo elemento ao array com a function conj

A conj espera um array e os elementos a serem adicionados. Como resultado temos um novo array com os itens adicionados.

O conj não altera o conteúdo do vetor passado como param. Ai entre o ponto da imutabilidade. O Clojure muito com esse conceito. A partir do momento que você tem um número, um vetor, uma string... isso não muda de valor, o que pode acontecer é a redefinição de um símbolo para receber um resultado.

Em outras linguagens, quando adicionamos elemento a um vetor o vetor é mudado, mas em Clojure isso não acontece.

")

(def estoque (conj estoque "Matos"))

(println "Quantidade de elementos em estoque:" (count estoque) "elementos")

(println estoque)

(def valida (conj estoque "Silva", 20))

(println (count valida))

(println valida)

(comment "

Qual a vantagem da imutabilidade do Clojure?? A partir do momento em que os valores com que você trabalha são imutáveis, você pode passar esse valor como parâmetro para qualquer coisa que esse valor não vai ser mudado mesmo após você invocar uma função em cima desse valor.

Imutabilidade - Intacabilidade - Controle.

Se tu quer redefinir o valor de algo essa decisão será sua, mas o Clojure não faz isso naturalmente.

Com isso tudo fica mais controlado no sentido de você saber o que está sendo alterado ou não. 

O que é manipulado fica mais visível.

Já que Clojure sabe que tudo vai ser trabalhado com imutabilidade, as coloções (como um vetor) vão ser implementadas de uma maneira melhorada/otimizada.

")