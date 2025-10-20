// https://www.codewars.com/kata/581c867a33b9fe732e000076/train/kotlin

package kyu_7.fun_with_lists_last_index_of.kotlin

object Kata {
    fun lastIndexOf(head: Node?, value: Any): Int {
        var result = -1;
        var idx = 0
        var current = head
        while (current != null) {
            if (current.data == value) {
                result = idx
            }
            current = current.next
            idx++
        }
        return result
    }
}