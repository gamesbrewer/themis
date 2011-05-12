(ns functional.race-controller-test
  (:use clojure.contrib.test-is
        controllers.race-controller)
  (:require [conjure.core.controller.util :as controller-util]))

(def controller-name "race")

