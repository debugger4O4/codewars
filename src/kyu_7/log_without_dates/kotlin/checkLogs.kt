// https://www.codewars.com/kata/64cac86333ab6a14f70c6fb6/train/kotlin

package kyu_7.log_without_dates.kotlin

fun checkLogs(log: Array<String>): Int {
    if (log.isEmpty()) {
        return 0
    }
    val seconds = ArrayList<Int>()
    var result = 1
    log.forEach { time ->
        val timeSplit = time.split(":")
        seconds.add(timeSplit[0].toInt() * 3600 + timeSplit[1].toInt() * 60 + timeSplit[2].toInt())
    }
    for (i in 1 until seconds.size) {
        val diff = seconds[i] - seconds[i - 1]
        if (diff <= 0 || diff > 86400) {
            result++
        }
    }
    return result
}