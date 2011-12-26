package euler

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
class Problem3 extends Problem {

	def resolve() = {
		println("Begin problem 3...")
		val number = BigInt(600851475143L)
		var candidate = Math.ceil(Math.sqrt(number.toDouble)).toLong
		var largestPrime:BigInt = 0
		while (candidate != 1 && largestPrime == 0) {
			if (number % candidate == 0) {
				var prime = true
				var i = 2
				while (i <= candidate) {
					if (candidate % i == 0 && candidate != i) {
						prime = false
					}
					i += 1
				}
				if (prime) largestPrime = candidate
			}
			candidate -= 1
		}
		println("Largest prime = " + largestPrime)
	}

}