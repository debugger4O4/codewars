package kyu_6.tricky_kotlin_0_extension_constructor.kotlin

operator fun kotlin.Int.Companion.invoke(s: String): Int = s.toInt()
operator fun kotlin.Long.Companion.invoke(s: String): Long = s.toLong()
operator fun kotlin.Double.Companion.invoke(s: String): Double = s.toDouble()