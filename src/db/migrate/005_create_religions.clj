(ns db.migrate.005-create-religions
  (:use conjure.core.model.database))

(defn
#^{:doc "Migrates the database up to version 5."}
  up []
  (create-table "religions" 
    (id)
    (string "religion_name")))
  
(defn
#^{:doc "Migrates the database down from version 5."}
  down []
  (drop-table "religions"))