(comment "

Definindo a minha própria função.

")

; Definição da função - nome - params
(defn show []
  ; Corpo da função
  (println "Primeira função implementada."))

(show)

; --------------------------------------------

(defn show-name [nome]
  (println "Exibindo nome...")
  (println "Seu nome:" nome))

(show-name "Lucca")

; --------------------------------------------

(defn aplica-desconto [valor-bruto]
  (* valor-bruto 0.9))

(println (aplica-desconto 100))

; --------------------------------------------

(comment "

Quando vamos nomear nossas funções é bom evitarmos utilizar nomenclaturas que apliquem um sentido de pedido/requisição. Utilize uma nomenclatura direta e substantiva e não uma declaração imperativa. 

O imperativo está ligado com ações que executamos e que fazem algo que tem um efeito colateral.

Um função em Clojure é pura quando invocada diversas vezes e mesmo assim tem o mesmo resultado. O resultado dela é só o retorno dela. 

O pura é no sentido matemático de que não causa efeito colateria e se mantém imutável.

Ao trabalharmos com funções puras temos várias vantagens em concorrência/paralelismo.

")

(defn valor-descontado
  "Retorna o valor descontado que é 90 % do valor bruto"
  [valor-bruto]
  (* valor-bruto 0.9))

(println (valor-descontado 100))

(defn valor-descontado
  "Retorna o valor com desconto de 10%"
  [valor-bruto]
  (* valor-bruto (- 1 0.10)))

(println (valor-descontado 100))
