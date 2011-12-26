package euler
import java.util.Date

trait Problem {

	val problemNumber = 0
  
	def init() = {
	  if (problemNumber != 0) println("Begin problem " + problemNumber + "...")
	  var time = new Date().getTime()
	  resolve()
	  time = new Date().getTime() - time
	  println("Resolution time = " + (time / 1000) + " seconds")
	}
	def resolve()
  
}