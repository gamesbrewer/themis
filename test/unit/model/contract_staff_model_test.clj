(ns unit.model.contract-staff-model-test
  (:use clojure.contrib.test-is
        models.contract_staff
        fixture.contract-staff))

(def model "contract_staff")

(use-fixtures :once fixture)

(deftest test-first-record
  (is (get-record 1)))