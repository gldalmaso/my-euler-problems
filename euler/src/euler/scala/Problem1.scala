package euler

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
class Problem1 extends Problem {
	def resolve() = {
		println("Begin problem 1...")
		var sum = 0
		val multiples = (3,5)
		for (i <- 0 to 999) {
			var sumValue = false;
			for (j <- multiples.productElements) {
				if (i % j.asInstanceOf[Int] == 0) {
					sumValue = true;
				}
			}
			if (sumValue) sum += i
		}
		println("Sum = " + sum)
	}
}