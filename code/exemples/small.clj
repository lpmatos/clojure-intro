(comment "
    Just define a function to valida if a value is small then 100.
")

(defn is-small?
  "Simples is-small function..."
  [value]
  (if (<= (+ value 10) 100) "Yes" "No"))

(def value
  "Simple symbol value."
  91
)

(println "\nThe value" value "plus 10 is small or equal to 100?" (is-small? value) "\n")
