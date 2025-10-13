// https://www.codewars.com/kata/5bd00c99dbc73908bb00057a/train/kotlin

package kyu_7.alphabetical_sequence.kotlin

import java.util.*

var alphabet = "abcdefghijklmnopqrstuvwxyz"

fun alphaSeq(str: String): String {
    var result = ""
    str.lowercase(Locale.getDefault())
        .split("")
        .sorted()
        .filter { it.isNotBlank() }
        .forEach { char -> result += char.uppercase() + char.repeat(alphabet.indexOf(char)) + "," }
    return result.substring(0 , result.length - 1)
}