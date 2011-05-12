(ns functional.task-controller-test
  (:use clojure.contrib.test-is
        controllers.task-controller)
  (:require [conjure.core.controller.util :as controller-util]))

(def controller-name "task")

