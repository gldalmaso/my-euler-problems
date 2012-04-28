(ns euler.clojure.primes
  "Function for primes")

(defn find-divisible [n top] 
  (set 
    (filter #(= 0 
                (mod (long n) 
                       %)) 
            (range 1 
                   (inc top)))))

(defn prime? [n] (= 1 (count (find-divisible n (Math/sqrt n)))))