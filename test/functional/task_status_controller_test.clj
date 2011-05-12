(ns functional.task-status-controller-test
  (:use clojure.contrib.test-is
        controllers.task-status-controller)
  (:require [conjure.core.controller.util :as controller-util]))

(def controller-name "task-status")

