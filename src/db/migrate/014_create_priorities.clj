(ns db.migrate.014-create-priorities
  (:use conjure.core.model.database))

(defn
#^{:doc "Migrates the database up to version 14."}
  up []
  (create-table "priorities" 
    (id)
    (string "priority_name")))
  
(defn
#^{:doc "Migrates the database down from version 14."}
  down []
  (drop-table "priorities"))