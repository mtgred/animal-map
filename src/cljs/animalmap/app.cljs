(ns animalmap.app 
  (:require [reagent.core :as r :refer [create-compiler]]
            [reagent.dom :refer [render]]))

(defonce functional-compiler (create-compiler {:function-components true}))

(defn app []
  [:div "Hello World !"])

(defn mount! []
  (render [app] (.getElementById js/document "root") functional-compiler))
