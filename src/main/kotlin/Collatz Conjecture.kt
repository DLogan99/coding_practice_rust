//Start with a number n > 1. Find the number of steps it takes to reach one using the following process: If n is even, divide it by 2. If n is odd, multiply it by 3 and add 1.

fun main ( args: Array<String> ) {

	do {
		println("Enter the Int")
		val n: Int = readLine()?.toInt()!!

		println("Took ${recCollatz(n)} steps.")
		println("Again?")
	} while ( readLine()?.toUpperCase()=="YES" )
	println("Goodbye")
}

fun recCollatz ( n: Int, steps: Int = 0): Int {
	return if ( n == 1 ) steps
	else if ( n%2 == 0 ) recCollatz( n/2, steps + 1 )
	else recCollatz( (n*3 + 1), steps + 1 )
}