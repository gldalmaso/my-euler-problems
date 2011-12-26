package euler

/**
 * n! means n  (n  1)  ...  3  2  1
 * For example, 10! = 10  9  ...  3  2  1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * Find the sum of the digits in the number 100!
 */
object Problem20 extends Problem {

  override val problemNumber = 20
  
  def resolve(): Unit = {
    var number:BigInt = 1
    (100 to 1 by -1).foreach(x => number = number * x)
    println("Number = " + number)
    var sum = 0
    number.toString().elements.foreach(c => sum += c.toString().toInt)
    println("Sum = " + sum)
  }
  
}