(ns bindings.home.login
  (:use conjure.core.binding.base
        helpers.home-helper)
  (:use conjure.core.model.session-store)
)

(def-binding []
  (let [username (:username (conjure.core.server.request/user)) password (:password (conjure.core.server.request/user))]
    (if (not (nil? username))
	  (save :user-name username)
	)
	
	(with-home-request-map
      (render-view(:text username))
	)
  )
)