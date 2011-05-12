(ns unit.model.education-model-test
  (:use clojure.contrib.test-is
        models.education
        fixture.education))

(def model "education")

(use-fixtures :once fixture)

(deftest test-first-record
  (is (get-record 1)))