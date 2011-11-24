package euler

/**
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
class Problem4 extends Problem {

  def resolve(): Unit = {
    println("Begin problem 4..")
    var largestPalindrome = 0
    val range = 100 to 999
    for (i <- range) {
      for (j <- range) {
        var product = i * j
        if (isPalindrome(product) && product > largestPalindrome) largestPalindrome = product
      }
    }
    println("Largest palindrome = " + largestPalindrome)
  }
  
  def isPalindrome(x:Int): Boolean = {
    val value = x.toString()
    var isPalindrome = true
    if (value.length() % 2 != 0) {
      isPalindrome = false
    } else {
      val first = value.substring(0, value.length() / 2)
      val second = value.substring(value.length() / 2, value.length())
      if (!first.equals(second.reverse)) isPalindrome = false
    }
    return isPalindrome
  }
}