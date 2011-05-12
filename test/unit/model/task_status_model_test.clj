(ns unit.model.task-status-model-test
  (:use clojure.contrib.test-is
        models.task-status
        fixture.task-status))

(def model "task-status")

(use-fixtures :once fixture)

(deftest test-first-record
  (is (get-record 1)))