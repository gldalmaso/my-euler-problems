package euler

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
class Problem5 extends Problem {

  def resolve() = {
    println("Begin problem 5...")
    var smallest = 0
    var i = 1
    val undivisible = (x:Int, y:Int) => x % y != 0
    while (smallest == 0) {
      var divisibleByAll = true
      var j = 20
      while (divisibleByAll && j != 1) {
    	  if (undivisible(i,j)) divisibleByAll = false
    	  j -= 1
      }
      if (divisibleByAll) smallest = i
      i += 1;
    }
    println("Smallest divisible number = " + smallest)
  }

}