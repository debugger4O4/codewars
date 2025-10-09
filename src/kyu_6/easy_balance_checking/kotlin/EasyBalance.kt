package kyu_6.easy_balance_checking.kotlin

import java.util.*

object EasyBalance {
    fun balance(book: String): String {
        Locale.setDefault(Locale.ENGLISH)
        var total = 0.0
        val spaceRegex = "\\s+".toRegex()
        val amountRegex = "\\d+\\.?\\d?".toRegex()
        val lines = book.trim().replace(Regex("""[^\w\d\s.]"""), "").split("\n")
        var balance = amountRegex.find(lines.first())?.value?.toDoubleOrNull() ?: 0.0
        val result = mutableListOf<String>()

        result.add("Original Balance: ${formatRounded(balance)}")

        for (line in lines.drop(1)) {

            val (checkNumber, category, amount) = line.split(spaceRegex)
            balance -= amount.toDouble()
            total += amount.toDouble()

            result.add("$checkNumber $category $amount Balance ${formatRounded(balance)}")
        }

        val average = total / (lines.size - 1)
        result.add("Total expense  ${formatRounded(total)}")
        result.add("Average expense  ${formatRounded(average)}")

        return result.joinToString("\\r\\n")
    }

    private fun formatRounded(balance: Double) = String.format("%.2f", balance)
}