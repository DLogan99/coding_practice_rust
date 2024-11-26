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

fun mergeSort (n: MutableList<Int>): MutableList<Int> {
	//! Current problem is that it splits the entire array into arrays of 2 ([[1,5], [6,2]]), so after the first sort it would look like this ([[1,2], [5,6]]) - and would try to sort the same breakdown over and over again. Need to loop then reinitialize nest with half again and sort, then loop then reinitialize and sort again, over and over until the array.size = 1.

	val nest: Array<IntArray> = Array(n.size/2) { IntArray(2) }

	if (isSorted(n.toMutableList()))

	if (n.size%2 != 1) {
		for ( i in 0 until n.lastIndex/2 ) {
			when ( n[i] > n[i+1] ) {
				true -> nest[i] = intArrayOf()
				false -> nest[i] = intArrayOf()
			}
			nest[i] = intArrayOf(n[i], n[i+1])
		}
	} else {
		for ( i in 0 until n.lastIndex/2 ) {
			if ( i+1 in 0..n.lastIndex) nest[i] = {

			}
			else nest[i] = intArrayOf(n[i])
		}
	}

	return mergeSort(nest.flatt)
}

fun isSorted ( n: MutableList<Int> ): Boolean {
	for ( i in 0 until n.lastIndex) {
		if ( n[i] > n[i+1] ) return false
	}

	return true
}