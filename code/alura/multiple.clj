;; Só tem desconto se for acima de 100 reais
(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100."
  [valor-bruto]
  (if (> valor-bruto 100)
    (let [taxa (/ 10 100)
          desconto (* valor-bruto taxa)]
      (print "\nCalculando desconto de" desconto "...\n\n")
      (- valor-bruto desconto)) "Não se aplica"))

(println "Valor final:" (valor-descontado 100))
