//Have the user enter a number and find all Prime Factors (if there are any) and display them.
// DOING IT FUNCTIONALLY

fun main (args: Array<String>) {

	val find: Int = callInt()
	var facs: MutableList<Int> = mutableListOf()

	while (test(facs)!=find){
		println(test(facs)); println(facs)
		if(facs.size!=0) findPrime(find)
		else
	}
//	val fFac: Int = findPrime(find)
//	val sFac: Int = findPrime(find/fFac)

}

fun remAd (n: Int, col: MutableList<Int>): Int {
	if (col.size==0) return n
	else {
		val a: Int = n/col[0]
		col.remove(col[0])
		return remAd(a, col)
	}
}

fun test (col: MutableList<Int>): Int{
	var total: Int = 1
	for (i in col) {
		total *= i
	}
	return total
}

fun callInt (): Int {
	println("Enter a number and this program will find all the prime factors if there are any.\n")
	val n = readLine()?.toInt()!!
	println(isPrime(n))
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

	for (i in 2 until n) {
		if(n%i == 0) return false
	}

	return true
}