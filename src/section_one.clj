(ns section-one
  (:require [clojure.spec.alpha :as s]))

(defn at-most-six? [x]
  (>= 6 x))

(println (s/valid? at-most-six? 6))
