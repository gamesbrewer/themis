(ns fixture.user
  (:use conjure.core.model.database)
  (:require [conjure.core.test.init :as test-init]))

(test-init/init-tests)

(def records [
  ; Add your test data here.
  { :id 1 }])

(defn fixture [function]
  (apply insert-into :users records)
  (function)
  (delete :users [ "true" ]))