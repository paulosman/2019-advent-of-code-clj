(ns advent-of-code.day01
  (:require [clojure.string :as str]))

(defn module-masses [file]
  (str/split-lines (slurp file)))

(defn fuel-required [mass]
  (- (quot mass 3) 2))

(defn total-fuel-required [mass]
  (def fuel (fuel-required mass))

  (if (or (zero? fuel) (neg? fuel))
    0
    (+ fuel (total-fuel-required fuel))))

(defn integer-value [value]
  (Integer/parseInt value))

(def data (map integer-value (module-masses "input/day01.txt")))

(defn -main
  "Advent of Code Day 01"
  [& args]
  (println (reduce + (map fuel-required data)))
  (println (reduce + (map total-fuel-required data))))
