(ns db.migrate.008-create-positions
  (:use conjure.core.model.database))

(defn
#^{:doc "Migrates the database up to version 8."}
  up []
  (create-table "positions" 
    (id)
    (string "position_name")))
  
(defn
#^{:doc "Migrates the database down from version 8."}
  down []
  (drop-table "positions"))