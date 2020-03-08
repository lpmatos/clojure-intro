;; Namespace estoque.core - É como se fosse o package/namespace de outras linguagens.
;; Local onde agrupamos certas coisas.
;; Tudo que escrevermos aqui estará dentro desse namespace.
(ns estoque.other)

(comment "
  Starting code in Clojure.
")

(defn show-message
  []
  (println "\n******************************")
  (println "*           WELCOME          *")
  (println "******************************\n")
  )

(show-message)

;; To use other namespace - (use 'namespace')
