(ns babashka.impl.core-logic
  {:no-doc true}
  (:require [clojure.core.logic]
            [clojure.core.logic.arithmetic]
            [clojure.core.logic.fd]
            [clojure.core.logic.pldb]
            [clojure.core.logic.protocols]
            [clojure.core.logic.unifier]
            [sci.core :as sci]))

(def core-logic-namespace
  (sci/copy-ns clojure.core.logic (sci/create-ns 'clojure.core.logic)))

(def core-logic-protocols-namespace
  (sci/copy-ns clojure.core.logic.protocols (sci/create-ns 'clojure.core.logic.protocols)))

(def core-logic-arithmetic-namespace
  (sci/copy-ns clojure.core.logic.arithmetic (sci/create-ns 'clojure.core.logic.arithmetic)))

(def core-logic-fd-namespace
  (sci/copy-ns clojure.core.logic.fd (sci/create-ns 'clojure.core.logic.fd)))

(def core-logic-pldb-namespace
  (sci/copy-ns clojure.core.logic.pldb (sci/create-ns 'clojure.core.logic.pldb)))

(def core-logic-unifier-namespace
  (sci/copy-ns clojure.core.logic.unifier (sci/create-ns 'clojure.core.logic.unifier)))
