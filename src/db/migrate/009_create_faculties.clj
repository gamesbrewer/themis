(ns db.migrate.009-create-faculties
  (:use conjure.core.model.database))

(defn
#^{:doc "Migrates the database up to version 9."}
  up []
  (create-table "faculties" 
    (id)
    (string "faculty_name")))
  
(defn
#^{:doc "Migrates the database down from version 9."}
  down []
  (drop-table "faculties"))