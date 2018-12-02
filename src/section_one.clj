(ns section-one
  (:require [clojure.spec.alpha :as s]))

(defn at-most-six? [x]
  (>= 6 x))

(println (s/valid? at-most-six? 6))

(defn at-least-one? [x]
  (>= x 1))

(println (s/valid? at-least-one? 1))

(defn numers-divisible-by-three [x]
  ())
