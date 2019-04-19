(ns english)

(def data
  (clojure.string/split
    (slurp "resources/words") #"\s+"))

(defn rand-word []
  (nth data (rand-int (count data))))