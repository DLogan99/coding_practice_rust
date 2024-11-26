// Implement two types of sorting algorithms: Merge sort and bubble sort.

fun main ( args: Array<String> ) {
	val arr: MutableList<Int> = mutableListOf<Int>(5,17,99,2,43,22,7,3)

	val final: MutableList<Int> = bubbleSort(arr)
	println(final)

}

fun bubbleSort (n: MutableList<Int>): MutableList<Int> {
	var finalList: MutableList<Int> = n
	for ( i in 0 until n.lastIndex) {
		if ( n[i] > n[i+1] ) {
			val temp: Int = n[i]
			n[i] = n[i+1]
			n[i+1] = temp
			finalList = bubbleSort(n)
		}
	}
	return if (isSorted(finalList)) finalList
	else bubbleSort(finalList)
}

fun mergeSort (n: MutableList<Int>): IntArray {

	val nest: Array<IntArray> =
}

fun isSorted ( n: MutableList<Int> ): Boolean {
	for ( i in 0 until n.lastIndex) {
		if ( n[i] > n[i+1] ) return false
	}

	return true
}