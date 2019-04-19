(ns english)

(def data
  (clojure.string/split
    (slurp "resources/words") #"\s+"))
