(ns db.migrate.001-create-staffs
  (:use conjure.core.model.database))

(defn
#^{:doc "Migrates the database up to version 1."}
  up []
  (create-table "staffs" 
    (id)
    (integer "staff_no")
    (string "ic_no")
    (string "name")
    (integer "birth_date")
    (integer "race")
    (integer "bumiputera")
    (integer "gender")
    (integer "religion")
    (integer "marital_satus")
    (integer "resident_state")
    (string "birth_state")
    (integer "citizenship")
    (integer "phone")
    (string "email")
    (string "website")
    (integer "highest_education")
    (integer "real_position")
    (integer "real_faculty")
    (integer "current_position")
    (integer "current_faculty")
    (integer "position_status")
    (integer "staff_status")
    (integer "position_grade")
    (date "date_joined_service")
    (date "date_position_start")
    (date "date_position_end")
    (text "disability")))
  
(defn
#^{:doc "Migrates the database down from version 1."}
  down []
  (drop-table "staffs"))