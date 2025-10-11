// https://www.codewars.com/kata/5bc463f7797b00b661000118/train/kotlin

package kyu_6.plus_minus_plus_plus_sum.kotlin

fun getSolution(arr: IntArray, sum: Int): Boolean {
    if (arr.isNotEmpty()) {
        if (arr.size == 1) return arr[0] == sum
        val newArray = arr.copyOfRange(0, arr.size - 1)
        return getSolution(newArray, sum - arr.last()) or getSolution(newArray, sum + arr.last())
    }
    return false
}
