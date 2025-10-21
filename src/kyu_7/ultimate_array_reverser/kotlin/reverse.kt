// https://www.codewars.com/kata/5c3433a4d828182e420f4197/train/kotlin

package kyu_7.ultimate_array_reverser.kotlin

// No Kotlin coder would ever use Arrays if they could avoid it,
// even in a challenge called "Ultimate Array Reverser."
// To paraphrase a man in a cave,
// "It's dangerous to go alone, take this [List]"
fun reverse(a: List<String>): List<String> {
    val string = a.joinToString(separator = "").reversed()
    val result = mutableListOf<String>()
    var index = 0
    for (i in a.indices) {
        result.add(string.substring(index, index + a[i].length))
        index += a[i].length
    }
    return result
}