
/*global variable systanx*/
val version: Int = 69

/*if you want to have a null variable*/
var greeting: String? = null

fun main() {
    println("\n")
    val name: String = "Thanos"
    println(name)
    println("\n")
    /*val is non-alterable variable*/

    var x: String = "kati"
    println(x)
    println("\n")
    x = "thats_jst_a_test"
    println(x)
    println("\n")

    println(version)
    println("\n")

    greeting = "Hellow there you litle"
    println(greeting)
    greeting = null
}