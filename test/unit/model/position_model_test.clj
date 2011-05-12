(ns unit.model.position-model-test
  (:use clojure.contrib.test-is
        models.position
        fixture.position))

(def model "position")

(use-fixtures :once fixture)

(deftest test-first-record
  (is (get-record 1)))