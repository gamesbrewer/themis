(ns controllers.home-controller
  (:use conjure.core.controller.base
        helpers.home-helper)
  (:use conjure.core.model.session-store)
)

(def-action login
  (bind)
)

(def-action index
  (if (not (retrieve-value :user-id)) (redirect-to { :action "login" }) (bind)
  )
  
)

(def-action list-records
  (redirect-to { :action "index" })
)
  
(def-action add
  (redirect-to { :action "index" })
)
  
(def-action error-404
  (bind)
)