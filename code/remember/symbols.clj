(comment "
    Just define symbols.
")

(def personal-name
  "Simple personal name symbol."
  "Lucca"    
)

(def personal-age
  "Simple personal age symbol."
  21
)

(def personal-salary
  "Simple personal salary symbol."
  3000.00
)

(defn show
  "Simple function to show the message."
  [name, age, salary]
  (println "Your name is:" name)
  (println "Your age is:" age)
  (println "Your salary is:" salary)
)

(show (if (= personal-name "Lucca") "Lucca" "Carol") personal-age personal-salary)
