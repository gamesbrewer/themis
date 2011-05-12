(ns functional.contract-status-controller-test
  (:use clojure.contrib.test-is
        controllers.contract-status-controller)
  (:require [conjure.core.controller.util :as controller-util]))

(def controller-name "contract_status")

