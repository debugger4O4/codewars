// https://www.codewars.com/kata/61123a6f2446320021db987d/train/kotlin

package kyu_7.previous_multiple_of_three.kotlin

fun prevMultOfThree(n: Int): Int? {
    var num = n
    while (num > 1) {
        if (num % 3 == 0) {
            return num
        } else{
            num /= 10
        }
    }
    return null
}