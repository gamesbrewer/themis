(ns db.migrate.010-create-staff-statuses
  (:use conjure.core.model.database))

(defn
#^{:doc "Migrates the database up to version 10."}
  up []
  (create-table "staff_statuses" 
    (id)
    (string "status_name")))
  
(defn
#^{:doc "Migrates the database down from version 10."}
  down []
  (drop-table "staff_statuses"))