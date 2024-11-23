//Have the user enter a number and find all Prime Factors (if there are any) and display them.
// DOING IT FUNCTIONALLY

fun main (args: Array<String>) {

	val find: Int = callInt()

	val fFac: Int = findPrime(find)
	val sFac: Int = findPrime(find/fFac)

	if (fFac==0||sFac==0) {
		println("Interal Error, please run the program again.")
		return
	}
	else {
		println("The factors of $find are $fFac and $sFac")
	}

}

fun callInt (): Int {
	println("Enter a number and this program will find all the prime factors if there are any.\n")
	val n = readLine()?.toInt()!!
	if (isPrime(n)) {
		println("That number is already a prime, the factors are 1 and $n.")
		return callInt()
	}
	return n
}

fun findPrime (n: Int): Int {

	for (i in 2 until n){
		if (n%i == 0) {
			if (isPrime(i)) return i
			else if (isPrime(n/i)) return n/i
			else  return findPrime(i)
		}
	}

	return 0
}

fun isPrime(n: Int): Boolean {
	if (n <= 2) return true

	for (i in 2..n) {
		if(n%i == 0) return false
	}

	return true
}