// https://www.codewars.com/kata/5a726f16373c2ee6c60000db/train/kotlin

package kyu_7.hide_password_from_jdbc_url.kotlin

object PasswordHider {
    fun hidePasswordFromConnection(urlString: String): String {
        return Regex("(?<=password=)[^&]*").replace(urlString) { "*".repeat(it.value.length) }
    }
}
