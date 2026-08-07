package kyu_7.sum_it_continuously

fun add(list: Array<Int>): Array<Int> {
    for (i in 1 until list.size) {
        list[i] = list[i] + list[i - 1]
    }
    return list
}