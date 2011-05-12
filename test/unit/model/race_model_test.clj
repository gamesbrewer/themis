(ns unit.model.race-model-test
  (:use clojure.contrib.test-is
        models.race
        fixture.race))

(def model "race")

(use-fixtures :once fixture)

(deftest test-first-record
  (is (get-record 1)))