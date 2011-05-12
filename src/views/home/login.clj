(ns views.home.login
  (:use conjure.core.view.base)
)

(def-view [password]
  [:div { :class "article" }
    [:h1 "Please Login" password]
	
	(form-for
      [:p "User Name" (text-field { :text "" } :user :username)
	   "Password" (password-field { :text "" } :user :password)
	   (form-button "Submit")
	  ]
	)
  ]
)