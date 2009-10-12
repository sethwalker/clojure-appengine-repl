(ns clojure-gae.servlet
  (:require clojure.contrib.server-socket)
  (:gen-class :extends javax.servlet.http.HttpServlet :init start-repl))

(defn -doGet [_ req resp]  
  (.println (.getWriter resp) "doGet"))

(defn -start-repl []
  (println "init")
  (defonce *repl-server* (clojure.contrib.server-socket/create-repl-server 3333))
  [[]])
