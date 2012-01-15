(ns euler.clojure.problem3
  "The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?")

(defn find-divisible [n top] 
  (set 
    (filter #(= 0 
                (mod (long n) 
                       %)) 
            (range 1 
                   (inc top)))))

(defn prime? [n] (= 1 (count (find-divisible n (Math/sqrt n)))))

(def n 600851475143)

(print (apply max (filter prime? (find-divisible n (Math/sqrt n)))))

