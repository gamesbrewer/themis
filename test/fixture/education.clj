(ns fixture.education
  (:use conjure.core.model.database)
  (:require [conjure.core.test.init :as test-init]))

(test-init/init-tests)

(def records [
  ; Add your test data here.
  { :id 1 }])

(defn fixture [function]
  (apply insert-into :educations records)
  (function)
  (delete :educations [ "true" ]))