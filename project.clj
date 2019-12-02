(defproject advent-of-code "0.1.0-SNAPSHOT"
  :description "2019 Advent of Code"
  :url "https://github.com/paulosman/2019-advent-of-code-clj"
  :license { :name "Apache License"
             :url "https://www.apache.org/licenses/LICENSE-2.0" }
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :profiles {:day01 {:main advent-of-code.day01}},
  :aliases {"day01" ["with-profile" "day01" "run"]})
