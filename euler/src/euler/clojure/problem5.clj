(ns euler.clojure.problem5
  "2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
   What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?")

(defn divisible-by-range [n range]
  (let [element (last range)]
    (loop [n n element element]
      (if (= element (first range))
        true
        (if (not (= 0 (mod n element)))
          false
          (recur n (dec element)))))))

(defn find-smallest-divisible-by-range [range]
  (let [number 20]
    (loop [range range number number]
      (if (divisible-by-range number range)
        number
        (recur range (+ 20 number))))))

(print (find-smallest-divisible-by-range (range 1 21)))