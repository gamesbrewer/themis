(ns unit.model.task-model-test
  (:use clojure.contrib.test-is
        models.task
        fixture.task))

(def model "task")

(use-fixtures :once fixture)

(deftest test-first-record
  (is (get-record 1)))