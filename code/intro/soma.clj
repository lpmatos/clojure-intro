(comment "

Simples function to sum two values.

Annotations:

  - Clojure function.
  - Clojure definition of symbols.
  - Clojure Math operations.
  - Clojure try catch.

")

(defn sum
  "Sum two values."
  [a b]
  (try
    (def result (+ a b))
    (println "\nThe sum of" a "with" b "give" result "\n")
    (catch Exception error
      (pr "Error when we sum the values" a "and" b "-" error)))
)

(sum 5, 6)
