(ns euler.clojure.problem4
  "A palindromic number reads the same both ways. The largest palindrome made from the product of two
2-digit numbers is 9009 = 91 99.

Find the largest palindrome made from the product of two 3-digit numbers.")

(defn palindrome? [number]
  (= (seq (str number)) (reverse (str number))))

(defn largest-n-digit-palindrome [number-of-digits]
  (let [numbers (map long (range (Math/pow 10 (- number-of-digits 1)) (Math/pow 10 number-of-digits)))]
       (apply max
              (mapcat (fn [x] (filter palindrome?
                                   (map #(* x %)
                                         numbers)))
                   numbers))))

(print (largest-n-digit-palindrome 3))