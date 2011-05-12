(ns unit.model.staff-model-test
  (:use clojure.contrib.test-is
        models.staff
        fixture.staff))

(def model "staff")

(use-fixtures :once fixture)

(deftest test-first-record
  (is (get-record 1)))