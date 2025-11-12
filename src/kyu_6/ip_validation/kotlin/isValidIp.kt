// https://www.codewars.com/kata/515decfd9dcfc23bb6000006/train/kotlin

package kyu_6.ip_validation.kotlin

fun isValidIp(string: String): Boolean {
    return try {
        val formatted = string.split(".").mapNotNull { s ->
            val trimmed = s.trim()
            if (trimmed.isEmpty()) null
            else trimmed.toInt().takeIf { num -> num in 0..255 }
        }
        formatted.size == 4 && formatted.joinToString(".") == string
    } catch (_: NumberFormatException) {
        false
    }
}