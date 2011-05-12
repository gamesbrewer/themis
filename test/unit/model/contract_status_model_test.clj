(ns unit.model.contract-status-model-test
  (:use clojure.contrib.test-is
        models.contract_status
        fixture.contract-status))

(def model "contract_status")

(use-fixtures :once fixture)

(deftest test-first-record
  (is (get-record 1)))