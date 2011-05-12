(ns db.migrate.013-create-task-statuses
  (:use conjure.core.model.database))

(defn
#^{:doc "Migrates the database up to version 13."}
  up []
  (create-table "task_statuses" 
    (id)
    (string "status_name")))
  
(defn
#^{:doc "Migrates the database down from version 13."}
  down []
  (drop-table "task_statuses"))