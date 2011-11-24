package euler

/**
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 2^1000?
 */
object Problem16 extends Problem {

  override val problemNumber = 16
  
  def resolve(): Unit = {
    var number:BigInt = 1
    (1 to 1000).foreach(x => number = number * 2)
    println("Number = " + number)
    var sum = 0
    println(number.toString().replace(".","").split("E")(0))
    number.toString().replace(".","").split("E")(0).elements.foreach(c => sum += c.toString().toInt)
    println("Sum = " + sum)
  }
  
}