# spec-from-the-ground-up

An intro to using the clojure spec API

Getting started
A repl with the base dependencies should be runnable via:

`lein run`
OR
`clj`

# run the spec

(ns section-one)
(require '[section-one] :reload)

clj -C:test
(ns section-one-test)
(require '[section-one-test :reload)
(run tests)
