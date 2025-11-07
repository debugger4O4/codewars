// https://www.codewars.com/kata/59eb8739fc3c49b67a00007d/train/kotlin

package kyu_6.tricky_kotlin_5_go_into_a_class.kotlin

data class Box(var x: Int, var y: Int, var width: Int, var height: Int) {
    fun area() = width * height
    fun rightDown() = width + x to height + y
    fun rightUp() = width + x to height
    fun leftDown() = width to (height + y)
}

operator fun Box.invoke(block: Box.() -> Unit) {
    block(this)
}