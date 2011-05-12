(ns db.migrate.004-create-races
  (:use conjure.core.model.database))

(defn
#^{:doc "Migrates the database up to version 4."}
  up []
  (create-table "races" 
    (id)
    (string "race_name")))
  
(defn
#^{:doc "Migrates the database down from version 4."}
  down []
  (drop-table "races"))