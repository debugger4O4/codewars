// https://www.codewars.com/kata/56af1a20509ce5b9b000001e/train/kotlin

package kyu_6.salesmans_travel.kotlin

import java.util.regex.Pattern

fun travel(r: String, zipcode: String): String {
    val addresses = r.split(',')
    val records = mutableListOf<Map<String, String>>()
    for (addr in addresses) {
        val matcher = Pattern.compile("^(\\d+) ([a-zA-Z.\\s]+) ([A-Z]{2} \\d+)\$").matcher(addr.trim())
        if (matcher.find()) {
            records.add(mapOf(
                "house" to matcher.group(1),
                "street" to matcher.group(2),
                "zip" to matcher.group(3)
            ))
        }
    }
    val streets = mutableListOf<String>()
    val houses = mutableListOf<String>()
    for (record in records) {
        if (record["zip"] == zipcode) {
            streets.add(record["street"]!!)
            houses.add(record["house"]!!)
        }
    }

    return "$zipcode:${streets.joinToString(",")}/${houses.joinToString(",")}"
}