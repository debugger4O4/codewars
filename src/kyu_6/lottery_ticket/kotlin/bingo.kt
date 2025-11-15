// https://www.codewars.com/kata/57f625992f4d53c24200070e/train/kotlin

package kyu_6.lottery_ticket.kotlin

fun bingo(ticket: Array<Pair<String, Int>>, win: Int): String {
    var count = 0;
    for (i in ticket.iterator()) {
        val keys = i.first.toCharArray()
        for (k in keys) {
            if (k.code == i.second) {
                count++
            }
        }
    }
    return if (count >= win) "Winner!" else "Loser!"
}