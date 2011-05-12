(ns db.migrate.007-create-educations
  (:use conjure.core.model.database))

(defn
#^{:doc "Migrates the database up to version 7."}
  up []
  (create-table "educations" 
    (id)
    (string "education_name")))
  
(defn
#^{:doc "Migrates the database down from version 7."}
  down []
  (drop-table "educations"))