(ns animalmap.release 
  (:require [animalmap.app :refer [mount!]]))

(defn init! []
  (set! *print-fn* (fn [& _])) ;; Ignore println statements in prod
  (mount!))
