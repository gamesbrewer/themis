(ns db.migrate.015-create-users
  (:use conjure.core.model.database))

(defn
#^{:doc "Migrates the database up to version 15."}
  up []
  (create-table "users" 
    (id)
    (string "user_name")
    (string "password")
    (integer "staff_no")
    (string "email")))
  
(defn
#^{:doc "Migrates the database down from version 15."}
  down []
  (drop-table "users"))