(ns ivory.core
  (:require [org.httpkit.server :as server]))

(defn app [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    "Server is working fine"})

(defn -main []
  (server/run-server app {:port 8080}))
