(ns db.migrate.002-create-contract-staffs
  (:use conjure.core.model.database))

(defn
#^{:doc "Migrates the database up to version 2."}
  up []
  (create-table "contract_staffs" 
    (id)
    (integer "staff_no")
    (integer "pre_contract_status")
    (integer "contract_status")
    (date "date_contract_start")
    (date "date_contract_end")))
  
(defn
#^{:doc "Migrates the database down from version 2."}
  down []
  (drop-table "contract_staffs"))