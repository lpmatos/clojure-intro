(comment "

Simple hello world in Clojure with try catch.

Annotations:

  - Try catch in Clojure

  - print/println: produce output destined for human consumption.
  - pr/prn: produce output that may be read by the reader - strings will be quoted, and special characters escaped.

")

(print "\nSimple hello world in Clojure with try catch.")

(try
  (println "\nHello World!\n")
  (pr "This is your first Clojure script :)\n")
  (catch clojure.lang.ExceptionInfo error
    (prn "Error -" error)))
