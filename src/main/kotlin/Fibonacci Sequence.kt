fun main (args: Array<String>) {
	println("Fib sequence, enter end number: \n")
	val n = readLine()?.toInt()
	println("Sequence here: ${n?.let { fib(it) }}")
}

fun fib (n: Int): MutableList<Int> {
	var x = 1
	var mult = 1
	var fibArr: MutableList<Int> = mutableListOf()
	fibArr.add(1)
	while (x <= n) {
		fibArr.add(x)
		val temp = mult + x
		mult = x
		x = temp
	}
	return fibArr
}