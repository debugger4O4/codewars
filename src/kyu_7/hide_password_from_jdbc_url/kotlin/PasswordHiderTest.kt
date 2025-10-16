package kyu_7.hide_password_from_jdbc_url.kotlin

import junit.framework.TestCase.assertEquals
import org.junit.Test

class PasswordHiderTest {
    @Test
    fun hidePasswordFromConnection() {
        assertEquals("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=*****", PasswordHider.hidePasswordFromConnection("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=12345"))
    }
}