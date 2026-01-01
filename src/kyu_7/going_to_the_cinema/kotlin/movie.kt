package kyu_7.going_to_the_cinema.kotlin

import kotlin.math.ceil

fun movie(card: Int, ticket: Int, perc: Double): Int {
    var n = 0
    var totalA = 0.0
    var totalB = card.toDouble()
    var currentTicket = ticket * perc

    while (true) {
        n++
        totalA = (ticket * n).toDouble()
        totalB += currentTicket

        if (ceil(totalB) < totalA) {
            return n
        }

        currentTicket *= perc
    }
}
