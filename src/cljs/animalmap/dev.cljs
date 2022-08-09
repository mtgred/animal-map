(ns animalmap.dev 
  (:require [animalmap.app :refer [mount!]]
            [devtools.core :as devtools]))

(defn ^:dev/after-load reload []
  (mount!))

(defn init! []
  (enable-console-print!)
  (devtools/install!)
  (mount!))
