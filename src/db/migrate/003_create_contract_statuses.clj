(ns db.migrate.003-create-contract-statuses
  (:use conjure.core.model.database))

(defn
#^{:doc "Migrates the database up to version 3."}
  up []
  (create-table "contract_statuses" 
    (id)
    (string "status_name")))
  
(defn
#^{:doc "Migrates the database down from version 3."}
  down []
  (drop-table "contract_statuses"))