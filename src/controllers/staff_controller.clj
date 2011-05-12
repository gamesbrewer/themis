(ns controllers.staff-controller
  (:use [conjure.core.controller.base])
  (:use conjure.core.model.session-store)
  (:require [controllers.template-controller :as template-controller])
)

(copy-actions :template)

(def-action list-records
  (bind)
  (if (not (retrieve-value :user-id)) (redirect-to { :controller "home", :action "index" }))
)