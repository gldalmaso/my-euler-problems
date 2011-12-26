package euler
import scala.annotation.tailrec

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
class Problem9 extends Problem {

  val sum1000 = (a:Int, b:Int, c:Int) => a + b + c == 1000
  val pythagorean = (a:Int, b:Int, c:Int) => (a*a) + (b*b) == (c*c)
  
  def resolve(): Unit = {
    println("Begin problem 9...")
    var product = verify(1000, 1000, 1000)
    println("Product = " + product)
  }
  
  @tailrec
  private def verify(a:Int, b:Int, c:Int): Int = {
    if (sum1000(a,b,c) && pythagorean(a,b,c)) {
      return a * b * c
    }
    if (c == 1) return 0
    var (aNew, bNew, cNew) = (a, b, c)
    if (a > 1) {
      aNew -= 1
    } else if (b > 1) {
      bNew -= 1
      aNew = bNew
    } else if (c > 1) {
      cNew -= 1
      aNew = cNew
      bNew = cNew
    }
    verify(aNew,bNew,cNew)
  }

}