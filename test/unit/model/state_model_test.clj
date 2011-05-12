(ns unit.model.state-model-test
  (:use clojure.contrib.test-is
        models.state
        fixture.state))

(def model "state")

(use-fixtures :once fixture)

(deftest test-first-record
  (is (get-record 1)))