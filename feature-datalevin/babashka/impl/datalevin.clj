(ns babashka.impl.datalevin
  {:no-doc true}
  (:require [datalevin.core]
            [sci.core :as sci]))

(def datalevin-core-namespace
  (sci/copy-ns datalevin.core (sci/create-ns 'datalevin.core)))
