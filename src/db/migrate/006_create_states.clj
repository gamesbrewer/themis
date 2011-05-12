(ns db.migrate.006-create-states
  (:use conjure.core.model.database))

(defn
#^{:doc "Migrates the database up to version 6."}
  up []
  (create-table "states" 
    (id)
    (string "state_name")))
  
(defn
#^{:doc "Migrates the database down from version 6."}
  down []
  (drop-table "states"))