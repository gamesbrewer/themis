(ns controllers.faculty-controller
  (:use [conjure.core.controller.base])
  (:require [controllers.template-controller :as template-controller]))

(copy-actions :template)