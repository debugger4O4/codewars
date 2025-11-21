// https://www.codewars.com/kata/55031bba8cba40ada90011c4/train/kotlin

package kyu_6.hidden_cubic_numbers.kotlin

import java.util.regex.Pattern

object Cubes {

    fun isSumOfCubes(s: String): String {
        val pattern = Pattern.compile("\\d{1,3}")
        val matcher = pattern.matcher(s)
        val cubicNumbers = mutableListOf<Int>()

        while (matcher.find()) {
            val numStr = matcher.group()
            val num = numStr.toInt()
            if (isCubicNumber(num)) {
                cubicNumbers.add(num)
            }
        }

        if (cubicNumbers.isEmpty()) {
            return "Unlucky"
        }

        val sum = cubicNumbers.sum()
        return "${cubicNumbers.joinToString(separator = " ")} $sum Lucky"
    }

    private fun isCubicNumber(num: Int): Boolean {
        var temp = num
        var sum = 0
        while (temp > 0) {
            val digit = temp % 10
            sum += digit * digit * digit
            temp /= 10
        }
        return sum == num
    }
}