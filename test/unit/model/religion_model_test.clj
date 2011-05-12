(ns unit.model.religion-model-test
  (:use clojure.contrib.test-is
        models.religion
        fixture.religion))

(def model "religion")

(use-fixtures :once fixture)

(deftest test-first-record
  (is (get-record 1)))