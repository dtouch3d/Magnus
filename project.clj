(defproject magnus "0.1.0-SNAPSHOT"
  :description "A chess engine in Clojure"
  :license {:name "GPL v3"
            :url "http://www.gnu.org/licenses/gpl.txt"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot magnus.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
