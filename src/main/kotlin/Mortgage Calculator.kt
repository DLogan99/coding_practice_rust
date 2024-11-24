import kotlin.math.roundToInt

// Calculate the monthly payments of a fixed term mortgage over given Nth terms at a given interest rate.
// Also figure out how long it will take the user to pay back the loan.
// For added complexity, add an option for users to select the compounding interval (Monthly, Weekly, Daily, Continually).
// Additionally, add principal already paid, and adjustable payments.

fun main (args: Array<String>) {
	// [0] Principal [1] Term [2] Interest
	val vargs: Array<Float> = getVal()

	val mpI: Float = vargs[0] + (vargs[0] * (vargs[2]/100))
	val mp: Float = (mpI/vargs[1] * 100.0F).roundToInt() / 100.0F

	println("The monthly payment will be: $$mp")
}

fun getVal(): Array<Float> {
	println("What is the loan amount? (Format = 1205.75 - only enter numbers in dollar.cent format)\n")
	val principal: Float = readLine()?.toFloat()!!
	println("What is your term length in months?\n")
	val term: Float = readLine()?.toFloat()!!
	println("What is the interest rate?")
	val inter: Float = readLine()?.toFloat()!!

	return arrayOf(principal, term, inter)
}