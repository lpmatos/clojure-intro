;; Escalares. 

;; Esses literais são chamados de escalares para distingui-los de coleções.

(println "Clojure" "is a" java.lang.String)

(println 0, 23, -42, 3.14159, 6e23, 22/7, 1/137)  ; are all numbers

(println 22/7 "and" 1/137 "are" clojure.lang.Ratio "values")

(println 314159265358.14159265358M "is a" java.math.BigDecimal)

(println 12345678901234567890N "is a" clojure.lang.BigInt)

(println nil "is just" nil "In Clojure, it represents 'nothing'.")

;; Nos contextos booleanos, o valor de NIL e FALSE são ambos falsos.
;; Em contextos booleanos, tudo que não seja NIL e FALSE é verdadeiro.

(println true)
(println :nil)
(println "false")
(println :false)
