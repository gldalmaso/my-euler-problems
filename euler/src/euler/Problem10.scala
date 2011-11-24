package euler
import scala.annotation.tailrec

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */
object Problem10 extends Problem {

  def resolve(): Unit = {
    println("Begin problem 10...")
    val limit = 2000000
    val entries = (3 to limit).toArray.par.filter(x => x % 2 != 0)
    val primes = entries.filter(isPrime)
    var sum:Long = 2
    primes.foreach(x => sum += x)
    println("Sum = " + sum)
  }

  def isPrime(entry:Int): Boolean = {
    var i = 3
    var prime = true
    while (i <= Math.sqrt(entry) && prime) {
	  if (entry % i == 0) prime = false
	    i += 1
	  }
    //if (prime) println("Prime = " + entry)
    return prime
  }
  
}