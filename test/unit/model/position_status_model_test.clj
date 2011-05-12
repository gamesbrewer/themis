(ns unit.model.position-status-model-test
  (:use clojure.contrib.test-is
        models.position-status
        fixture.position-status))

(def model "position-status")

(use-fixtures :once fixture)

(deftest test-first-record
  (is (get-record 1)))