# run the spec

$ clj
(ns section-one)
(require '[section-one] :reload)

$ clj
clj -C:test
(ns section-one-test)
(require '[section-one-test :reload)
(run tests)
