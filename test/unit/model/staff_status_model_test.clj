(ns unit.model.staff-status-model-test
  (:use clojure.contrib.test-is
        models.staff-status
        fixture.staff-status))

(def model "staff-status")

(use-fixtures :once fixture)

(deftest test-first-record
  (is (get-record 1)))