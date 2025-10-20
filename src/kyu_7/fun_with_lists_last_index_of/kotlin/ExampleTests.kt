package kyu_7.fun_with_lists_last_index_of.kotlin

import junit.framework.TestCase.assertEquals
import org.junit.Test

class ExampleTests {
    fun runTest(head: Node?, v: Any, refSol: Int) = assertEquals(refSol,Kata.lastIndexOf(head,v))

    fun listFromList(r: List<Any>): Node? = if (r.none()) null else Node(r[0], listFromList(r.drop(1)))

    @Test fun `Basic Tests`() {
        runTest(null, 17, -1)
        runTest(listFromList(listOf(1, 2, 3)), 2, 1)
        runTest(listFromList(listOf("aaa", "b", "abc")), "aaa", 0)
        runTest(listFromList(listOf(17, "17", 1.2)), 17, 0)
        runTest(listFromList(listOf(17, "17", 1.2)), "17", 1)
        runTest(listFromList(listOf(1, 2, 3, 3)), 3, 3)
    }
}