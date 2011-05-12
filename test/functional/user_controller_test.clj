(ns functional.user-controller-test
  (:use clojure.contrib.test-is
        controllers.user-controller)
  (:require [conjure.core.controller.util :as controller-util]))

(def controller-name "user")

