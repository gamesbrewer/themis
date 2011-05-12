(ns unit.model.faculty-model-test
  (:use clojure.contrib.test-is
        models.faculty
        fixture.faculty))

(def model "faculty")

(use-fixtures :once fixture)

(deftest test-first-record
  (is (get-record 1)))