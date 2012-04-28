(ns euler.clojure.problem7
  "By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?"
  (require [euler.clojure.primes :as primes]))

(defn find-nth-prime [n]
  (let [n-found 0 candidate 1 last-prime 1]
    (loop [n-found n-found candidate candidate last-prime last-prime]
      (if (= n n-found)
        last-prime
        (if (primes/prime? candidate)
          (recur (inc n-found) (inc candidate) candidate)
          (recur n-found (inc candidate) last-prime))))))