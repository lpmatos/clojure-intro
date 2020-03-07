(comment "
    Just define a function to show a message.    
")

(defn show
  "Show a message give a personal name."
  [personal-name]
  (println "\nYour name is:" personal-name "\n")
)

(def personal-name "Lucca")

(show personal-name)
