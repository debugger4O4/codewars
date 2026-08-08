package kyu_6.crack_the_pin.kotlin

import java.security.MessageDigest

fun crack(hashInput: String): String? {
    for (i in 0..99999) {
        val pinStr = String.format("%05d", i)
        val calculatedHash = md5Hash(pinStr)
        if (calculatedHash.equals(hashInput, ignoreCase = true)) {
            return pinStr
        }
    }
    return null
}

fun md5Hash(input: String): String {
    val md = MessageDigest.getInstance("MD5")
    val digest = md.digest(input.toByteArray())
    return digest.joinToString("") { String.format("%02x", it) }
}