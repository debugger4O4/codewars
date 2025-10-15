// https://www.codewars.com/kata/5bbb8887484fcd36fb0020ca/train/kotlin

package kyu_7.plus_minus_plus_plus_count.kotlin

fun catchSignChange(arr: Array<Int>): Int {
    var count = 0
    for (i in arr.indices) {
        if (i < arr.size - 1) {
            if (arr[i] >= 0 && arr[i + 1] < 0) {
                count++
            }
            if (arr[i] < 0 && arr[i + 1] >= 0) {
                count++
            }
        }
    }
    return count
}