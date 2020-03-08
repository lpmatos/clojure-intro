(ns estoque.when)

;; Na prática é como fazermos um monte de coisa dentro de uma única função?
;; A respota é: depende. Em qualquer linguagem uma função que tem vários caminhos lógicos ela tem uma alta complexidade de compreensão.
;; Essas questões de complexidade ciclomática pode torna difícil entendermos o que está acontecendo dentro de uma função.

(defn show-message
  []
  (println "\n******************************")
  (println "*           WELCOME          *")
  (println "******************************")
  )

;; Funções que devolvem True/False e possuem ? costumamos chamar de predicates.
;; Funções passadas em outras funções são chamadas em tempo de execução e não em tempo de compilação.
(defn aplica-desconto?
  "Retorna verdadeiro se o valor for maior que 100"
  [valor]
  (if (> valor 100)
    (let []
      (println "\nAplicando desconto versão if")
      true)))

;; O when só tem a condição verdadeira. Não existe o caso falso no when.
(defn aplica-desconto-when?
  "Utilizando when em Clojure"
  [valor]
  (when (> valor 100)
    (let []
      (println "\nAplicando desconto versão when")
      true)))

(defn aplica-desconto-direto?
  "Utilizando versão direta para aplicar desconto"
  [valor]
  (println "\nAplicando desconto versão direta")
  (> valor 100))

(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for maior que 100"
  [valor-bruto]
  (if (aplica-desconto-direto? valor-bruto)
    (let [taxa (/ 10 100)
          desconto (* valor-bruto taxa)]
      (println "\nO desconto é de" desconto)
      (- valor-bruto desconto))
    (let []
      (println "\nNão vamos aplicar o desconto...")
      valor-bruto)))

(comment "
  Main. Call functions.
")

(show-message)

(def valor-bruto 1000)

(println "\nO valor bruto é" valor-bruto)

(def resultado (valor-descontado valor-bruto))

(println "\nO valor final é:" resultado)
