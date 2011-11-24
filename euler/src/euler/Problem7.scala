package euler

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */
class Problem7 extends Problem {

  def resolve(): Unit = {
    println("Begin problem 7...")
    var limit = 2
    var lastPrime = 0
    var count = 0
    while (count != 10001) {
      if (isPrime(limit)) {
        lastPrime = limit
        count += 1
      }
      limit += 1
    }
    println("Prime number " + count + " = " + lastPrime)
  }

  def isPrime(x:Int): Boolean = {
    var isPrime = true
    var i = 2
    while (i <= x && isPrime) {
      if (x % i == 0 && i != x) isPrime = false
      i += 1
    }
    return isPrime
  }
}