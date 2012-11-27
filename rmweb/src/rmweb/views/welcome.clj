(ns rmweb.views.welcome
  (:require [rmweb.views.common :as common])
    (:use [hiccup.page :only [include-css html5]])
    (:use [hiccup.core])
    (:use [hiccup.form]) )

(defpage "/" []
        (common/layout
            [:p "Welcome!"] 
            (form-to [:get "/"]
                (label "comment" "Comment: ")
                (hidden-field "action" "add" )
                (text-field "comment" )
                (submit-button "Post"))))

(defpage "/login" {:keys [username password]}
  (str "You tried to login as " username " with the password " password))

(defpage "/error" []
  {:status 500
   :body "Oh no! An error has occurred"})