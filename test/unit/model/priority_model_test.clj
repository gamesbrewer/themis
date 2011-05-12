(ns unit.model.priority-model-test
  (:use clojure.contrib.test-is
        models.priority
        fixture.priority))

(def model "priority")

(use-fixtures :once fixture)

(deftest test-first-record
  (is (get-record 1)))