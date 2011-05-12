(ns views.home.index
  (:use conjure.core.view.base)
)

(def-view []
  [:div { :class "article" }
    [:h1 "Welcome to Conjure!"]
    [:p "Hello World!"]])