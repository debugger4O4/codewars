// https://www.codewars.com/kata/543bfbecdef6345f52000e4d/train/kotlin

package kyu_6.l3375p34k.kotlin

class Leetspeak : Encoder() {

    val map = mapOf(
        'a' to 4,
        'e' to 3,
        'l' to 1,
        'm' to "/^^\\",
        'o' to 0,
        'u' to "(_)"
    )

    override fun encode(source: String?): String {
        var result = ""
        source?.toCharArray()?.forEach { char ->
            result += map.getOrElse(char.lowercaseChar()) {char}
        }
        return result
    }
}

abstract class Encoder {
    abstract fun encode(source: String?): String
}