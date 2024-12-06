fun main (args: Array<String>) {
	println("This program will continue to give you prime numbers until you tell it to stop.")

	var prime: Int = 0

	do {
		prime = pnp(prime + 1)
		println("This is your prime number: ${prime}")

		println("Would you like another prime number? \nPlease type - Yes/No")
		val temp = readLine()!!
	} while (temp.toUpperCase() == "YES")
}

fun pnp (prior: Int = 0): Int {
	return if(isPrime(prior)) prior
	else pnp(prior+1)
}

fun isPrime(n: Int): Boolean {
	if (n <= 2) return true

	for (i in 2 until n) {
		if(n%i == 0) return false
	}

	return true
}