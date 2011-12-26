(ns euler.clojure.problem1
  "If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
  The sum of these multiples is 23.
  Find the sum of all the multiples of 3 or 5 below 1000."
)

(defn is-multiple-three-or-five [x] (or (= 0 (mod x 3)) (= 0 (mod x 5))))

(print (apply + (filter is-multiple-three-or-five (range 1 1000)))