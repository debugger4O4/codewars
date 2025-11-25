// https://www.codewars.com/kata/5ae326342f8cbc72220000d2/train/kotlin

package kyu_6.simple_simple_simple_string_sxpansion.kotlin

fun stringExpansion(s: String): String {
    val builder = StringBuilder()
    var currentRepeatCount = 1
    for (i in s.indices) {
        val ch = s[i]
        when {
            ch.isLetter() -> {
                builder.append(ch.toString().repeat(currentRepeatCount))
            }
            ch.isDigit() -> {
                currentRepeatCount = Character.getNumericValue(ch)
            }
        }
    }

    return builder.toString()
}
