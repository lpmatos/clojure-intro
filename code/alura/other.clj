(comment "
    Symbols and Conditional.
")

;; Definindo um símbolo desconto. O def define algo como se fosse uma variável global, mas em Clojure seria um símbolo global em nosso namespace.
;; Isso é um erro. Definir um símbolo global dentro de uma função pode fazer com que um símbolo que já existe, se redefina e você nem saberá o porque.
;; Não é uma boa prática trabalharmos com símbolos globais em nosso namespace.
;; O que queremos é definir um símbolo/variável que seja local a um espaço e não a todo namespace.
;; Para isso podemos utilizar o let (cria). Em Clojure o let recebe um vetor.
;; O let define a variável somente dentro do próprio parênteses. Portanto, na verdade, o let tem um escopo bem local que abrenje ele mesmo.
;; Quando você define símbolos globais isso pode te atrapalhar, alterar algum símbolo que já existe e ainda deixa lixo na memória.
;; A função let executa o que está dentro dela e retorna o resultado da última expressão.
;; O Clojure já da suporte a BigInt(N) e BigDecimal(M).
;; BigInt e BigDecimal não vão apresentar os tradicionais erros silenciosos de estouro.
;; Para ser mais formal, o if é uma forma, não uma função, e é uma forma especial.
;; Na prática, formas especiais podem ser utilizadas em nosso código e se misturam com as funções que invocamos em diversos momentos.
;; Em geral, serão formas especiais aquelas que formam a base mínima da linguagem, uma maneira tradicional que as linguagens encontram para que a maior parte da mesma seja implementada na própria linguagem.
;; Por exemplo, a função count é escrita em Clojure utilizando condicionais.
;; Devemos usar símbolos globais somente quando locais não resolverem o seu problema, o que é raro.
;; Com a função class podemos descobrir o tipo de uma variável.
;; Criar variável em escopo local com o let.
;; Trabalhar com condicionais if.
;; Que o nil (Nulo) é considerado false dentro do if.

(defn valor-descontado
  "Function to return the discounted value"
  [valor-bruto]
  (if (> valor-bruto 100)
    (let [desconto 0.10]
      (print "\nCalculando desconto de" desconto "...\n\n")
      (* valor-bruto (- 1 desconto))
    ))
    "Não aplicado"
  )

(defn parse-int [string]
  (Integer/parseInt (re-find #"\A-?\d+" string)))

(println "Qual o seu valor?")

(def valor (parse-int (read-line)))

(println "Seu valor é" valor)

(println "Valor final:" (valor-descontado valor))
