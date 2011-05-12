(ns db.migrate.012-create-tasks
  (:use conjure.core.model.database))

(defn
#^{:doc "Migrates the database up to version 12."}
  up []
  (create-table "tasks" 
    (id)
    (string "title")
    (text "remarks")
    (integer "status")
    (integer "priority")
    (integer "assignee")
    (integer "assignor")
    (string "attachments")
    (date "due_date")))
  
(defn
#^{:doc "Migrates the database down from version 12."}
  down []
  (drop-table "tasks"))