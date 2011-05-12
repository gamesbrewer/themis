(ns db.migrate.011-create-position-statuses
  (:use conjure.core.model.database))

(defn
#^{:doc "Migrates the database up to version 11."}
  up []
  (create-table "position_statuses" 
    (id)
    (string "status_name")))
  
(defn
#^{:doc "Migrates the database down from version 11."}
  down []
  (drop-table "position_statuses"))