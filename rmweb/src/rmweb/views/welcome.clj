(ns rmweb.views.welcome
  (:require [rmweb.views.common :as common]
            [noir.content.getting-started])
 (:use [noir.core :only [defpage]]))

(defpage "/" []
         (common/layout
           [:p "Welcome to rmweb" :p "Welcome to rmweb2"]))

(defpage "/login" {:keys [username password]}
  (str "You tried to login as " username " with the password " password))

(defpage "/error" []
  {:status 500
   :body "Oh no! An error has occurred"})